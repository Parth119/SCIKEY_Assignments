package null_safety;

import  java.util.*;

class ArmStrong {
    int number;
    double sum=0;
    Scanner sc = new Scanner(System.in);

    ArmStrong(){}

    ArmStrong(int number){
        this.number = number;
    }

    public void setNumber(){
        System.out.print("Enter number :");
        number = sc.nextInt();
    }

    public void armstrong()
    {
        int temp = new Integer(number);

        while(temp !=0)
        {
            int last_num = temp % 10;
            System.out.println("Last num :"+last_num);
            temp = (Integer) temp / 10;
            double cube = Math.pow(last_num,3);
            sum = (sum + cube);
        }
    }

    public void display()
    {
        if(sum == number)
        {
            System.out.println("Number "+number+" is ArmStrong number.");
        }else {
            System.out.println("Number "+number+" is not ArmStrong number.");
        }
    }
}

public class ArmStrong_np {
    public static void main(String[] args){
        ArmStrong a = new ArmStrong();
        a.setNumber();
        a.armstrong();
        a.display();
    }
}
