
package local.isabela.airports.DTO;

/**
 *
 * @author ppjata
 */
public class AirportNearMeDTO {
    private long id;
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;

    public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
        this.id = airportProjection.getId();
        this.name = airportProjection.getName();
        this.city =airportProjection.getCity();
        this.iataCode = airportProjection.getiataCode();
        this.latitude = airportProjection.getLatitude();
        this.longitude = airportProjection.getLongitude ();
        this.altitude = airportProjection.getAltitude();
        this.distanciaKM = airportProjection.getDistanciaKM();
    }

    public AirportNearMeDTO() {
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
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }
    
    
}
