import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Eggs: ");
        int eggs = scan.nextInt();
        int gross = eggs/144;
        int dozen = (eggs%144)/12;
        int leftOver = (eggs%144)%12;

        System.out.println("Your number of eyes is " + gross + " gross, " + dozen  + " dozen, and " + leftOver);
    }
}
