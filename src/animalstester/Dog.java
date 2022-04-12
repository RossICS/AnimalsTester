package animalstester;
/**
 * Dog.java
 * @author Administrator
 */
public class Dog extends Mammal {
    
    /**
     * This is the overridden speak for the Dog class
     * @override
     */
    public void speak() {
        System.out.println("BARK!!!");
    }

    //Unique method for Dog Class
    public void wagTail() {
        System.out.println("Tail Wagging...");
    }
}
