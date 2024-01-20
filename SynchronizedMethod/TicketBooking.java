package SynchronizedMethod;

public class TicketBooking extends Thread {
    static MovieTicketBooking movieTicketBooking;
    int seat;

    public void run() {
        movieTicketBooking.movieTicketBooking(seat);
    }

    public static void main(String[] args) {
        movieTicketBooking = new MovieTicketBooking();
        movieTicketBooking.totalSeat = 100;

        // person 1 for buying ticket for movie
        TicketBooking guddu = new TicketBooking();
        guddu.seat = 70;
        guddu.start();

        // person 2 for buying ticket for movie
        TicketBooking manish = new TicketBooking();
        manish.seat = 30;
        manish.start();

    }

}
