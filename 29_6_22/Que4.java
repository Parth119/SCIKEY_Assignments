/*
 * Que: create 5 thread at time with using Thread Pool and 2 thread need to run at a time. After finish of two
 * thread other thread need to execute.
 * */

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool implements Runnable {
    String str;

    ThreadPool(String str) {
        this.str = str;
    }

    public void run() {
        try {
            for (Integer i = 0; i < 5; i++) {
                Date dt = new Date();
                SimpleDateFormat fmt = new SimpleDateFormat("hh:mm");
                System.out.println(str + " Data :" + fmt.format(dt));
            }
            Thread.sleep(1000);
            System.out.println(str + " task is Complete");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class Que4 {
    static final Integer max_size = 2;

    public static void main(String[] args) {
        ThreadPool t1 = new ThreadPool("Parth");
        ThreadPool t2 = new ThreadPool("Manish");
        ThreadPool t3 = new ThreadPool("Dhruv");
        ThreadPool t4 = new ThreadPool("Pooja");
        ThreadPool t5 = new ThreadPool("Vidhi");


        ExecutorService es = Executors.newFixedThreadPool(max_size);
        es.execute(t1);
        es.execute(t2);
        es.execute(t3);
        es.execute(t4);
        es.execute(t5);

        es.shutdown();
    }
}
