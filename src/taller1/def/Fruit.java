package taller1.def;

import java.util.ArrayList;

/**
 * Represents one fruit with some of the most important attributes
 * @author Jose Luis Mora Serrano
 */

public class Fruit {

    /**
     * Represents the name of the fruit
     */
    public String name;
    /**
     * Represents the average weight of the fruits
     */
    private float averageWeight;
    /**
     * Represents a list of the possible colors that the fruit can have
     */
    public ArrayList<String> colors;

    /**
     * Constructor of the Fruit class
     */

    public Fruit() {
    }

    /**
     * Get the name of the fruit
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Set the name of the fruit
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the average weight of the fruit depending of the fruit
     * @return averageWieght
     */

    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Set the average weight of the fruit depending of the fruit
     */

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Represents the possible colors that one fruit can have
     * @return colors
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Set the posiible colors that one fruit can have
     */

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
