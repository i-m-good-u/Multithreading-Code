public class InterruptMethod extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 0 " + i);

                // Interrupt method only works when thread is in either sleeping state or
                // waiting state otherwise interrupt method behve noramal means does not affect
                // flow of programm

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Interrupted exception occurs " + e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod interruptedMethod = new InterruptMethod();
        interruptedMethod.start();
        interruptedMethod.interrupt();

    }

}
