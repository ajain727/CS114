public class linklist {
    public class node {
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public node head = null;
    public node tail = null;
    public void addnode(int data) {
        node newnode = new node(data);
        if (head==null) {
            head=newnode; // first node is assigned to head
            tail=newnode;
        }
        else {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void insertHead(int data){
        node newNode = new node(data);
        newNode.next = head; // Set the new node's next to the current head
        head = newNode;

    }
    public void insertTail(int data){
        node newNode = new node(data);
        tail.next = newNode;
        tail = newNode;

    }
    void insertAtPosition(int data, int position) {
        node newNode = new node(data);
        node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            // If the position is beyond the end of the list, insert at the end
            insertTail(data);
        } else {
            // Insert the new node between current and current.next
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteHead(){
        head = head.next;
    }

    public void deleteTail(){
        node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Set the next pointer of the second-to-last node to null
        current.next = null;
    }
    public void display() {
        node current=head;
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        while (current!=null) {
            System.out.println(current.data);
            System.out.println(current.next);
            current=current.next;
        }
    }

}

