/*
* Que 4: create program to perform Addition,Subtration and multiplication using function interface with common function name ActionPerform.
* */
import java.util.*;
import java.lang.*;
@FunctionalInterface
interface operation{
    void ActionPerform(Integer n1,Integer n2);
}

class Arithmatic implements operation{

    public void ActionPerform(Integer n1, Integer n2) {
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter 1 to Addition\n2 for Subtraction\n3 to Multipliation\n4 to exit\nEnter your choice:");
            Integer num = sc.nextInt();

            switch (num){
                case 1:
                    System.out.println("Addition : "+n1+" + "+n2+" = "+(n1+n2));
                    break;
                case 2:
                    System.out.println("Subtraction : "+n1+" - "+n2+" = "+(n1-n2));
                    break;
                case 3:
                    System.out.println("Multiplication : "+n1+" * "+n2+" = "+(n1*n2));
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid choice.");
            }

        }



    }
}
public class Que4 {
    public static void main(String[] args) {
        Arithmatic a1 =new Arithmatic();
        a1.ActionPerform(3,2);
    }
}
