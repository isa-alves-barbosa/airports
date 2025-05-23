
package local.isabela.airports.service;
import local.isabela.airports.repositories.AirportRepository;
import java.util.List;
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
}
