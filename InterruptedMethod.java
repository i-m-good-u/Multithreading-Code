public class InterruptedMethod extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 0 " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Interrupted exception occurs " + e);
        }
    }

    public static void main(String[] args) {
        InterruptedMethod interruptedMethod = new InterruptedMethod();
        interruptedMethod.start();
        interruptedMethod.interrupt();

    }

}
