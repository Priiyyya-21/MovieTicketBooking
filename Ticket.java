class Ticket {
    int ticketNo;
    String NameofPerson;
    int ContactNo;
    String shift;
    String movieName;
    int noOfTicket;

    public Ticket(int tNo, String pName, int Contact, String shift, String mName, int noTicket) {
        this.ticketNo = tNo;
        this.NameofPerson = pName;
        this.ContactNo = Contact;
        this.shift = shift;
        this.movieName = mName;
        this.noOfTicket = noTicket;
    }
}