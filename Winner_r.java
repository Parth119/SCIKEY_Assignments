import java.util.*;
public class Winner_r {
    public static void main(String args[])
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of array :");
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i= 0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" Marks :");
            arr[i] = sc.nextInt();
        }
        int f=arr[0],s=arr[0],t=arr[0];
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                if(arr[j] > f)
                {
                    f = arr[j];
                }
                if((arr[j] < f) && (arr[j] > s ))
                {
                    s = arr[j];
                }
                if((arr[j] <f ) && (arr[j] < s) && (arr[j] > t))
                {
                    t = arr[j];
                }
            }
        }
        System.out.println("First :"+f+"\nSecond :"+s+"\nThird :"+t);
    }
}
