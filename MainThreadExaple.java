public class MainThreadExaple extends Thread {

    // creation of run method

    public void run() {
        // printing of threadNme
        System.out.println("Task " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        // creation of thread
        MainThreadExaple threadExaple = new MainThreadExaple();
        threadExaple.setName("Guddu");
        threadExaple.start();

        // getName
        String name1 = Thread.currentThread().getName();
        System.out.println(name1);
        // SetName
        Thread.currentThread().setName("Guddu");
        String name2 = Thread.currentThread().getName();
        System.out.println(name2);

        // isAlive
        System.out.println(Thread.currentThread().isAlive());
    }

}
