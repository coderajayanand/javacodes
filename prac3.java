import java.util.*;
public class prac3 {
    public static void printName(String name, String name2)
    {
        System.out.println("Your name is : " + name);
        System.out.println("I love " + name2);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String name2 = sc.next();
        printName(name,name2);
    }
}
