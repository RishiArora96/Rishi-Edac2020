package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
9. Write a program which accepts two string and prints all unique characters which are common in
both stirngs.
Input 1 : "hello world"
Input 2 : "lot of work"
output : 'l' , 'o' , 'w' , 'r'
 */
public class UniqueCharacters
{

    private void common(String s1 , String s2)
    {
       // s1 = s1.trim() ;
        System.out.println(s1);
       // s2 = s2.trim() ;
        System.out.println(s2);
        char[] firstString = s1.replaceAll(" ", "").toCharArray() ;
        System.out.println(Arrays.toString(firstString));
        char[] secondString = s2.replaceAll(" ", "").toCharArray() ;
        System.out.println(Arrays.toString(secondString));

        Set<Character> firstStringSet = new TreeSet<>() ;
        Set<Character> secondStringSet = new TreeSet<>() ;


        for (char c : firstString)
        {
            firstStringSet.add(c) ;
        }
        for (char c:secondString)
        {
            secondStringSet.add(c) ;
        }
        firstStringSet.retainAll(secondStringSet) ;
        System.out.println("Common Characters in alphabetically order \n " +firstStringSet);
        System.out.println("Count : " + firstStringSet.size());
    }


    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in) ;
            String input1 = scanner.nextLine() ;
            String input2 = scanner.nextLine() ;
            UniqueCharacters c = new UniqueCharacters() ;
            c.common(input1,input2);
        }
        catch (Exception e)
        {
            System.out.println("Exception................");
            System.out.println(e.getMessage());
        }

    }
}
