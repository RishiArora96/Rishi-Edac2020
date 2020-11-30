package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class StackProgram
{
	private int top;
	private int size;
	private int stackarr[];
	public void  Stack(int size)
	{
		this.stackarr=new int [size];
		this.size=size;
		this.top=-1;
	}
	public boolean stackFull()
	{
		return top==size-1;	
	}
	public void push(int element)
	{
		if(stackFull()) {
			System.out.println("Stack is Full can not push element.");
			//System.exit(1);
			}
		System.out.println("");
		stackarr[++top]=element;
	}
	public boolean stackEmpty()
	{
		return top == -1;
	}	
	boolean pop()
	{
		if(stackEmpty())
		{
			for(int i=0;i<size;i++)
			{
				stackarr[i]=0;
			}
			System.out.println("Stack is Empty no element to pop.");
			System.out.println("");
			return false;
		}
		else
		{
			stackarr[top+1]=0;
			int topelement=stackarr[top--];
			stackarr[top+1]=0;
			System.out.println(topelement+" is popped from stack");
			System.out.println("");
			return true;
		}		
	}
	int peek()
	{
		 if(top<0)
         {
			 for(int i=0;i<size;i++)
				{
					stackarr[i]=0;
				}
            System.out.println("Stack is Underflow ");
            return 0;
          }
        else
        {
            int topelement=stackarr[top];
            return topelement;
        }
	}
	public void stackPrint()
	{
		System.out.println(Arrays.toString(stackarr));
	}
	public static void main(String[]args)
	{
		StackProgram stack=new StackProgram();
		stack.Stack(5);
		int topelement;
		System.out.println();
		boolean start=true;
		while(start)
		{
			System.out.println("Press any number to perform the following task");
			System.out.println("1 . Inser Element Into Stack");
			System.out.println("2 . Remove Element From Stack");
			System.out.println("3 . Dispaly Element From Stack");
			System.out.println("4 . Top of the Stack");
			System.out.println("5 . Exit From Stack");
			System.out.println();
			System.out.println("Enter your choice");
			@SuppressWarnings("resource")
			int choice=new Scanner(System.in).nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("This is push method for Stack");
				System.out.println("Insert element into stack");
				@SuppressWarnings("resource")
				int element=new Scanner(System.in).nextInt();
				stack.push(element);
				break;
			}
			case 2:
			{
				System.out.println("This is pop method for Stack");
				stack.pop();
				break;
			}
			case 3:
			{
				System.out.println("This is Stack Display method for Stack");
				System.out.println("Printing stack element");
				System.out.println();
				stack.stackPrint();
				break;
			}
			case 4:
			{
				System.out.println("This will display the top element of array");
				topelement=stack.peek();
				System.out.println("Peek of stack : "+topelement);
				break;
			}
			case 5:
			{
				System.out.println("Done with Stack Operation");
				start=false;
				break;
			}
			default :
			{
				System.out.println("Insert valid choice");
			}
			}
			
			
		}
		
		
	}

}
