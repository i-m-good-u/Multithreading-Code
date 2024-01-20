package Staticsynchronization;

public class Mian {
    public static void main(String[] args) {
        // first object creation
        TicketBooking t1 = new TicketBooking();

        // first thread
        Thread1 thread1 = new Thread1(t1, 10);
        thread1.start();

        // second thread
        Thread2 thread2 = new Thread2(t1, 23);
        thread2.start();

        // second object creation
        TicketBooking t2 = new TicketBooking();

        // third thread
        Thread1 thread3 = new Thread1(t2, 21);
        thread3.start();

        // fourth thread
        Thread2 thread4 = new Thread2(t2, 24);
        thread4.start();

    }

}
