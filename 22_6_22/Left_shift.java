import java.util.*;

public class Left_shift {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum length of an array :");
        int max_length = sc.nextInt();
        int array[] = new int[max_length];

        for(int i = 0; i < max_length; i++)
        {
            System.out.print("Enter "+(i+1)+" Element :");
            array[i] = sc.nextInt();
        }

        for(int i= 0; i < max_length; i++)
        {
            array[i] = shift(array[i]);
        }
        display(array,max_length);
    }

    public static int shift(int number)
    {
        int answer=0;
        answer = number << 1;
        return answer;
    }

    public static void display(int array[], int max_length)
    {
        for(int i=0;i<max_length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
