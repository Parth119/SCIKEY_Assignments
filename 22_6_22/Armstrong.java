import java.util.*;
import java.math.*;

public class ArmStrong {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number;
        double sum =0;
        System.out.print("Enter your number :");
        number = sc.nextInt();
        int temp = new Integer(number);
        while(temp !=0)
        {
            int last_num = temp % 10;
            System.out.println("Last num :"+last_num);
            temp = (Integer) temp / 10;
            double cube = Math.pow(last_num,3);
            sum = (sum + cube);
        }
        if(sum == number)
        {
            System.out.println("Number "+number+" is ArmStrong number.");
        }else {
            System.out.println("Number "+number+" is not ArmStrong number.");
        }
    }
}
