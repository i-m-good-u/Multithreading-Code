package Staticsynchronization;

public class Thread2 extends Thread {
    TicketBooking t1;
    int seat;

    Thread2(TicketBooking t1, int seat) {
        this.t1 = t1;
        this.seat = seat;
    }

    public void run() {
        t1.ticketBkking(seat);
    }

}
