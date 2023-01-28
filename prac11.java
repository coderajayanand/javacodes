import java.util.*;
public class prac11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        sb.setCharAt(1, 'b');
        System.out.println(sb);
        sb.insert(0, 's');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);
        sb.append('r');
        sb.append('t');
        sb.append('h');
        sb.append('i');
        System.out.println(sb);
    }

}
