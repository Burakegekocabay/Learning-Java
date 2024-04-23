import java.util.*;
public class Evaluation
{
    public static void main(String[] args)
    {
        //50 student
        //100 question
        Random random = new Random();
        char[][] list=new char[50][100]; 
        char[] key=new char[100];
        for (int i = 0; i < key.length; i++) 
            key[i]=(char)random.nextInt(65,69);

            for (int j = 0; j < list.length; j++) 
            {
                
                for (int k = 0; k < list[0].length; k++) 
                {
                    list[j][k]=(char)random.nextInt(65,70); //for: A B C D ' '
    
                    if(list[j][k]=='E') //if 'E' it change to empty
                        list[j][k]=' ';
                }
    
            }
            control(list,key);
    }


    public static void control(char[][] list,char[] key)
    {
        int counter_true,counter_false,counter_empty;
        double point;
        int temp;
        double[] points =new double[50];
        for (int j = 0; j < list.length; j++) 
        {
            counter_true=0;
            counter_empty=0;
            counter_false=0;
            point=0;
            temp=0;
            for (int k = 0; k < list[0].length; k++) 
            {
                if(key[k]==list[j][k])
                    counter_true++;
                else if(list[j][k]==' ')
                    counter_empty++;
                else
                    counter_false++;
            }
            point =counter_true;
            temp=counter_false;
            while(temp!=0)
            {
                point=point-0.25;
                temp--;
            }
            points[j]=point;
            
        System.out.println("Student "+(j+1)+": "+counter_true+" correct,"+counter_false+" incorrect,"+counter_empty+" empty answers ="+point+" point");
        }

    }
}