import java.util.concurrent.Callable;

public class CCLtest {

    public static void main(String[] args) {
        CircularLinkList list = new CircularLinkList();
        list.addnode(100);
        list.addnode(200);
        list.addnode(300);
        list.addnode(400);
        list.addnode(500);
        list.insertHead(99);
        list.insertTail(600);
        list.BeginningDeletion();

        list.display();

    }
}
