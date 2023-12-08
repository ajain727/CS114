public class BubbleSort_AdityaJain {
    public static void main(String[] args) {

        // array 1 sorting
        int[] arrayToSort1 = {64, 34, 25, 12, 22, 11, 90, 45, 72, 18};
        System.out.println("Original Array 1:");
        printArray(arrayToSort1);
        bubbleSort(arrayToSort1);
        System.out.println("\nSorted Array 1 :");
        printArray(arrayToSort1);

        // array 2 sorting
        int[] arrayToSort2 = {42, 18, 75, 27, 61, 53, 88, 14, 37, 95};
        System.out.println("\nOriginal Array 2:");
        printArray(arrayToSort2);
        bubbleSort(arrayToSort2);
        System.out.println("\nSorted Array 2:");
        printArray(arrayToSort2);

        // array 3 sorting
        int[] arrayToSort3 = {30, 50, 20, 65, 42, 75, 10, 55, 33, 88};
        System.out.println("\nOriginal Array 3:");
        printArray(arrayToSort3);
        bubbleSort(arrayToSort3);
        System.out.println("\nSorted Array 3:");
        printArray(arrayToSort3);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temporaryVariable = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaryVariable;
                    // Display array after each pass
                    System.out.println("Array after iteration " + (i + 1) + ", swapping elements " + (j + 1) + " and " + (j + 2) + ":");
                    printArray(arr);
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
