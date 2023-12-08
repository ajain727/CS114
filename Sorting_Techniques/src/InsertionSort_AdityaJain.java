public class InsertionSort_AdityaJain {
    public static void main(String[] args) {

        // array 1 sorting
        int[] arrayToSort1 = {64, 34, 25, 12, 22, 11, 90, 45, 72, 18};
        System.out.println("Original Array 1:");
        printArray(arrayToSort1);
        insertionSort(arrayToSort1);
        System.out.println("\nSorted Array 1:");
        printArray(arrayToSort1);

        // array 2 sorting
        int[] arrayToSort2 = {42, 18, 75, 27, 61, 53, 88, 14, 37, 95};
        System.out.println("\nOriginal Array 2:");
        printArray(arrayToSort2);
        insertionSort(arrayToSort2);
        System.out.println("\nSorted Array 2:");
        printArray(arrayToSort2);

        // array 3 sorting
        int[] arrayToSort3 = {30, 50, 20, 65, 42, 75, 10, 55, 33, 88};
        System.out.println("\nOriginal Array 3:");
        printArray(arrayToSort3);
        insertionSort(arrayToSort3);
        System.out.println("\nSorted Array 3:");
        printArray(arrayToSort3);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        // Iterate through the entire array starting from the second element
        for (int i = 1; i < n; ++i) {
            // Select the current element to be inserted into the sorted portion
            int currentValue = arr[i];
            // Initialize a pointer to traverse elements before the current element
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than the current value
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > currentValue) {
                // Shift elements greater than the current value to the right
                arr[j + 1] = arr[j];
                // Move the pointer to compare elements to the left
                j = j - 1;
            }
                // Place the current value in its correct sorted position
            arr[j + 1] = currentValue;
                // Display array after each pass (optional for visualization)
            System.out.println("Array after insertion at position " + i + ":");
            printArray(arr);
            ;
        }
    }

    // Display array function
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
