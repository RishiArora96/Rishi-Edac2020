package StringAssignment;

import java.util.Scanner;

/*
Given a string , output another string where the case of the characters is reversed.
Input : "Hello World"
Output : "hELLO wORLD"
 */
public class CaseReversed
{
    public static String caseChar(String inputString)
    {
        String temp = "" ;
        char character[] = inputString.toCharArray() ;
        for (int i = 0 ; i < character.length;i++)
        {
            char c = character[i] ;
            temp += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c) ;
        }
        return temp ;
    }
    public static void main(String[] args)
    {
        String input  = new Scanner(System.in).nextLine() ;
        System.out.println(caseChar(input));

    }
}
