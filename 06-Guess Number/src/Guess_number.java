import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rNumber,input;
        rNumber=random.nextInt(0,100);
        do 
        {
            System.out.print("Guess: ");
            input=sc.nextInt();
            if(input>rNumber)
                System.out.println("Go down");
            else if(input<rNumber)
                System.out.println("Go up");
            else
                System.out.println("You found number");
            
        }while(rNumber!=input) ;
        sc.close();
    }
}
