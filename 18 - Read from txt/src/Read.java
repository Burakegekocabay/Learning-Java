import java.io.*;

public class Read
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("output.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String line;
            while((line =bf.readLine()) != null)
            {
                System.out.println(line);
            }

            bf.close();
        }
        catch(Exception e )
        {
            System.out.print(e.getMessage());
        }
    }
}