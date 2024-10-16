package Practice.Week4.Task1;
import java.util.Arrays;
/**
 * This class provides various array manipulation methods. The methods included cover:
 * - Summing elements of an array and calculating the average.
 * - Incrementing every element in an array.
 * - Storing squares and cubes of elements in new arrays.
 * - Finding the largest element and its index in an array.
 * - Searching for an element in an array and returning its index.
 * - Counting the number of odd and even numbers in an array.
 * - Sorting an array in both ascending and descending orders.
 * - Finding the second largest and second smallest elements.
 * - Printing repeated numbers and their frequencies.
 * - Merging two sorted arrays into one sorted array.
 * - Inserting an element at a specific position in an array.
 * - Deleting a specified element from an array.
 */
public class ArrayPractice {
    // 1. Calculate Sum & Average of all elements of an integer Array size 10.
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // 2. Increment Every Element of the Array by One & Print Incremented Array
    public static void incrementAllElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        System.out.println("Array after incrementing all elements by 1:");
    }

    // 3. Input an Array, Store the Squares and cubes of these elements in new
    // Arrays & Print those.
    public static void squaresAndCubes(int[] arr) {
        int[] squares = new int[arr.length];
        int[] cubes = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            squares[i] = arr[i] * arr[i];
            cubes[i] = arr[i] * arr[i] * arr[i];
        }
        System.out.println("Squares:");
        for (int i = 0; i < squares.length; i++){
            System.out.print(squares[i] + " ");
        }
        System.out.println("\nCubes:");
        for (int i = 0; i < cubes.length; i++){
            System.out.print(cubes[i] + " ");
        }
    }

    // 4. Find largest element present in an integer array. It must also print the
    // location or index at which maximum element occurs in array.
    public static void findLargestElement(int[] arr){
        int max = arr[0];
       int index = 0;
       for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }
    System.out.println("Largest element: " + max);
    System.out.println("Index of largest element: " + index);
    }
    // 5. Read an Array and Search for an Element - prints element, index and number of iterations
    public static void searchElement(int[] arr, int element){
        int iterations = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                System.out.println("Element " +element+"found at index "+i + "after " + iterations + " iterations");
                break;
            }
            else{
                iterations++;
            }
        }
    }

    // 6. Print the Number of Odd & Even Numbers in an Array
    public static void oddEven(int[]arr){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }

    // 7. Sort the Array in an Ascending Order and Descending Order
    public static void ascendingDecensding(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in ascending order:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray in descending order:");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    // 8. Find the Second Largest & Smallest Elements in an Array
    public static void secondLargestSmallest(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest element: " + arr[1]);
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }

    // 9. Print All the Repeated Numbers with Frequency in an Array
    public static void repeatedNumbersFrequency(int[] arr){
        int[] freq = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited){
                freq[i] = count;
            }
        }
        System.out.println("Repeated numbers with frequency:");
        for(int i = 0; i < freq.length; i++){
            if (freq[i] != visited && freq[i] > 1){
                System.out.println(arr[i] + " occurs " + freq[i] + " times.");

            }
        }
    }

    // 10. Merge the Elements of 2 Sorted Array
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }
            else{
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length){
            mergedArray[k++] = arr2[j++];
        }
        System.out.println("Merged array:" + Arrays.toString(mergedArray));
        return mergedArray;
    }

    // 11. Insert an Element in a Specified Position in a given Array
    public static void insertElementFromPos(int[] arr, int element, int position){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            if (i < position){
                newArray[i] = arr[i];
            }
            else{
                newArray[i + 1] = arr[i];
            }
        }
        newArray[position] = element;
        System.out.println("Array before inserting element:" + Arrays.toString(arr));
        System.out.println("Array after inserting element:" +Arrays.toString(newArray));
    }

    // 12. Delete the Specified Integer from an Array
    public static int [] deleteElement(int[] arr, int element){
        
        int count = 0;
        boolean found = false;
        for (int num : arr){
            if (num == element){
               count++;
               found = true;
            }
        }
        if (!found){
            System.out.println("Element not found in the array.");
            return arr;
        }

        int[] newArray = new int[arr.length - count];
        int index = 0;
        for (int num : arr){
            if (num != element){
                newArray[index++] = num;
            }
        }
       

        System.out.println("Array before deleting element:" + Arrays.toString(arr));
        System.out.println("Array after deleting element:" + Arrays.toString(newArray));
        return newArray;
        
    }
}
