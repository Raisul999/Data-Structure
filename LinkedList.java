public class LinkedList {
Node head;
void insert(int data) {
	Node node = new Node(data);
	//node.data= data;
	//node.next= null;		
	
	if (head==null) {
		head = node;
	}
	else {
	Node n =head;
	while(n.next!=null) {
		n = n.next;
	}
	n.next = node;
	}
}
void insertAtStart(int data) {
	Node node = new Node(data);

	node.next = head;
	head = node;
	
}

 void insertAt(int data, int index ) {
	 Node node = new Node(data); 
	 if(index==0) {
		 insertAtStart(data);
	 }
	 else {
	 Node n = head;
	 for(int i=0;i<index-1;i++) {
		 n = n.next;
	 }
	 node.next = n.next;
	 n.next = node;
	 }
 }
 
 void deleteAt(int index) {
	 if(index==0) {
		 head = head.next;
	 }
	 else {
	 Node n = head;
	 Node del= null;
	 for(int i=0;i<index-1;i++) {
		 n= n.next;
	 }
	 del = n.next;
	 n.next = del.next;
	 del = null;
	 
	 }
 }
void show() {
	Node node= head;
	
	while(node.next!=null) {
		System.out.println(node.data+" ");
		node= node.next;
	}
}
	
}

