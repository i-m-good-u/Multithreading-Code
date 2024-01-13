public class CreationOfThreadByRunnableInterface implements Runnable {

    public void run() {
        System.out.println("Creation of thread through runnable interface");
    }

    public static void main(String[] args) {

        // creation of object of above class so that thread is create
        CreationOfThreadByRunnableInterface obj = new CreationOfThreadByRunnableInterface();
        Thread thread = new Thread(obj);

        // start thread
        thread.start();
        thread.start();

    }
}
