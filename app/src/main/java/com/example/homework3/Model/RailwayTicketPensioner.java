package com.example.homework3.Model;

public class RailwayTicketPensioner extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketPensioner() {
    }

    public RailwayTicketPensioner(float ticketPrice, int totalTickets, float ticketDiscount) {
        super(ticketPrice, totalTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getTotalTickets() * (100 - ticketDiscount))/100;
    }

}
