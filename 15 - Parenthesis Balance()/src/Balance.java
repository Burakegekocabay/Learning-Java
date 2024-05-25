import java.util.Scanner;
import java.util.Stack;

public class Balance 
{

     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String s = sc.nextLine();
        sc.close();

        System.out.println(isBalanced(s));
     }

     public static boolean isBalanced(String s) 
     {
        Stack<Object> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i)=='(')
                stk.push('C');
            
            if(s.charAt(i)==')')
            {
                if(stk.empty())
                    return false;
                else
                    stk.pop();
            }
        }

        if(stk.empty())
            return true;
        else
            return false;
     }
}