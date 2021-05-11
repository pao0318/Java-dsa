class Main{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insert(int new_data){
        Node n=new Node(new_data);
        if(head==null)
            head=n;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    
    public void show(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    
    void deletenode(int key){
        if(head==null)
            return;
            
        Node temp=head;
        if (key==0){
            head=temp.next;
            return;
        }
        
        for(int i=0;temp!=null && i<key-1;i++)
            temp=temp.next;
            
        if (temp.next==null)    
            return;
            
        Node next=temp.next.next;
        temp.next=next;
            
    }
    
    public static void main(String args[]) throws Exception{
        Main list=new Main();
        list.insert(5);
        list.insert(50);
        list.insert(15);
        list.insert(10);
        list.insert(9);
        System.out.println("\nCReated Linked List is: ");
        list.show();
        list.deletenode(2);
        System.out.println("\nLinked List after deletion at pos 4 is:" );
        list.show();
    }
    
    
    
    
}
