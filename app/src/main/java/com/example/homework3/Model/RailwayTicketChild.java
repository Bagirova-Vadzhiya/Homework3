package com.example.homework3.Model;

public class RailwayTicketChild extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketChild() {
    }
    public RailwayTicketChild(float ticketPrice, int totalTickets, float ticketDiscount) {
        super(ticketPrice, totalTickets);
         this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getTotalTickets() * (100 - ticketDiscount))/100;
    }
}
