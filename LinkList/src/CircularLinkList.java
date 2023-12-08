public class CircularLinkList {
    public class Node {
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;
    }
    }
    public Node head = null;
    public Node tail = null;
    public void addnode(int data) {
      Node newnode = new Node(data);
        if (head==null) {
            head=newnode; // first node is assigned to head
            tail=newnode;
        }
         else {
            tail.next=newnode;
            newnode.next=head;
            tail=newnode;
    }
    }
    public void display() {
        Node current=head;
        if (head==null) {
        System.out.println("list is empty");
        return;
        }
        while (current.next!=head) {
            System.out.println(current.data);
            System.out.println(current.next);
            current=current.next;
        }
        System.out.println(current.data);
        System.out.println(current.next);
    }
    public void search(int data){
        Node current = head;
        int I = 1;
        while(current.next !=head){
            if (current.data == data){
                System.out.println("ITEM found at Index " + I);
                return;
            }
            I = I+1;
            current = current.next;
        }

    }
    public void insertHead(int data){
        Node n = new Node(data);
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        n.next = head;
        current.next = n;
        head = n;
    }
    public void insertTail(int data){
        Node n = new Node(data);
        n.next = head;
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = n;
    }
    public void BeginningDeletion(){
        if (head == null) {
            System.out.println("List is empty");
        }
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = current.next;

    }
/*public static void main(String[] args) {
// TODO Auto-generated method stub
linklist llist= new linklist();
llist.addnode(100);
llist.addnode(111);
llist.addnode(12);
llist.addnode(113);
llist.addnode(114);
llist.display();
}*/
}


