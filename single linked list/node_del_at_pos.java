class LinkedList2{

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;

        }
    }

    public void push(int new_Data){
        Node new_Node=new Node(new_Data);
        new_Node.next=head;
        head=new_Node;
    }

    void deleteNode(int key){
        if (head==null){
            return;
        }
        Node temp=head;

        if (key==0){
            head=temp.next;
            return;
        }

        for(int i=0; temp!=null&& i<key-1;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null)
        return;


        Node next=temp.next.next;

        temp.next=next;


    }

    void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }


    public static void main(String[] args) {
        LinkedList2 obj= new LinkedList2();

        obj.push(7);
        obj.push(1);
        obj.push(3);
        obj.push(2);
        obj.push(8);
        System.out.println("\nCReated Linked List is: ");
        obj.printList();

        obj.deleteNode(4);
        System.out.println("\nLinked List after deletion at pos 4 is:" );
        obj.printList();
    }
}