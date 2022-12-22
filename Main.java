import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner inputHelper = new Scanner(System.in);
        MovieTicketBooking movieTicketBooking = new MovieTicketBooking();

        System.out.println("-----Movie Ticket Booking System-----");
        System.out.println("\t Welcome Customer!!");

        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println();
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Booking");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = inputHelper.nextInt();

            switch (choice) {
                case 1: {
                    int ticketbooking = movieTicketBooking.bookTicket();
                    if (ticketbooking != -1)
                        System.out.println("Ticket Booked " + ticketbooking);
                }
                break;
                case 2: {
                    System.out.println("Enter the Ticket number to cancel ticket: ");
                    int TicketNumber = inputHelper.nextInt();
                    if (movieTicketBooking.cancelTicket(TicketNumber))
                        System.out.println("Ticket Cancelled.");
                    else
                        System.out.println("Ticket  Cancellation failed.");
                }
                break;
                case 3: {
                    movieTicketBooking.displayBooking();
                }
                break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid Choice ");
                    break;
            }
        }
    }
}