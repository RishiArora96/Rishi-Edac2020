package StringAssignment;

import java.util.Scanner;
/*
Write a program which prints the length of each word in a sentence.
Input: I am a Java programmer
Output: 1 2 1 4 10
 */
public class EachWordLength
{
    public static void lengthOfWord(String s)
    {
        if(s.length() == 0)
        {
            System.out.println(0) ;
            return ;
        }
        String inputtedWords[] = s.split("[^a-zA-z]+") ;
        for(int i = 0 ; i < inputtedWords.length;i++)
        {
            System.out.print(inputtedWords[i].length() + " ");
        }

    }
    public static void main(String[] args)
    {
        String s = new Scanner(System.in).nextLine() ;
        lengthOfWord(s);

    }
}
