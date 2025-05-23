
package local.isabela.airports.controllers;

import java.util.List;
import local.isabela.airports.entities.Airport;
import local.isabela.airports.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *Controller de Airports 
 * @author ppjata
 */
@RestController
public class AirportController {
    
   @Autowired
   private AirportService airportService;
   
   /**
    * Endpoint /airports/airport
    * Retorna TODOS os aeroportos da base de dados.
    * @return
    */
   @GetMapping("/airport")
   public List<Airport>findAll(){
       List<Airport> result = airportService.findAll();
       return result;
   }
}
