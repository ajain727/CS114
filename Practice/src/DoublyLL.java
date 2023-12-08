public class DoublyLL {

        public Node head = null;
        public Node tail = null;
        public int size;

        public class Node{
            int value;
            Node next;
            Node prev;
            int size = 0;
                Node(int value){
                this.value = value;
            }
            Node(int value, Node next, Node prev){
                    this.value = value;
                    this.next = next;
                    this.prev = prev;
            }
        }

        public void addHead(int value){
            Node node = new Node(value);

            node.next = head;
            if(head != null) {
                head.prev = node;
            }
            node.prev = null;
            head = node;
        }



    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;

        }
        System.out.println("START");

    }
//    public void displayRev(){
//        Node temp = tail;
//        while(temp != null){
//            System.out.print(temp.value + " -> ");
//            temp = temp.prev;
//
//        }
//        System.out.println("END");
//
//
//    }

}

