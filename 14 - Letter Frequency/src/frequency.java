import java.util.*;

public class frequency {

     public static void main(String[] args) 
     {
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String line = sc.nextLine();
        sc.close();

        for (char c : line.toCharArray())
        {
            if (!map.containsKey(c))
            map.put(c, 1);
            
            else 
            {
                int temp = map.get(c);
                map.put(c,temp+1);
            } 
        }
        System.out.println(map);
        

     }

    
}