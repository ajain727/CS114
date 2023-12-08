import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class StackPractice {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(33);
//        stack.push(69);
//        stack.push(99);
//        stack.push(100);
//        stack.push(55);
//
//        System.out.println(stack.pop());
//    }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(12);
        queue.add(15);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());


    }
}
