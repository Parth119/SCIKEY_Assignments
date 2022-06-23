package null_safety;

import java.util.*;

class Init1{

    Init1()
    {
    }

    Init1(int max_len, int array[])
    {
        this.max_len = max_len;
        this.array = array;
    }

    int max_len;
    int[] array;

    Scanner sc = new Scanner(System.in);


    public void getMax_len(){
        System.out.print("Enter max length of an array :");
        max_len = sc.nextInt();
        array = new int[max_len];
    }
    public void setMax_len(int max_len) {
        this.max_len = max_len;
    }

    public void getArray(){
        for(int i=0; i<max_len;i++)
        {
            System.out.print("Enter "+(i+1)+" Element :");
            array[i] = sc.nextInt();
        }
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public void left_shift(){
        int temp = array[0];

        for(int i=0;i<max_len-1; i++)
        {
            array[i] = array[i+1];
        }
        array[max_len-1] = temp;
    }

    public void display(){
        for(int i = 0; i<max_len; i++)
        {
            System.out.print(array[i]+" ");
        }
    }



}
public class Left_shift_np {
    public static void main(String[] args)
    {
        Init1 i1 = new Init1();
        i1.getMax_len();
        i1.getArray();
        i1.left_shift();
        i1.display();
    }
}
