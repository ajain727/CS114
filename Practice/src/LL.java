public class LL {
    public Node head = null;
    public Node tail = null;
    public int size;
    public class Node{
        int value;
        Node next;
        int size = 0;
          Node(int value){
              this.value = value;
             // this.next = null;

        }
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void addHead(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
        if (tail == null){
            tail = head;

        }
    }

    public void addNode(int value){
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;

        }
        else {
            tail = node;
            tail.next = node;
        }

    }
    public void insertNode(int value, int index){
        if(index == 0){
            addHead(value);
            size++;
            return;
        }
        if (index == size){
            addTail(value);
            size++;
            return;
        }
        if(index > size) {
            System.out.println("The index doesn't exist");
        }
        else{
            Node temp = head;
            for( int i = 1; i<index ; i++){
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;

        }


        }

    public void addTail(int value){
        if(tail == null){
            addHead(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        node.next = null;
        size++;
    }
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        int value = tail.value;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return value;

    }
    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int value  = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.print("END");
        }


    }


