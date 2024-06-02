import java.io.*;

public class Delete
{
    public static void main(String[] args)
    {
        /*
         * WARNING : Do not try with important files, you may not recover file.
         */
        try
        {
            File f = new File("C:\\Users\\Burakege\\Desktop\\testt");
            // Do not forget to change path.
            System.out.println(deletefolder(f));

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean deletefolder(File folder) 
    {
        if(folder.exists())
        {
            File[] files = folder.listFiles();
            for (File f : files) 
            {
                if(f.isDirectory())
                    deletefolder(f);
                else
                    f.delete();
            }
            
        }
        return folder.delete();
    }
}