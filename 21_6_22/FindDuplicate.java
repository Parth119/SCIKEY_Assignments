import java.util.*;
public class FindDuplicate {
    public static void main(String args[])
    {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter "+(i+1)+" Element :");
            arr[i] = sc.nextInt();
        }
        int flag;
        for(int i=0;i<n;i++)
        {
            flag=0;
            int temp = arr[i];
            for(int j=i+1; j<n; j++)
            {
                if(temp == arr[j])
                {
                   flag=1;
                }
            }
            if(flag==1)
            {
                arr[i] = 0;
            }
        }
        for(int i=0; i<n;i++)
        {
            if(arr[i] == 0)
            {
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
