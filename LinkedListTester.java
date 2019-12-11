
public class LinkedListTester {
	
public static void main(String[] args) {	
LinkedList list = new LinkedList();

  list.insert(10);
  list.insert(20);
  list.insert(30);
  list.insert(40);
  list.insert(50);
  list.insert(60);
  list.insertAtStart(100);
  list.insertAt( 80,2);
  list.deleteAt(2);
  
  list.show();
}
}

