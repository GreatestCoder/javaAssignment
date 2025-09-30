class ReverseStringRunnable implements Runnable {
    private String text;

    // Constructor to accept the string
    public ReverseStringRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
            try {
                Thread.sleep(500); // Delay of 500ms for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class ReverseStringThreadDemo {
    public static void main(String[] args) {
        // Create Runnable instance
        ReverseStringRunnable task = new ReverseStringRunnable("MULTITHREADING");

        // Pass it to Thread object
        Thread t = new Thread(task);

        // Start the thread
        t.start();
    }
}
