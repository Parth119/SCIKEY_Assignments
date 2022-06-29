/*
 * Que: Write a program using ThreadPool lobfor Bank which will have deposit and withdraw methods, A customer can
 *  only withdraw if he has enough money deposited
 * */

package ConsumerProducer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Producer extends Thread {
    final Integer max_size = 3;
    List<String> li = new ArrayList<String>();

    public void run() {
        try {
            while (true) {
                produce();
            }
        } catch (Exception e) {

        }
    }

    private synchronized void produce() throws InterruptedException {

        while (li.size() == max_size) {
            System.out.println("Limit Reached waiting state!");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer got notification from consumer!");
        }
        String data = LocalDateTime.now().toString();
        li.add(data);
        System.out.println("Producer Produced data li:" + li.size());
        notify();
        Thread.sleep(1000);
    }

    public synchronized String consume() {
        notify();
        while (li.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = li.get(0);
        li.remove(data);
        data = data + " " + li.size();
        return data;
    }
}

class Consumer extends Thread {
    Producer p;

    Consumer(Producer p) {
        this.p = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = p.consume();
                System.out.println("Consumed by: " + Thread.currentThread().getName() + " Data: " + data);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}


public class ConsumerProducer {
    public static void main(String[] args) {
        Producer p1 = new Producer();
        p1.setName("Producer-1");
        p1.start();

        Consumer c1 = new Consumer(p1);
        c1.setName("Consumer-1");

        Consumer c2 = new Consumer(p1);
        c2.setName("Consumer-2");
        c1.start();
        c2.start();
    }
}
