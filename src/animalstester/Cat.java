package animalstester;

/**
 * Cat.java
 * @author Administrator
 */
public class Cat extends Mammal {
    private boolean isAnAHole = true;
    
    public Cat (boolean isAnAHole){
        this.isAnAHole = isAnAHole;
    }
    
    public String speak() {
        return "Meow!!!";
    }
}
