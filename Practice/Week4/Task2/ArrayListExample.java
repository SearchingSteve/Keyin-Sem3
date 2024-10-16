package Practice.Week4.Task2;
import java.util.*;
/**
 * This class demonstrates various operations on an ArrayList in Java.
 * It covers adding elements, inserting at specific indices, removing elements by value and index, 
 * updating elements, retrieving element positions, checking for the existence of elements,
 * getting the size of the ArrayList, and clearing all elements from the list.
 * The example uses a list of String elements to showcase these operations.
 */
public class ArrayListExample {
	public static void main(String[] args) {
		/* Creation of ArrayList: Adding String elements */
		ArrayList<String> obj = new ArrayList<String>();

		/* 1. Adding elements to the ArrayList */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has the following elements: " + obj);

		/* 2. Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Display after adding elements */
		System.out.println("Array list after adding elements: " + obj);

		/* 3. Remove elements from the array list */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Array list after removing elements: " + obj);

		/* 4. Remove element from the given index */
		obj.remove(1);

		System.out.println("Array list after removing element at index 1: " + obj);

		/* 5. Replace element at the given index */
		obj.set(2, "Tom");

		System.out.println("Array list after replacing 3rd element with 'Tom': " + obj);

		/* 6. Get index of an element */
		int pos = obj.indexOf("Tom");
		System.out.println("Index of 'Tom': " + pos);

		/* 7. Get element from a specific index */
		String element = obj.get(2);
		System.out.println("Element at index 2: " + element);

		/* 8. Get size of the array list */
		int size = obj.size();
		System.out.println("Current size of the array list: " + size);

		/* 9. Check if an element exists */
		boolean containsSteve = obj.contains("Steve");
		boolean containsTom = obj.contains("Tom");
		System.out.println("Does the array list contain 'Steve'? " + containsSteve);
		System.out.println("Does the array list contain 'Tom'? " + containsTom);

		/* 10. Clear the array list */
		obj.clear();

		System.out.println("Array list after clearing all elements: " + obj);
	}
}
