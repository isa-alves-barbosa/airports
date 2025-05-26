package local.isabela.airports.controllers;

import java.util.List;
import local.isabela.airports.DTO.AirportMinDTO;
import local.isabela.airports.entities.Airport;
import local.isabela.airports.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
   public List<Airport>fidAll(){
       List<Airport> result = airportService.findAll();
       return result;
   }

/**
 * Endpoint /airports/city/{cityName}
 * preparando para devolver código de status conforme 
 * padronização REST.
 * @param cityName 
 * @return 
 */
@GetMapping ("/city/{cityName}")
public ResponseEntity<List<Airport>> findByCityIgnoreCase(@PathVariable String cityName){
 List<Airport> result = airportService.findByCity(cityName);

if (result.isEmpty()) {
 //Ops..lista vazia...
 //notFound devolve 404
 return ResponseEntity.notFound().build();
}else {
 //Eba! Tem dados!
 //ok devolve 200
 return ResponseEntity.ok(result);

}

}
@GetMapping("/country/{countryName}")
public ResponseEntity<List<AirportMinDTO>> findByCountryIgnoreCase(@PathVariable String countryName){
    List<AirportMinDTO>result = airportService.findByCountry(countryName);
    if (result.isEmpty()){
        //Ops..lista vazia...
        //notFound devolve 404
        return ResponseEntity.notFound().build();
    }else{
        //Eba !Tem dados!
        //ok devolve 200
        return ResponseEntity.ok(result);
    }
}
}
