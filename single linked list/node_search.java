class LinkedSearch{
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
        Node new_Node=new Node(new_Data);
        new_Node.next=head;
        head=new_Node;
    }

    public boolean search(Node head,int x){
        Node temp=head;
        while(temp!=null){
            if(temp.data==x)
            return true;
            

            temp=temp.next;
        }
        return false;

    }

    public static void main(String args[]) 
    { 
  
        //Start with the empty list 
        LinkedSearch obj = new LinkedSearch(); 
  
        /*Use push() to construct below list 
        14->21->11->30->10  */
        obj.push(10); 
        obj.push(30); 
        obj.push(11); 
        obj.push(21); 
        obj.push(14); 
  
        if (obj.search(obj.head, 12)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 



