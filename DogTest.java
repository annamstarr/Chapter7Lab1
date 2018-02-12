// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());

        Labrador lab = new Labrador("Lucy", "Brown");
        System.out.println(lab.getName() + " says " + lab.speak());
        
        Yorkshire yorkie = new Yorkshire("Yorkie");
        System.out.println(yorkie.getName() + " says " + yorkie.speak());
        
        System.out.println(lab.getName() + "'s average breed weight is " + lab.avgBreedWeight());
        System.out.println(yorkie.getName() + "'s average breed weight is " + yorkie.avgBreedWeight());
    }
}
