public class JoinInMain extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 0 " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinInMain joinInMain = new JoinInMain();
        joinInMain.start();

        // join method use in main
        joinInMain.join();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
