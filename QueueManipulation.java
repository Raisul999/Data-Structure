public class QueueManipulation {
int queue[] = new int[5];
int front;
int rear;
int size;

void enqueue(int data) {
	if(!isFull()) {
	queue[rear] = data;
	rear++;
	size++;
}
	else {
		System.out.println("Queue is full");
	}
}
int  dequeue() {
	int data=0;
	if(!isEmpty()) {
	 data = queue[front];
	front++;
	size--;
	
}
	else {
		System.out.println("Queue is empty");
	}
	return data;
}

boolean isFull() {
	return size==queue.length ;
}

boolean isEmpty() {
	return size==0;
}

void show() {
	for(int i=0;i<size;i++) {
		System.out.print(queue[front+i]+" ");
	}
}
}
