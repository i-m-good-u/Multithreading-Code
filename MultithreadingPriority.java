public class MultithreadingPriority extends Thread {

    // override run method
    public void run() {
        System.out.println("This is Thread-0");
        Thread.currentThread().setPriority(8);
        System.out.println("Priority of the child thread is : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        // priority of the main thread before setting or default
        System.out.println(Thread.currentThread().getPriority());

        // priority of the thread after setting thread priority
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        MultithreadingPriority multithreadingPriority = new MultithreadingPriority();
        multithreadingPriority.start();

    }

}
