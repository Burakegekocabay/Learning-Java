import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        reverse(list);
    }

    public static void reverse(List<Integer> list)
    {
        LinkedList<Integer> revList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) 
            revList.addFirst(list.get(i));

        System.out.println(revList);
    }
}