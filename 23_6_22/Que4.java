/*
* Que 4: create program to perform Addition,Subtration and multiplication using function interface with common function name ActionPerform.
* */
import java.util.Scanner;
import java.lang.*;

@FunctionalInterface
interface Addition{
    int ActionPerform(Integer num1, Integer num2);
}

@FunctionalInterface
interface Subtraction{
    int ActionPerform(Integer num1, Integer num2);
}

@FunctionalInterface
interface Multiplication{
    int ActionPerform(Integer num1, Integer num2);
}

public class Que4 {
    public static void main(String[] args) {

//        Initialize variable
        Integer num1;
        Integer num2;
        Integer ans;
        Scanner sc = new Scanner(System.in);

//        USer Entry
        System.out.print("Enter First number :");
        num1= sc.nextInt();

        System.out.print("Enter Second number :");
        num2 = sc.nextInt();


//        Interface object
        Addition a = (Integer n1, Integer n2) -> n1+n2;
        Subtraction s = (Integer n1, Integer n2) -> n1-n2;
        Multiplication m = (Integer n1, Integer n2) -> n1*n2;

//        Switch Loop
        while(true){
            System.out.println();
            System.out.print("Enter \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 to exit\nYour choice :");
            Integer choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    ans = a.ActionPerform(num1,num2);
                    System.out.println("Addition :"+ans);
                    break;
                case 2:
                    ans = s.ActionPerform(num1,num2);
                    System.out.println("Subtraction :"+ans);
                    break;
                case 3:
                    ans = m.ActionPerform(num1,num2);
                    System.out.println("Multiplication :"+ans);
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
