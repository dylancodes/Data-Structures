public class Stack {
	Node top;
	public Stack()
	{
		top = null;
	}
	
	Node pop(){
		if (top != null)
		{
			Node item = top;
			top = top.next;
			System.out.println(item.data+" popped");
			return item;
		}
		else{
			System.out.println("Stack is Empty");
			return null;
		}
			
	}
	
	void push(int data){
		Node item = new Node(data);
		if (top == null)
		{
			top = item;
		}
		else
		{
			item.next = top;
			top = item;
		}
		System.out.println("Item Pushed. New Top is:"+top.data);
	}
	
	Node peek(){
		if(top==null){
			System.out.println("Cannot pop empty Stack");
			return null;
		}
		System.out.println("Peek :"+ top.data+ " is the current top");
		return top;
		
	}
	
	
	
	public static void main(String[] args){
		Stack newStack = new Stack();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.pop();
		newStack.peek();
		newStack.pop();
		newStack.peek();
		newStack.pop();
		newStack.peek();
	}
	
}
