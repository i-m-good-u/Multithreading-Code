public class DaemonThread extends Thread {
    // override run method
    @Override
    public void run() {
        System.out.println("child thread is created as Daemon");
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        // daemonThread.setDaemon(true);
        daemonThread.start();
        // System.out.println(Thread.currentThread().getName());
    }

}
