

class Mainniac{

	public static void main(String[] args) {
        Stack nums=new Stack();
		nums.push(15);
		nums.push(8);
		nums.push(10);
		nums.pop();
		
		System.out.println(nums.pop());
		nums.show();
        
    }
}
	 
	

class Stack{
    int stack2[]=new int[5];
    int top=0;
    public void push(int data){
        stack2[top]=data;
        top++;
        
    }
    public int pop(){
        int data;
        top--;
        data=stack2[top];
        stack2[top]=55;
        return data;
    }
    
    
    
    
    
    public void show(){
        for (int n:stack2) {
            System.out.print(n+" ");

        }
    }
    
    
}


