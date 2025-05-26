/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.isabela.airports.DTO;

import local.isabela.airports.entities.Airport;

/**
 *
 * @author ppjata
 */
public class AirportMinDTO {
    private long id;
    private String name;
    private String city;
    private String IataCode;

    public AirportMinDTO(long id, String name, String city, String IataCode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.IataCode = IataCode;
    }
    
    public AirportMinDTO(){   
    }
    
    public AirportMinDTO(Airport airport){
      this.id = airport.getId();
      this.name = airport.getName();
      this.city = airport.getCity();
      this.IataCode = airport.getIataCode();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return IataCode;
    }
    
} 
