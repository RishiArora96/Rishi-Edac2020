package StringAssignment;

import java.util.Scanner;

/*
Given a string, check whether it is a formed by concatenating the same string 3 times.
Input: "abcabcabc", Output: true (abc is repeated 3 times)
Input: "abcdabcdabcd", Output: true (abcd is repeated 3 times)
Input: "andandan', Output: false
 */
public class ConcanatingSameString
{
    public static int len(String s)
    {
        int count = 0;
      for(int i = 1 ; i <= s.length() ;i++)
      {
          if(i % 3 == 0)
          {
              count++ ;
          }
      }
        return count ;
    }
    public static boolean check(String s)
    {
        String temp = "" ;
        for(int i = 1 ; i <= Math.sqrt(s.length());i++)
        {
            temp += s.substring(0,len(s)) ;
        }
     return temp.equals(s) ? true : false ;
    }
    public static void main(String[] args)
    {
        String n = new Scanner(System.in).nextLine() ;
        System.out.println(check(n));
        len(n) ;
    }
}
