/*
* Que 3: Write program to store static List of Product which contain SrNo,Name,Price. After Adding multile Product. Print Cheap and expensive product with using stream API.
* */

import java.util.*;

class Product {
    Integer srNo=null;
    String name="";
    Double price=null;

    Product(Integer srNo, String name, Double price)
    {
        this.srNo = srNo;
        this.name = name;
        this.price = price;
    }
}
public class Que3 {
    public static void main(String[] args) {
        List<Product> li = new ArrayList<Product>();

        li.add(new Product(1,"Laptop", 100000.0));
        li.add(new Product(2, "PC", 200000.0));
        li.add(new Product(3,"Monitor", 13000.0));
        li.add(new Product(4, "Mouse", 2000.0));
        li.add(new Product(5,"Key-board", 1000.0));
        li.add(new Product(6, "RAM", 8000.0));

        Product pmax = li.stream().max((product1,product2)-> product1.price > product2.price ? 1:-1).get();
        System.out.println("Maximum Price: "+pmax.price+"\nProduct name: "+pmax.name);
        System.out.println();
        Product pmin = li.stream().min((product1,product2)-> product1.price > product2.price ? 1:-1).get();
        System.out.println("Minimum Price :"+pmin.price+"\nProduct name: "+pmin.name);
    }
}
