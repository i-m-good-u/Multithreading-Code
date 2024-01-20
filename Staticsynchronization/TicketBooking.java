package Staticsynchronization;

public class TicketBooking {
    static int totalSeat = 55;

    static synchronized public void ticketBkking(int seat) {
        if (totalSeat >= seat) {
            System.out.println(seat + " ticket booked sucessfully");
            totalSeat = totalSeat - seat;
            System.out.println("Ticket remaining for booking is " + totalSeat);
        } else {
            System.out.println("Ticket cannot be booked");
            System.out.println("Only " + totalSeat + " tickets are left");
        }
    }
}
