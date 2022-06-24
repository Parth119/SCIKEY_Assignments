/*
Que 1: Write program to Accept n number of String Input from User and store it in any collection data Type and using lamda function print all string.

 */
import java.util.*;

class Str {

    Integer max_len = null;
    ArrayList<String> li = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public void getMaxLen(){
        System.out.print("Enter Max Length :");
        max_len = sc.nextInt();
    }
//    String temp = new String("");
    public void store(){
        for(int i=0; i<max_len; i++)
        {
            System.out.print("Enter String value :");


            li.add(sc.next());
        }
    }
    public void display(){
        li.forEach(
                (n)-> System.out.print(n+" ")
        );
    }
}

public class Que1 {
    public static void main(String[] args)
    {
        Str s1 = new Str();
        s1.getMaxLen();
        s1.store();
        s1.display();
    }
}
