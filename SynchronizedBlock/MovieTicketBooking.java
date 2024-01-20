package SynchronizedBlock;

public class MovieTicketBooking {
    int totalTicket;

    public void movieTicketBooking(int seat) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        // synchronized block start

        synchronized (this) {

            if (totalTicket >= seat) {
                System.out.println(seat + " Ticket booked successfully");
                totalTicket = totalTicket - seat;
                System.out.println("Remaining ticket after booking " + seat + " ticket is " + totalTicket);
            } else {
                System.out.println("Sorry!" + seat + " ticket can't be booked");
                System.out.println("Remaining ticket for booking is " + totalTicket);
            }

        }

        // synchronized block end

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }

}