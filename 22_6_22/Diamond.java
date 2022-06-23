import java.util.*;
public class Diamond {
    public static void main(String args[])
    {
        int number_rows;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows :");
        number_rows = sc.nextInt();

        for(int i=0; i<number_rows; i++)
        {
            for(int j=number_rows; j>i; j--)
            {
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(int j=0; j<=i-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<number_rows; i++)
        {
            if(i==0)
            {
                continue;
            }else {
                for(int j = 0; j<=i;j++)
                {
                    System.out.print("  ");
                }
                for(int j=number_rows; j>i; j--)
                {
                    System.out.print("* ");
                }
                for(int j=number_rows-1;j>i;j--)
                {
                    System.out.print("* ");
                }
            }

          System.out.println();
        }
    }
}
