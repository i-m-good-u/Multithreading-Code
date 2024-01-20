public class JoinInThread0 extends Thread {

    static Thread mainThread;

    public void run() {

        try {
            mainThread.join();
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread 0 " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinInThread0 joinInThread0 = new JoinInThread0();
        joinInThread0.start();

        mainThread = Thread.currentThread();

        // joinInThread0.join();

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
