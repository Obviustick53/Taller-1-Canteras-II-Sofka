package taller1.proposals;


/**
 * Represents one ordinary travel
 * @author Jose Luis Mora
 */

public class Trip {
    /**
     * Represents the city of origin from which the trip is to begin
     */
    public String originCity;
    /**
     * Represents the destination of the trip
     */
    public String destinationCity;
    /**
     * Represents the means of transportation in which you are going to travel
     */
    protected String transport;
    /**
     * Represents the means of transportation in which you are going to travel
     */
    private float price;
    /**
     * Represents the number of people going on the trip
     */
    public int numberOfPeople;
    /**
     * Represents the hotel where you will be staying
     */
    private String hotel;

    /**
     * Constructor of the Trip class
     */
    public Trip(){

    }

    /**
     * Get the city of origin of the trip
     * @return originCity
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Set the city of origin of the trip
     */
    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    /**
     * Get the destination of the trip
     * @return destinationCity
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Set the destination of the trip
     */
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    /**
     * Get the means of transport for the trip
     * @return transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Set the means of transport for the trip
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
     * Get the price of the trip
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Set the price of the trip
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Get the number of people that going to go to the trip
     * @return numberOfPeople
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Set the number of people that going to go to the trip
     */
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    /**
     * Get the hotel of the trip
     * @return hotel
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * Set the hotel of the trip
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
