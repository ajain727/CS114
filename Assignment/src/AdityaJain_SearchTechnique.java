import java.util.Scanner;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class SortedLinkedList {
    ListNode head;

    public void insert(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean binarySearch(int target) {
        return binarySearchRecursive(head, target);
    }

    private boolean binarySearchRecursive(ListNode current, int target) {
        if (current == null) {
            return false;
        }

        if (current.value == target) {
            return true;
        } else if (current.value > target) {
            return false; // Since the list is sorted, if the current node's value is greater than the target, the target won't be present.
        } else {
            return binarySearchRecursive(current.next, target);
        }
    }
}

public class AdityaJain_SearchTechnique {
    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();

        // Inserting at least 10 sorted integers
        sortedList.insert(1);
        sortedList.insert(3);
        sortedList.insert(5);
        sortedList.insert(7);
        sortedList.insert(9);
        sortedList.insert(11);
        sortedList.insert(13);
        sortedList.insert(15);
        sortedList.insert(17);
        sortedList.insert(19);

        // Prompt user for target value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Call binarySearch method and display the result
        boolean result = sortedList.binarySearch(target);
        if (result) {
            System.out.println("Target value found in the linked list.");
        } else {
            System.out.println("Target value not found in the linked list.");
        }
    }
}