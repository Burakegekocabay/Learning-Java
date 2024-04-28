import java.util.*;
public class Divisors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        boolean negative=true;
        do 
        {
            
            int number=sc.nextInt();
            if(number<0)
            System.out.println("Only positive number: ");
            else
            {
                negative=false;
                control(number);
            }

        } while (negative);
        sc.close();
        
    }

    public static void control(int number)
    {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        int counter=1;
        while(counter<=number)
        {   
            if(number%counter==0)
            divisors.add(counter);

            counter++;
        }
        System.out.println(divisors);
    }
}