import java.util.Scanner;

public class Leap {
    public static void main(String[] args)
    {
        /*
         * A year is a leap year if it is divisible by 4 but not by 100, 
         * or it is  divisible by 400.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) ||(year%400==0))
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not a leap year");
        sc.close();
    }
}
