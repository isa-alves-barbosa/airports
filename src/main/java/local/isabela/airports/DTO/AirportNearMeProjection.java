/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.isabela.airports.DTO;
/**
  * Interface para mapear os atributos da Query personalizada
  * criada em AirportRepositories.
  * @author KGe
  */    
    
public interface AirportNearMeProjection {
     long getId();
     String getName();
     String getCity();
     String getiataCode();
     double getLatitude();
     double getLongitude();
     double getAltitude();
     double getDistanciaKM();
}
