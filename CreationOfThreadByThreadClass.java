public class CreationOfThreadByThreadClass extends Thread {

    public void run() {
        System.out.println("Thread Creation By Extending thread Class");
    }

    public static void main(String[] args) {
        CreationOfThreadByThreadClass thread = new CreationOfThreadByThreadClass();
        thread.start();
    }
}