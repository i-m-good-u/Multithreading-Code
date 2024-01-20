public class InterruptedAndIsInterrupted extends Thread {

    // both interrupted() and isInterrupted() method is used to check is thread is
    // interrupted or not
    // but interrupted() have one more function that if thread is in interrupted
    // state then it return true and
    // set that thread as false
    // both method return type is boolean
    // interrupted() method is static

    public void run() {

        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 0 " + i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptedAndIsInterrupted interruptedAndIsInterrupted = new InterruptedAndIsInterrupted();
        interruptedAndIsInterrupted.start();
        interruptedAndIsInterrupted.interrupt();
    }

}
