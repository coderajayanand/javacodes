import java.util.*;
public class prac4 {
    public static void CalSum(int a, int b)
    {
        System.out.println(a+b);
    }
    public static int otherSum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //CalSum(a,b);
        int sum = otherSum(a,b);
        System.out.println(sum);
    }
}
