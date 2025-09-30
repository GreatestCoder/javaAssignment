class WorkerThread extends Thread {
    public WorkerThread(String name) {
        super(name); // set thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // just to slow things down
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted: " + e);
            }
        }
        System.out.println(getName() + " finished execution.");
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread("Worker-1");
        WorkerThread t2 = new WorkerThread("Worker-2");
        WorkerThread t3 = new WorkerThread("Worker-3");

        // set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
