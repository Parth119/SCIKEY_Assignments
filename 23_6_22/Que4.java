/*
* Que 4: create program to perform Addition,Subtration and multiplication using function interface with common function name ActionPerform.
* */
import java.util.Scanner;

@FunctionalInterface
interface operation {
    void ActionPerform(String str);
}

class Arithmetic implements operation{
    Scanner sc = new Scanner(System.in);
    Integer num1=null;
    Integer num2=null;
    Integer ans=null;

    @Override
    public void ActionPerform(String str) {

        System.out.println(str+" Answer is :"+ans);
    }

    void init()
    {
        System.out.print("Enter First number :");
        num1= sc.nextInt();

        System.out.print("Enter Second number :");
        num2 = sc.nextInt();
    }
    void doAddition(){
        ans = num1+num2;
        ActionPerform("Addition");
    }

    void doSubtraction(){
        ans = num1 - num2;
        ActionPerform("Subtraction");
    }

    void doMultiplication(){
        ans = num1 * num2;
        ActionPerform("Division");
    }
}

public class Que4 {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.init();
        System.out.println();
        a.doAddition();
        a.doSubtraction();
        a.doMultiplication();
    }
}
