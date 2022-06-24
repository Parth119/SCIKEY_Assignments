/*
* Que 2:Write program to Accept n number of String Input from User and store it in any collection data Type and using lamda function print Distinct string.
* */

import java.util.*;

class Collaction{
    Integer max_len = null;
    Set<String> st = new HashSet<String>();
    Scanner sc = new Scanner(System.in);

    public void getMaxLen(){
        System.out.print("Enter Max Length :");
        max_len = sc.nextInt();
    }
    public void store(){
        for(int i=0; i<max_len; i++)
        {
            System.out.print("Enter String value :");


            st.add(sc.next());
        }
    }
    public void display(){
        st.forEach(
                (n)-> System.out.print(n+" ")
        );
    }
}

public class Que2 {
    public static void main(String[] args)
    {
        Collaction c1 = new Collaction();
        c1.getMaxLen();
        c1.store();
        c1.display();
    }
}
