import java.util.ArrayList;
import java.util.Scanner;

class MovieTicketBooking {
    ArrayList<Ticket> tickets = new ArrayList<>();
    int ticketcount = 1;

    public int bookTicket() {

        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Shows are: ");
        System.out.println("1. Avengers : Secret Wars");
        System.out.println("2. Jurassic Park");
        System.out.println("3. The God Father");
        System.out.println("4. Life is Beautiful");

        System.out.println("Enter Your Choice: ");
        String show = inputHelper.nextLine();

        if (Integer.parseInt(show) == 1)
            show = "Avengers : Secret Wars";
        else if (Integer.parseInt(show) == 2)
            show = "Jurassic Park";
        else if (Integer.parseInt(show) == 3)
            show = "The God Father";
        else if (Integer.parseInt(show) == 4)
            show = "Life is Beautiful";
        else {
            System.out.println("Invalid movie selected");
            return -1;
        }

        System.out.println("Select the Shift you want to watch: ");
        System.out.println("1. Morning ");
        System.out.println("2. AfterNoon");
        System.out.println("3. Night");

        System.out.println("Enter your choice: ");
        String shift = inputHelper.nextLine();

        if (Integer.parseInt(shift) == 1)
            shift = "Morning";
        else if (Integer.parseInt(shift) == 2)
            shift = "AfterNoon";
        else if (Integer.parseInt(shift) == 3)
            shift = "Night";
        else {
            System.out.println("Invalid shift selected");
            return -1;
        }

        System.out.println("Enter your Name: ");
        String name = inputHelper.nextLine();

        System.out.println("Enter your Contact Number: ");
        int number = inputHelper.nextInt();

        System.out.println("Enter number of ticket you want: ");
        int noTicket = inputHelper.nextInt();

        if (isTheaterFull()) {
            System.out.println("No seat Available");
            return -1;
        } else {
            Ticket ticket = new Ticket(ticketcount++, name, number, shift, show, noTicket);
            tickets.add(ticket);
            return ticket.ticketNo;
        }
    }

    private boolean isTheaterFull() {
        if (ticketcount >= 150)
            return true;
        return false;
    }

    public boolean cancelTicket(int TicketNumber) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).ticketNo == TicketNumber) {
                tickets.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayBooking() {
        for (Ticket t : tickets)
            System.out.println("\nTicket No: " + t.ticketNo + "\nName of Person: " + t.NameofPerson + "\nContact Number: " + t.ContactNo + "\nMovie Name: " + t.movieName + "\nTiming of Movie :" + t.shift + "\nNumber of Tickets Booked :" + t.noOfTicket);
    }
}