package animalstester;

/**
 * Mammal class (Mammal.java)
 * This class is used to instantiate objects of the Mammal type
 * @author Administrator
 */
public class Mammal {
    private int itsAge;
    private int itsWeight;
    private String breed;

    /**
     * Constructor
     */
    public Mammal() {
        itsAge = 2;
        itsWeight = 5;
        breed = "mutt";
    }

    /**
     * Setter for Age
     * @return The age of the animal as an integer
     */
    public int getAge() {
        return itsAge;
    }
    
    /**
     * Setter for Weight
     * @return The weight of the animal as an integer
     */
    public int getWeight() {
        return itsWeight;
    }

    /**
     * Getter for age
     * @param newAge The new weight of the animal as an integer
     */
    public void setAge(int newAge) {
        itsAge = newAge;
    }

    public void setWeight(int newWeight) {
        itsWeight = newWeight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    /**
     * Helper method to be implemented separately in the inherited class
     */
    public String speak(){
        return "Some noise";
    }
}
