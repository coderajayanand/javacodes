import java.util.*;
public class prac6{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the Array Element of " + i + " position");
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("This is your marks of subject " + i);
            System.out.println(marks[i]);
        }
    }
}