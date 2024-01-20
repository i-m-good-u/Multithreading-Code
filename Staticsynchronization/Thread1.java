package Staticsynchronization;

public class Thread1 extends Thread {
    TicketBooking t1;
    int seat;

    Thread1(TicketBooking t1, int seat) {
        this.t1 = t1;
        this.seat = seat;
    }

    public void run() {
        t1.ticketBkking(seat);
    }

}
