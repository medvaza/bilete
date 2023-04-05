package model;

public class forChildren extends railwayTicket {
    private float ticketDiscount;
    public forChildren() {
    }
    public forChildren(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}
