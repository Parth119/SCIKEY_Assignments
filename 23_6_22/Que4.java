/*
* Que 4: create program to perform Addition,Subtration and multiplication using function interface with common function name ActionPerform.
* */
@FunctionalInterface
interface operation{
    void ActionPerform(Integer n1,Integer n2);
}

class Arithmatic implements operation{

    public void ActionPerform(Integer n1, Integer n2) {
        System.out.println("Addition : "+n1+" + "+n2+" = "+(n1+n2));
        System.out.println("Subtraction : "+n1+" - "+n2+" = "+(n1-n2));
        System.out.println("Multiplication : "+n1+" * "+n2+" = "+(n1*n2));
    }
}
public class Que4 {
    public static void main(String[] args) {
        Arithmatic a1 =new Arithmatic();
        a1.ActionPerform(3,2);
    }
}
