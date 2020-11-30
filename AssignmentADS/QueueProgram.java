package DataStructure;

class Queue
{
	private int front,rear;
	private int lengthofQueue;
	private static int []queueArr;
	
	Queue(int length)
	{
		front=0;
		rear=0;
		this.lengthofQueue=length;
		queueArr=new int[length];
	}
	/*boolean queueFull()
	{
		if(rear==lengthofQueue)
		{
			return true;
		}
		else
			return false;
	}
	
	boolean queueEmpty()
	{
		if(rear==front)
		{
			return true;
		}
		else
			return false;
	}*/
	
	public void enqueueQ(int element) {
		if(lengthofQueue!=rear)
		{
			queueArr[rear]=element;
			rear++;
		}
		else
		{
			System.out.println("Queue is full");
			return;
		}
		return;
	}
	public void dequeueQ()
	{
		if(front!=rear)
		{
			for(int i=0;i<rear-1;i++)
			{
				queueArr[i]=queueArr[i+1];
			}
			if(rear<lengthofQueue)
			{
				queueArr[rear]=0;
			}
			rear--;
			return;
		}
		else
		{
			System.out.println("Queue is empty");
		}
		return;
	}
	public void displayQ() 
	{
		if(front!=rear)
		{
			for(int i=front;i<rear;i++)
			{
				System.out.print(queueArr[i]+" ");
			}
			System.out.println(" ");
			return;
		}
		else
		{
			System.out.println("Queue is Empty");			
		}
		return;
	}
	public void frontQ() 
	{
		if(front!=rear)
		{
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Front Element is "+queueArr[front]);
		return;
			
	}
	
}

public class QueueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue(5);
		queue.displayQ();
		queue.enqueueQ(30);
		queue.enqueueQ(37);
		queue.enqueueQ(80);
		queue.enqueueQ(60);
		queue.enqueueQ(57);
		System.out.println("Displaying Queue");
		queue.displayQ();
		queue.enqueueQ(50);
		queue.displayQ();
		queue.dequeueQ();
		queue.dequeueQ();
		System.out.println("After Two dequeue");
		queue.displayQ();
		queue.frontQ();

	}

}
