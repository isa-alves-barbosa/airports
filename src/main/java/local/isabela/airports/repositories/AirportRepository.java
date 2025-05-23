package local.isabela.airports.repositories;


import local.isabela.airports.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface AirportRepository extends JpaRepository<Airport, Long>{
    
}
