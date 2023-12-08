public class SelectionSort_AdityaJain {
    public static void main(String[] args) {
        int[] arrayToSort1 = {64, 34, 25, 12, 22, 11, 90, 45, 72, 18};
        System.out.println("Original Array 1:");
        printArray(arrayToSort1);
        selectionSort(arrayToSort1);
        System.out.println("\nSorted Array 2:");
        printArray(arrayToSort1);

        int[] arrayToSort2 = {42, 18, 75, 27, 61, 53, 88, 14, 37, 95};
        System.out.println("\nOriginal Array 2:");
        printArray(arrayToSort2);
        selectionSort(arrayToSort2);
        System.out.println("\nSorted Array 2:");
        printArray(arrayToSort2);

        int[] arrayToSort3 = {30, 50, 20, 65, 42, 75, 10, 55, 33, 88};
        System.out.println("\nOriginal Array 3:");
        printArray(arrayToSort3);
        selectionSort(arrayToSort3);
        System.out.println("\nSorted Array 3:");
        printArray(arrayToSort3);

    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int indexOfMinElement = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indexOfMinElement]) {
                    indexOfMinElement = j;
                }
            }

            // Swap the found minimum element with the current element
            swap(arr, i, indexOfMinElement);

            // Display array after each pass
            System.out.println("Array after selection at position " + (i + 1) + ":");
            printArray(arr);
        }
    }

    // Swap function
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Display array function
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
