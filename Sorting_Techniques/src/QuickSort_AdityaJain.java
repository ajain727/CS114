public class QuickSort_AdityaJain {
    public static void main(String[] args) {
        int[] arrayToSort1 = {64, 34, 25, 12, 22, 11, 90, 45, 72, 18};
        System.out.println("Original Array 1:");
        printArray(arrayToSort1);
        quickSort(arrayToSort1, 0, arrayToSort1.length - 1);
        System.out.println("\nSorted Array 1:");
        printArray(arrayToSort1);

        int[] arrayToSort2 = {42, 18, 75, 27, 61, 53, 88, 14, 37, 95};
        System.out.println("\nOriginal Array 2:");
        printArray(arrayToSort2);
        quickSort(arrayToSort2, 0, arrayToSort2.length - 1);
        System.out.println("\nSorted Array 2:");
        printArray(arrayToSort2);

        int[] arrayToSort3 = {30, 50, 20, 65, 42, 75, 10, 55, 33, 88};
        System.out.println("\nOriginal Array 3:");
        printArray(arrayToSort3);
        quickSort(arrayToSort3, 0, arrayToSort2.length - 1);
        System.out.println("\nSorted Array 3:");
        printArray(arrayToSort3);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and obtain the partitioning index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partitioning index
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);

            // Display array after each iteration (optional for visualization)
            System.out.println("Array after partitioning:");
            printArray(arr);
        }
    }

    // Partitioning function to determine the correct position of the pivot element
    static int partition(int[] arr, int low, int high) {
        // Select the pivot element (here, choosing the last element as pivot)
        int pivot = arr[high];
        int i = low - 1; // Index of the smaller element

        // Traverse the array from low to high-1
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot element)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partitioning index
        return i + 1;
    }

    // Display array function
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
