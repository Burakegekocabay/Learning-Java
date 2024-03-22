public class Prime
{
    public static void main(String[] args)
    {
        int counter=0;

        for (int i = 0; true; i++) //infinite loop until break for looking next prime number;
        {
            
            if(counter!=50) //we need 50 number
            {
                if(isPrime(i))
                {
                    System.out.print(i+" ");
                    counter++;
                    if(counter%10==0) //next line after every 10 number
                        System.out.println();
                }
                    
            }
            else 
                break;
        }
    } 

    public static boolean isPrime(int i)
    {
        int otherNumber=i-1;
        if(i<2)
            return false;

        while(otherNumber!=1)
        {
            if(i % otherNumber==0)
                return false;

            otherNumber--;
        }
        return true;
    }
}
