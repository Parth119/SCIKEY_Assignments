package semaphore;

import java.util.*;
import java.util.concurrent.Semaphore;

class Threads extends Thread {
    Semaphore sem;
    ArrayList<Boolean> arr;
    Integer pos;
    String name;

    Threads(Semaphore sem, String name, Integer pos, ArrayList<Boolean> arr) {
        this.sem = sem;
        this.name = name;
        this.pos = pos;
        this.arr = arr;
    }


    public synchronized void run() {
        while (true) {
//            System.out.println(name + " Thread Called!");
            pos = pos - 1;
            Integer second = (pos + 1) % 5;
            arr.set(pos, true);

            if (arr.get(second) == false && arr.get(pos) == true) {
                arr.set(second, true);

//                System.out.println(name + " Thread Executed in if");

                try {
                    // System.out.println(name + " Will aquire source");
                    sem.acquire();
                    System.out.println(name + " is Eating..");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                try {
//                    System.out.println(name + " Will go to sleep");
                    Thread.sleep(2000);
//                    System.out.println(name + " Awaken");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                System.out.println(name + " Avaialable Sem:" + sem.availablePermits());
                arr.set(pos, false);
                arr.set(second, false);
//                System.out.println(name + "Releasing source");
                sem.release();
                System.out.println(name + " Done Eating");
//                System.out.println(name + " Will broke");
                break;
            } else {
                arr.set(pos, false);
                System.out.println(name + " is Thinking..");
            }
        }
    }
}

public class Dining_Problem {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        Boolean spoon1 = false;
        Boolean spoon2 = false;
        Boolean spoon3 = false;
        Boolean spoon4 = false;
        Boolean spoon5 = false;
        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        arr.add(spoon1);
        arr.add(spoon2);
        arr.add(spoon3);
        arr.add(spoon4);
        arr.add(spoon5);


        Threads t1 = new Threads(sem, "Parth", 1, arr);
        Threads t2 = new Threads(sem, "Manish", 2, arr);
        Threads t3 = new Threads(sem, "Dhruv", 3, arr);
        Threads t4 = new Threads(sem, "Pooja", 4, arr);
        Threads t5 = new Threads(sem, "Vidhi", 5, arr);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println("Avaialable Sem in release (Main):" + sem.availablePermits());

    }
}
