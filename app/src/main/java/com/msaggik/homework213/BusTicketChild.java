package com.msaggik.homework213;

public class BusTicketChild extends BusTicket{
    private float ticketDiscount;
    private float numberOfTickets;

    public BusTicketChild() {
        super();
    }
    public BusTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super((int) ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
    private float getTicketPrice() {
        int i = 0;
        return i;
    }

    public float getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(float numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
