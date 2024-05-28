import java.io.*;

public class Details
{
    public static void main(String[] args)
    {
        try 
        {
            File f = new File("example.txt");
            System.out.println("FULL PATH: "+f.getAbsolutePath());
            System.out.println("name: "+f.getName());
            System.out.println("size:"+f.length());
            System.out.println("last modified :"+f.lastModified());
            System.out.println("Readable? "+f.canRead());
            System.out.println("Writeable? "+f.canWrite());
            System.out.println("Executeable? "+f.canExecute());

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}