class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void printList(){
        Node n= head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {

        LinkedList l1=new LinkedList();
        l1.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        l1.head.next=second;
        second.next=third;

        l1.printList();
        
  
    }
}