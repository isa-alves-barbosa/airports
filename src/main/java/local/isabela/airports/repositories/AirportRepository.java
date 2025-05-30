package local.isabela.airports.repositories;


import java.util.List;
import local.isabela.airports.DTO.AirportNearMeProjection;
import local.isabela.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author ppjata
 */
public interface AirportRepository extends JpaRepository<Airport, Long>{
    List<Airport> findByCityIgnoreCase(String city);
    List<Airport> findByCountryIgnoreCase(String country);
    Airport findByIataCode(String iataCode);


@Query(nativeQuery = true, value = """
 
  SELECT 
  airport.Id,  
  airport.name,     
  airport.city,
  airport.iatacode,                                        
  airport.Latitude,                                                                                           
  airport.longitude,
  airport.altitude,
  SQRT(
    power(airport.Latitude - :latOrigem, 2 )+ 
    power(airport.longitude - :lotOrigem, 2 ))* 60 * 1.852 as distanciaKM   
   
   from AIRPORT 
   order by distanciaKM
   limit 10; """ 
)
List<AirportNearMeProjection>findNearMe(double latOrigem, double lotOrigem);

}
