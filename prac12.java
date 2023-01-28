import java.util.*;
public class prac12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        int x = s.length();
        int count=0;
        for(int i=0;i<x;i++)
        {
            if((s.charAt(i))==(s.charAt(i+1)))
            {
                count++;
            }
            else
            {
                System.out.print(s.charAt(i));
                System.out.print(count+1);
                count=0;
            }
        }
    }
}