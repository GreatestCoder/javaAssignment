class ThreadOne extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 1");
                Thread.sleep(1000); // 1 second delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted: " + e);
        }
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 2");
                Thread.sleep(2000); // 2 seconds delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted: " + e);
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
