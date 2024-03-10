import java.util.Scanner;

public class Temperatures
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        int Fahrenheit=sc.nextInt();
        double celsius = (5.0 / 9) * (Fahrenheit - 32);
        System.out.println(Fahrenheit+" Fahrenheit equals "+celsius+" Celsius");

    } 
}