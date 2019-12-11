
public class TesterDLinkedList {
public static void main(String[]args) {
	ReverseDoublyLinkedlist d = new ReverseDoublyLinkedlist();
	d.insert(2); 
	d.insert(4); 
	d.insert(8); 
	d.insert(10); 

    System.out.println("Original linked list "); 
    d.printList(); 

    d.reverse(); 
    System.out.println(""); 
    System.out.println("The reversed Linked List is "); 
    d.printList();
}
}
