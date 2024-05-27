import java.util.*;
import java.io.*;

public class Getsum
{
    public static void main(String[] args)
    {
        try 
        {
            File f = new File("input.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String line;
            int x;
            while((line =bf.readLine())!=null)
            {
                int total=0;
                StringTokenizer st = new StringTokenizer(line,",");
                while(st.hasMoreTokens())
                {
                    x = Integer.parseInt(st.nextToken());
                    total+=x;
                }
                System.out.println("The sum of row: "+total);
            }
            bf.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}