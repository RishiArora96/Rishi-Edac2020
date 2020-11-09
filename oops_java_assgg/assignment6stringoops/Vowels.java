package StringAssignment;
/*
1. Write a program which takes a string and prints the number of vowels, consonants(non-vowels).
 numbers and other characters.
Input: "Hello world 37 1!"
Output: Vowels: 3
 Consonants: 7
 Numbers: 2
 Others: 6
 */
import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string : ");
        line = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
|| ch == 'o' || ch == 'u') {
            ++vowels;
        }
else if((ch >= 'a' && ch <= 'z')) {
            ++consonants;
        }
else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
else if (ch ==' ')
            {
                ++spaces;
            }
else
            ++symbols;
        }

        System.out.println("Vowels" + vowels);
        System.out.println("Constants" + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
        System.out.println("Symbols : " + symbols);
    }
}
