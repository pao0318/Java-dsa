class LinkedList3{

    Node head;

    class Node{
        Node next;
        int data;
        Node(int d){
         data=d;
            next=null;
        }
    }

    public void push(int new_Data){
        Node new_node= new Node(new_Data);
        new_node.next=head;
        head=new_node;
    }

    public int getCount(){
         Node temp=head;
         int count=0;
         while(temp!=null){
             count++;
             temp=temp.next;
         }
         return count;
    }

    public static void main(String[] args) {
        LinkedList3 obj=new LinkedList3();
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(0);

        System.out.println("Count is"+ obj.getCount());

        
    }
        
    

}
