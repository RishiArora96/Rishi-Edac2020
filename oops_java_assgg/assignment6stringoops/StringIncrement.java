package StringAssignment;

public class StringIncrement
{
    public static void main(String[] args) {
        String input = " There are three bugs and nine features" ;


        System.out.println(input.replaceAll("([a-zA-Z])\\1{2,}", "$1"));

    }
}
