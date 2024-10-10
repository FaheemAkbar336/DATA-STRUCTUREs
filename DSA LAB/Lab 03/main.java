class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;

    }

    class CircularLinkedList{
        Node head;
        void addlast(int data){
            Node node = new Node(data);
            if (head==null){
                head =node;
                node.next=head;
            }
            else{
                Node n= head;
                while(n.next !=head)
                n= n.next;
                n.next=node;
            }

        }
    }
    public class Main{
        public static void main(String[] args) {
            
        }
    }
}