
public class StackTester {
public static void main(String[] agrs) {
	StackManipulation s = new StackManipulation();
	s.push(5);
	s.push(4);
	s.push(3);
	//s.pop();
	//System.out.println(s.peek());
	s.push(2);
	
	s.print();
	System.out.println("Size =  "+s.size());
}
}
