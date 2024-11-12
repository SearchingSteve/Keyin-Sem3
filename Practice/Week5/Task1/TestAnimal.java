package Practice.Week5.Task1;

// Test class to demonstrate functionality
public class TestAnimal {
    public static void main(String[] args) {
        // Test animal super class
        System.out.println("");
        Animal animal = new Animal("New Animal");
        System.out.println(animal.toString()); // Expected: Animal[name=New Animal]

        // Test mammal intermediate class
        Mammal mammal = new Mammal("New Mammal", "Spotted");
        System.out.println(mammal.toString()); // Expected: Mammal[Animal[name=New Mammal], furColor=Spotted]

        // Test cat sub class
        Cat cat = new Cat("KittyCat", "White", true);
        System.out.println(cat.toString()); // Expected: Cat[Mammal[Animal[name=KittyCat], furColor=White],
                                            // isIndoor=true]
        cat.greets(); // Expected output: Meow

        // Test dog sub class
        Dog dog1 = new Dog("Buddy", "Brown", "Golden Retriever");
        System.out.println(dog1.toString()); // Expected: Dog[Mammal[Animal[name=Buddy], furColor=Brown], breed=Golden
                                             // Retriever]
        dog1.greets(); // Expected output: Woof

        // Create second dog to test overloaded greets method
        Dog dog2 = new Dog("Charlie", "Black", "Labrador");
        System.out.println(dog2.toString()); // Expected: Dog[Mammal[Animal[name=Charlie], furColor=Black],
                                             // breed=Labrador]
        dog1.greets(dog2); // Expected output: Woooof
        System.out.println("");
    }
}
