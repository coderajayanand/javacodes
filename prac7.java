import java.util.*;
public class prac7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int x = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("The number is found on " + i + " index");
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println("Key was not found !!");
        }
    }
    
}
