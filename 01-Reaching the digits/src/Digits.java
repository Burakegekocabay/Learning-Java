import java.util.Scanner;
public class Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit number : ");
        int number = sc.nextInt();
        int digit1=number/10;
        int digit2=number%10;
        System.out.println("The digits are "+digit1+" and "+digit2);

    } 
}