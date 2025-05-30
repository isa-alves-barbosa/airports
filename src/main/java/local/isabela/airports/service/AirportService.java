
package local.isabela.airports.service;
import local.isabela.airports.repositories.AirportRepository;
import java.util.List;
import local.isabela.airports.DTO.AirportMinDTO;
import local.isabela.airports.DTO.AirportNearMeDTO;
import local.isabela.airports.DTO.AirportNearMeProjection;
import local.isabela.airports.entities.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjata
 */
@Service 
public class AirportService {
  
  @Autowired
  private AirportRepository airportRepository;
  
  public List<Airport> findAll(){
      
     List<Airport> result = airportRepository.findAll();
      return result;
  }
  
  /**
   * Retorna DTO Airports filtrado por cidade.
   * @param city
   * @return 
   */
  public List<Airport> findByCity(String city ) {
      List<Airport> result = airportRepository.findByCityIgnoreCase(city);
      return result;
     
  }
  /**
   * Retorna DTO AiportsMinDTO filtrado por country (pais).
   * 
   * @param country
   * @return
   */
  public List<AirportMinDTO> findByCountry(String country){
 
     List<Airport>resultAirport = airportRepository.findByCountryIgnoreCase(country);
      
     List<AirportMinDTO> resultDTO = resultAirport.stream()
    .map(x -> new AirportMinDTO(x)).toList();
      
     return resultDTO;
  }
  
  /**
   * Retorna DTO Airport por iataCode
   * @param iataCode 
   * @return
   */
  public Airport findByiataCode(String iataCode){
      Airport result = airportRepository.findByIataCode(iataCode);
      return result;
  }
  /**
   * @param latitude 
   * @param longitude
   * @return
   */
  
  public List< AirportNearMeDTO> findNearMe (double latitude , double longitude ){
      List<AirportNearMeProjection> resultNearAirports = airportRepository.findNearMe (latitude, longitude);
      
      List<AirportNearMeDTO> resultDTO = resultNearAirports.stream()
              .map(x-> new AirportNearMeDTO(x)).toList();
      return resultDTO;
  }
  }

