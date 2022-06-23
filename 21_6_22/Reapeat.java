import java.util.*;

public class Reapeat {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of array :");
        n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " Element :");
            arr[i] = sc.nextInt();
        }
        int count, count1 = 0, flag;
        int freq[] = new int[n];
        int freq_n[] = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            count = 0;
            flag = 0;
            for (int j = 0; j < n; j++) {
                if (temp == arr[j]) {
                    count++;
                    flag = 1;
                }
            }
            if (flag == 1) {
                freq[count1] = arr[i];
                freq_n[count1] = count;
                count1++;
            }
        }
        
        int temp_arr[] = new int[n];
        int temp;
        for(int i=0;i<freq.length;i++)
        {
            
                for(int j=0;j<freq.length;j++)
                {
                    for(int k=j+1; k<freq.length; k++)
                    {
                        if(freq[j] == freq[k])
                        {
                            freq_n[j]=0;
                        }    
                    }
                }
                if(freq_n[i] >=2 )
                {
                    System.out.print("\nNumbers :"+freq[i]+" Frequency :"+freq_n[i]);
                }
                
            
        }
        System.out.println();

        
    }
}
