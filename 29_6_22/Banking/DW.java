/*
 * Que: Producer-Consumer solution using threads in Java (To make sure that the producer won’t try to add data into
 * the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.)
 * */
package Banking;

class Bank {

    Double balance = 100.0;

    synchronized void withdrawal(final String name, final Double value) {

        while (this.balance < value) {

            System.out.println(name + " you can not withdraw data.");
            try {
                this.wait();
            } catch (final InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(name + " Can withdraw now");
        }

        System.out.println(name + " Withdrawal " + value);
        this.balance -= value;
        System.out.println("Current balance :" + this.balance);
        notify();
        try {
            Thread.sleep(100);
        } catch (final InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void deposit(final String name, final Double value) {
        notify();
        System.out.println(name + " Deposited " + value);
        this.balance += value;
        System.out.println("Current balance :" + this.balance);

        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Deposit extends Thread {
    Bank b;

    String name;
    Double value;

    Deposit(final Bank b, final String name, final Double value) {
        this.b = b;
        this.name = name;
        this.value = value;
    }

    public void run() {
        while (true) {
            this.b.deposit(this.name, this.value);
        }

    }
}

class Withdrawal extends Thread {
    Bank b;
    String name;
    Double value;

    Withdrawal(final Bank b, final String name, final Double value) {
        this.b = b;
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() {
        while (true) {
            this.b.withdrawal(this.name, this.value);
        }
    }
}

public class DW {
    public static void main(final String[] args) {
        Bank b = new Bank();
        Deposit t1 = new Deposit(b, "Parth", 20.0);
        Withdrawal t2 = new Withdrawal(b, "Dhruv", 140.0);

        t1.start();
        t2.start();
    }
}
