package taller1.def;

import java.util.Date;

/**
 * Represents ons ordinary person with some of the most common attributes
 * @author Jose Luis Mora
 */

public class Person {
    /**
     * Represents the name of the person
     */
    public String name;
    /**
     * Represents the first lastname of the person
     */
    public String lastName1;
    /**
     * Represents the second lastname of the person
     */
    public String lastName2;
    /**
     * Represents the birth day of the person
     */
    public Date dateBirth;
    /**
     * Represents the height of the person
     */
    public float height;

    /**
     * Constructor of the Person class
     */
    public Person() {
    }

    /**
     * Set the name of the person
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get the name of the person
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Get the first lastname of the person
     * @return lastName1
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Set the first lastname of the person
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Get the second lastname of the person
     * @return lastName2
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Set the second lastname of the person
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Get the brith date of the person
     * @return dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Set the birth date of the person
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Get the height of the person
     * @return height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Set the height of the person
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
