import java.util.*;
public class Characters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<Character>();
        System.out.print("Enter a string: ");
        String text=sc.nextLine();
        sc.close();
        for(int i=0; i<text.length(); i++)
            set.add(text.charAt(i));
        
        System.out.println(set);
    }
}