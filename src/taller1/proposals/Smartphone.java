package taller1.proposals;

/**
 * Represents one smartphone with some of the most important attributes
 * @author Jose Luis Mora
 */

public class Smartphone {
    /**
     * Represents the name of the smartphone's brand
     */
    public String brand;
    /**
     * Represents the number of the smarthphone
     */
    public int number;
    /**
     * Represents the amount of cameras that tha smartphone has
     */
    public int cameras;
    /**
     * Represents the password in order to turn on the smartphone
     */
    private String password;
    /**
     * Represents the name of the owner of the smartphone
     */
    protected String owner;

    /**
     * Constructor of the Smartphone class
     */
    public Smartphone(){

    }

    /**
     * Get the brand of the smartphone
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set the name of the brand of the smartphone
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get the number of the smartphone
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the smartphone's number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Get the amount of the cameras that the smartphone has
     * @return cameras
     */
    public int getCameras() {
        return cameras;
    }

    /**
     * Set the amount of the cameras that the smartphone can has
     */
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    /**
     * Get the password of the smartphone
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the smartphone
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the name of the smartophone's owner
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Set the name of the smartphone's owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
