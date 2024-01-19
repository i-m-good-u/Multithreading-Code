public class YieldMethod extends Thread {

    public void run() {
        // Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        YieldMethod yieldMethod = new YieldMethod();
        yieldMethod.start();

        Thread.yield();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    // Yield totally depends upon thread schedular that thread schedular accepting
    // yielding request or ignoring it
    // so output may be diffrent when we run program at diffrent time

}
