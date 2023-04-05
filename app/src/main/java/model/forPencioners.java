package model;

public class forPencioners extends railwayTicket {
    private float ticketDiscount;
    public forPencioners() {
    }
    public forPencioners(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}