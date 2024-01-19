public class SleepInThread extends Thread {

    // override run method
    public void run() {
        System.out.println("Thread-0 created");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10000);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepInThread sleepInThread = new SleepInThread();
        sleepInThread.start();
    }

}
