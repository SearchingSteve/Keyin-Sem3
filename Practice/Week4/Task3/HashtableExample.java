package Practice.Week4.Task3;
import java.util.Hashtable;

/**
 * This class demonstrates various operations using the Hashtable class in Java.
 * It covers adding, updating, removing elements, checking for key-value pairs, 
 * getting the size of the Hashtable, and clearing all elements.
 */
public class HashtableExample {
    public static void main(String[] args) {
        
        // 1. Creating Hashtables with different constructors
        // Default constructor with initial capacity 11 and load factor 0.75
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        
        // Constructor with specified initial capacity
        Hashtable<Integer, String> ht2 = new Hashtable<>(10);
        
        // Constructor with specified initial capacity and load factor
        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);

        // 2. Adding key-value pairs using the put() method
        ht1.put(1, "One");
        ht1.put(2, "Two");
        ht1.put(3, "Three");

        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");

        // 3. Displaying the mappings of both Hashtables
        System.out.println("Mappings of ht1: " + ht1);
        System.out.println("Mappings of ht2: " + ht2);

        // 4. Updating an existing value in the Hashtable (changing value for key 2)
        ht1.put(2, "Updated Two");
        System.out.println("Updated Mappings of ht1: " + ht1);

        // 5. Removing a key-value pair from ht2 (removing key 5)
        ht2.remove(5);
        System.out.println("Updated Mappings of ht2 after removing key 5: " + ht2);

        // 6. Checking if a specific key or value exists in the Hashtable
        boolean keyExists = ht1.containsKey(3);
        boolean valueExists = ht1.containsValue("Three");
        System.out.println("Does ht1 contain key 3? " + keyExists);
        System.out.println("Does ht1 contain value 'Three'? " + valueExists);

        // 7. Getting the size of the Hashtable (number of key-value pairs)
        int size = ht1.size();
        System.out.println("Size of ht1: " + size);

        // 8. Clearing all elements from ht1
        ht1.clear();
        System.out.println("Mappings of ht1 after clearing: " + ht1);
    }
}
