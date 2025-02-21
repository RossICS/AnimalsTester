/**
 * Administrator
 * April 12, 2022
 * This is the client code for testing the Mammal, Dog and Cat classes
 */

package animalstester;

public class AnimalsTester {
    public static void main(String[] args) {
        Mammal jackie = new Dog();
        jackie.setAge(10);
        jackie.setWeight(7);
        //System.out.println(jackie.getLikesBellyRubs());
        //jackie.setBreed("Poodle");

        System.out.println("Dog object jackie:");
        System.out.println("age: " + jackie.getAge());
        System.out.println("weight: " + jackie.getWeight());
        System.out.println("breed: " + jackie.getBreed());
//        jackie.speak();
//        jackie.wagTail();

        System.out.println("-------------------------");

        Mammal garfield = new Cat(true);
        garfield.setBreed("Siamese");
        System.out.println("Cat object garfield:");
        System.out.println("age: " + garfield.getAge());
        System.out.println("weight: " + garfield.getWeight());
        System.out.println("breed: " + garfield.getBreed());
        //garfield.speak();
        
        Mammal genericPet = new Mammal();
        
        Mammal[] pets = {jackie,garfield, genericPet};
        
        for (Mammal pet: pets){
            System.out.println(pet.speak());
        }

    }
}
