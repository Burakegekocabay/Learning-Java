import java.io.*;

public class Create
{
    public static void main(String[] args)
    {
        try 
        {
            File f = new File("output.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            for(int i = 0; i<3; i++)
            {
                pw.println((i+1)+"-Hello World");
            }
            pw.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}