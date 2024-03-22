import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        sc.close();

        if(isPalindrome(input))
            System.out.println(input+" is a palindrome words");
        else
            System.out.println(input+" is not a palindrome words");


    } 



    public static boolean isPalindrome(String input)
    {
        int len = input.length();;
        int repeat=len/2;
        if(len==1)
            return false;
        for (int i = 0; i <repeat; i++)
        {
            
            if(input.charAt(0)!=input.charAt(len-1))
                return false;
            
            input=input.substring(1, len-1);
            len = input.length();
        }
        return true;
        
    }
}
