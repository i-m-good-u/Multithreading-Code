package SynchronizedBlock;

public class TicketCounter extends Thread {
    static MovieTicketBooking movieTicketBooking;
    int seat;

    public void run() {
        System.out.println("Ticket booking start for " + seat + " Ticket");
        movieTicketBooking.movieTicketBooking(seat);
    }

    public static void main(String[] args) {
        movieTicketBooking = new MovieTicketBooking();
        movieTicketBooking.totalTicket = 19;

        // customer 1 for ticket booking
        TicketCounter guddu = new TicketCounter();
        guddu.seat = 8;
        guddu.start();

        // customer 2 for ticket booking
        TicketCounter manish = new TicketCounter();
        manish.seat = 12;
        manish.start();

    }

}
