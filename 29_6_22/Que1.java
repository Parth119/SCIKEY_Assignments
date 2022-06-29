/*
 * Que: Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the
 * constructor). The threads should display the messages continuously till the user presses ctrl+c.
 * */
class NewThread extends Thread {
    Integer n;

    NewThread(Integer n) {
        this.n = n;
    }

    public void run() {
        while (true) {
            System.out.println(n + ": Thread is running!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class Que1 {
    public static void main(String[] args) {
        NewThread t1 = new NewThread(1);
        NewThread t2 = new NewThread(2);


        t1.start();
        t2.start();
    }
}
