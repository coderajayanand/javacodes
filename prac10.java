import java.util.*;
public class prac10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = "Ajay";
        String lastName = "Anand";
        String fullName = name+" "+lastName;
        System.out.println(fullName);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        System.out.println(fullName.length());
        System.out.println(fullName.substring(4));
    }
}
