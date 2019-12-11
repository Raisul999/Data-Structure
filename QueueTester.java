public class QueueTester {
public static void main(String[] agrs) {
	QueueManipulation q = new QueueManipulation();
	
       q.enqueue(1);
       q.enqueue(10);
       q.enqueue(100);
       q.enqueue(1000);
       q.enqueue(10000);
      // q.enqueue(100000);
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       q.show();
}
}
