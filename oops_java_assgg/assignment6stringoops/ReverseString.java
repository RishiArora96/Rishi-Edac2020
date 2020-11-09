package StringAssignment;

import java.util.Scanner;

/*
8. Write a program to reverse a string.
Input : "hello"
Output : "olleh"
Input : "Hello World"
Output : "dlrow olleh"
 */
public class ReverseString
{
    private static String reverse(String inputString)
    {
        String rev = "" ;
        for(int i = inputString.length()-1 ;i >= 0;i--)
        {
            rev += inputString.charAt(i) ;
        }
        System.out.println(rev);
        return rev ;
    }
    public static void main(String[] args)
    {
        System.out.println("Reverse of STRING");
        String input = new Scanner(System.in).nextLine() ;
        reverse(input) ;
    }
}
