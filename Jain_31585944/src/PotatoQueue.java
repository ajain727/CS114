import java.util.ArrayDeque;
import java.util.Queue;
public class PotatoQueue {
    public static String hotPotato(String[] names, int mN) {
        Queue<String> queue = new ArrayDeque<>();
        for (String name : names) {
            queue.add(name);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < mN - 1; i++) {
                String currentPlayer = queue.poll();
                queue.add(currentPlayer);
            }
            String removedChild = queue.poll();
            System.out.println(removedChild + " is out!");
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        String[] names = {"Circuit", "Prachi", "Jirimali", "Arashdeep", "Kaur", "Abhijeet"};
        int mN = 3;
        String winner = hotPotato(names, mN);
        System.out.println("The winner is " + winner + "!");
    }
}
