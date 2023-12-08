import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String upperCase = name.toUpperCase();
        System.out.println("Hello "  + upperCase  + " nice to meet you ");
    }
}
