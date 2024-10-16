package Practice.Week4.Task1;
import java.util.Arrays;
/**
 * This class tests various array manipulation methods defined in the ArrayPractice class.
 * It includes tests for:
 * - Summing elements and calculating the average.
 * - Incrementing all elements by 1.
 * - Generating squares and cubes of array elements.
 * - Finding the largest element and its index.
 * - Searching for an element and counting iterations.
 * - Counting odd and even numbers.
 * - Sorting an array in ascending and descending order.
 * - Finding the second largest and smallest elements.
 * - Finding repeated numbers with their frequencies.
 * - Merging two sorted arrays.
 * - Inserting an element at a specific position.
 * - Deleting an element from the array.
 */
public class TestArrayPractice {

    public static void main(String[] args) {
        // Test for sumAndAverage
        System.out.println("Test 1: Sum and Average");
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayPractice.sumAndAverage(arr1);

        // Test for incrementAllElements
        System.out.println("\nTest 2: Increment All Elements by 1");
        int[] arr2 = {1, 2, 3, 4, 5};
        ArrayPractice.incrementAllElements(arr2);
        System.out.println(Arrays.toString(arr2)); // Print updated array

        // Test for squaresAndCubes
        System.out.println("\nTest 3: Squares and Cubes");
        int[] arr3 = {2, 3, 4};
        ArrayPractice.squaresAndCubes(arr3);

        // Test for findLargestElement
        System.out.println("\nTest 4: Find Largest Element");
        int[] arr4 = {22, 24, 25, 1, 204, 3};
        ArrayPractice.findLargestElement(arr4);

        // Test for searchElement
        System.out.println("\nTest 5: Search Element");
        ArrayPractice.searchElement(arr4, 1); // Searching for 1
        ArrayPractice.searchElement(arr4, 100); // Searching for an element not present

        // Test for oddEven
        System.out.println("\nTest 6: Odd and Even Count");
        int[] arr5 = {1, 2, 3, 4, 5, 6};
        ArrayPractice.oddEven(arr5);

        // Test for ascendingDecensding
        System.out.println("\nTest 7: Sort Array Ascending and Descending");
        int[] arr6 = {20, 5, 8, 15, 1};
        ArrayPractice.ascendingDecensding(arr6);

        // Test for secondLargestSmallest
        System.out.println("\nTest 8: Second Largest and Second Smallest");
        int[] arr7 = {12, 35, 1, 10, 34, 1};
        ArrayPractice.secondLargestSmallest(arr7);

        // Test for repeatedNumbersFrequency
        System.out.println("\nTest 9: Repeated Numbers with Frequency");
        int[] arr8 = {1, 2, 2, 3, 3, 3, 4, 5};
        ArrayPractice.repeatedNumbersFrequency(arr8);

        // Test for mergeArrays
        System.out.println("\nTest 10: Merge Two Sorted Arrays");
        int[] arr9 = {1, 3, 5};
        int[] arr10 = {2, 4, 6};
        ArrayPractice.mergeArrays(arr9, arr10);

        // Test for insertElementFromPos
        System.out.println("\nTest 11: Insert Element at a Specific Position");
        int[] arr11 = {1, 2, 4, 5};
        ArrayPractice.insertElementFromPos(arr11, 3, 2);

        // Test for deleteElement
        System.out.println("\nTest 12: Delete Element from Array");
        int[] arr12 = {1, 2, 3, 4, 5};
        ArrayPractice.deleteElement(arr12, 3); // Deleting element 3
        ArrayPractice.deleteElement(arr12, 10); // Trying to delete element not in array
    }
}
