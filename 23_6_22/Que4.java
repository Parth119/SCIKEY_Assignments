/*
* Que 4: create program to perform Addition,Subtration and multiplication using function interface with common function name ActionPerform.
* */
import java.util.Scanner;

@FunctionalInterface
interface operation {
//    void ActionPerform(Character sym,Integer num1, Integer num2);
void ActionPerform();
}

class Arithmetic implements operation{
    Scanner sc = new Scanner(System.in);
    Integer num1;
    Integer num2;
    Integer ans;
    Character sym;

    @Override
    public void ActionPerform() {

        init();

        switch(sym){
            case '+':
                doAddition();
                System.out.println("Additon of two numbers is :"+ans);
                break;
            case '-':
                doSubtraction();
                System.out.println("Subtraction of two numbers is :"+ans);
                break;
            case '*':
                doMultiplication();
                System.out.println("Multiplication of two numbers is :"+ans);
                break;
            default:
                System.out.println("Invalid Symbol choice");
                System.exit(0);
        }
    }

    void init(){
        System.out.print("Enter number 1:");
        num1 = sc.nextInt();

        System.out.print("Enter number 2:");
        num2 = sc.nextInt();

        System.out.print("Enter opration:");
        sym = sc.next().charAt(0);
    }

    void doAddition(){
        ans = num1+num2;
    }

    void doSubtraction(){
        ans = num1 - num2;

    }

    void doMultiplication(){
        ans = num1 * num2;
    }
}

public class Que4 {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();

        a.ActionPerform();
//        a.ActionPerform('+',6,4);
//        a.ActionPerform('-',12,6);
//        a.ActionPerform('*',4,4);
    }
}
