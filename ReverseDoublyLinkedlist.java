
public class ReverseDoublyLinkedlist {
	
Node head;	

 class Node { 
	  
    int data; 
    Node next, prev; 

    Node(int d) { 
        data = d; 
        next = prev = null; 
    } 
} 
 
void reverse() {

	Node temp ;
	Node current = head;
	while(current!=null) {
		temp = current.prev;
		current.prev = current.next;
		current.next = temp;
		current = current.prev;
	}
	
	if(head!=null) {
		head = head.prev;
		
	}
}

void insert(int data) {
	Node node = new Node(data);
	node.prev = null; 
	
	node.next = head; 

	if (head != null) { 
        head.prev = node; 
    } 

    head = node; 
	
}

void printList() {
	Node node=head;
    while (node != null) { 
        System.out.print(node.data + " "); 
        node = node.next; 
    } 
}
}
