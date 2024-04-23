import java.util.*;
public class Average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[50];
        double average=0;
        for (int i = 0; i < 50; i++) 
        {
            System.out.print("Enter the "+(i+1)+". number : ");
            numbers[i]=sc.nextInt();
            average+=numbers[i];
        }
        average = average/50;

        System.out.println("Average: "+average);
        

        int counter=0;
        for (int i = 0; i < numbers.length; i++) 
            if(numbers[i]>average)
                counter++;

        System.out.println(counter+" numbers are above the average.");
    }
}