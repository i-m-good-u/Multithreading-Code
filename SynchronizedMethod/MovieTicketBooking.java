package SynchronizedMethod;

public class MovieTicketBooking {
    int totalSeat;

    synchronized public void movieTicketBooking(int seat) {
        if (seat <= totalSeat) {
            System.out.println(seat + " Movie ticket booked sucessfully");
            totalSeat = totalSeat - seat;
            System.out.println("Remaining total ticket for booking is " + totalSeat);
        } else {
            System.out.println("Sorry movie ticket can't be booked!!!");
            System.out.println("Remaining total ticket for booking is " + totalSeat);
        }
    }
}