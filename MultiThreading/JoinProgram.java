package MultiThreading;

class JoinProgram extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Pause for 500ms to simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinProgram t1 = new JoinProgram();
        JoinProgram t2 = new JoinProgram();
        t1.setName("T-1");
        t2.setName("T-2");

        // Start both threads
        t1.start();
        t2.start();

        // Main thread waits for t1 to finish using join()
        try {
            t1.join();
            System.out.println("Thread t1 has finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread waits for t2 to finish using join(long millis)
        try {
            t2.join(1000); // Wait for a maximum of 1 second for t2 to finish
            if (t2.isAlive()) {
                System.out.println("Thread t2 is still running, proceeding without waiting further.");
            } else {
                System.out.println("Thread t2 has finished.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed execution.");
    }
}
