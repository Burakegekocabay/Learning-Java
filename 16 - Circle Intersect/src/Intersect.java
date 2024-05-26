import java.util.*;

public class Intersect
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Point p1=new Point();
        Point p2=new Point();
        Circle c1= new Circle();
        Circle c2= new Circle();

        System.out.print("Enter the x , y coordinates and radius of first circle : ");
        p1.x=sc.nextDouble(); p1.y=sc.nextDouble(); c1.radius=sc.nextDouble();
        c1.origin=p1;

        System.out.print("Enter the x , y coordinates and radius of second circle : ");
        p2.x=sc.nextDouble(); p2.y=sc.nextDouble(); c2.radius=sc.nextDouble();
        c2.origin=p2;
        
        sc.close();

        System.out.println("is_Intersect: "+is_Intersect(c1, c2));
    }

    public static boolean is_Intersect(Circle c1 , Circle c2)
    {
        if(Math.sqrt((Math.pow(c2.origin.x - c1.origin.x, 2))+(Math.pow(c2.origin.y -c1.origin.y, 2))) <c1.radius+c2.radius )
            return true;
        else 
            return false;
    }
}