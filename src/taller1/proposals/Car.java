package taller1.proposals;

import java.util.ArrayList;

/**
 * Represents one ordinary car with some of the most important attributes
 * @author Jose Luis Mora
 */

public class Car {
    /**
     * Represents the car's brand
     */
    public String brand;
    /**
     * Represent the possible colors of the car
     */
    public ArrayList<String> colors;
    /**
     * Represents if the car is mechanic or automatic
     */
    public boolean isMechanic;
    /**
     * Represents the name of the owner
     */
    protected String owner;
    /**
     * Represents the number of the license plate of the car
     */
    public int licensePlate;
    /**
     * Represents the number of kilometers the car has traveled
     */
    private int kilometers;

    /**
     * Constructor of the Car class
     */
    public Car(){

    }

    /**
     * Get the brand of the car
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set the brand of the car
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get one array with the possible colors that the car can have
     * @return color
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Set the possible colors that the car can have
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Get if the car is mechanic or not
     * @return isMechanic
     */
    public boolean isMechanic() {
        return isMechanic;
    }

    /**
     * Set if the car is mechanic or automatic
     */
    public void setMechanic(boolean mechanic) {
        isMechanic = mechanic;
    }

    /**
     * Get the owner of the car
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Set the owner of the car
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Get the number of the license plate of the car
     * @return licensePlate
     */
    public int getLicensePlate() {
        return licensePlate;
    }

    /**
     * Set the number of the license plate of the car
     */
    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Get the number of the kilometers that the car has travelled
     * @return kilometers
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * Set the number of the kilometers that the car has travelled
     */
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
