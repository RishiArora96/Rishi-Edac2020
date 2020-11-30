package stackArray002_BRACKETS_MATCH;
import java.util.*;
public class BracketMatch 
{
	static char[] arr = new char[10];
	static char item;
	static int top = -1;
	static boolean isFull()
	{
		if(top == arr.length-1)
			return true;
		else
			return false;
	}
	static boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	static char peek()
    {
        if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return '0';
          }
        else
        {
            char x=arr[top];
            return x;
        }
        
    }
	static void push(char ch)
	{
		if(isFull())
		{
			System.out.println("STACK OVERFLOW ");
		}
		else
		{
			top++;
			arr[top] = ch;
			System.out.println("SUCCESSFULL ADDED IN STACK");
		}
	}
	static int pop()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY ");
			return 0;
		}
		else
		{
				return arr[top--];
		}
	}
	static void stackBracket(char ch)
	{
		if(ch == '[' || ch == '{' || ch == '(')
		{
			push(ch);
		}
		else 
		{
			 switch(ch)
             {
                 case ')':
                     if(peek()=='(')
                     pop();
                     break;
                case ']':
                     if(peek()=='[')
                     pop();
                     break;
               case '}':
                     if(peek()=='{')
                     pop();
                     break;      
                       
             }
		}
	}

	static void stackTraverse()
	{
		if(isEmpty())
		{
			System.out.println("THE STACK IS EMPTY ");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println((char)(arr[i])+" IS IN THE STACK");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER YOUR BRACKET STRING : ");
		String Bracket=sc.nextLine();
		
		for(int i=0;i<Bracket.length();i++)
		{
			
			char ch = Bracket.charAt(i);
			
			stackBracket(ch);
				
		}
		
		stackTraverse();
		
		if(isEmpty())
		{
			System.out.println("BALANCED");
		}
		else
			System.out.println("NOT BALANCED");
	}
}