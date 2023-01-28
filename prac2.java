import java.util.*;
public class prac2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String greet = sc.next();
        switch(greet)
        {
            case "hello": System.out.println("Hey");
            break;

            case "kem_cho": System.out.println("Majama");
            break;

            case "kese_ho": System.out.println("accha hu");
            break;

            default: System.out.println("Mujhe ye basha mhi ati");
            break;
        }
    }
}