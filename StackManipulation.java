public class StackManipulation {

	int stack[]  = new int[5];
	
	int top=0;
	
	void push (int data) {
		stack[top]= data;
		top++;
	}
	
	int pop() {
		top--;
	int	data = stack[top];
	stack[top]=0;
    return data;
		
	}
	
	int peek() { 
		int data= stack[top-1];
		return data;
	}
	
	int size() {
		return top;
	}
	void print() {
		for(int data:stack) {
			System.out.println(data+"");
		}
	}
}


