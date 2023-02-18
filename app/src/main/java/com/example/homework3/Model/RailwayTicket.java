package com.example.homework3.Model;

public class RailwayTicket {
    private String departurePoint;
    private String arrivalCity;
    private String dispatchTime;
    private String departureDate;
    private String arrivalTime;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int totalTickets;

public RailwayTicket() {
}
public RailwayTicket(float ticketPrice, int totalTickets) {
    this.ticketPrice = ticketPrice;
    this.totalTickets = totalTickets;
}
public float ticketPriceAll() {
    return ticketPrice * totalTickets;
}

public float getTicketPrice() {
    return ticketPrice;
}
public void setTicketPrice(float ticketPrice) {
    this.ticketPrice = ticketPrice;
}

public int getTotalTickets() {
    return totalTickets;
}
public void setTotalTickets(int totalTickets) {
    this.totalTickets = totalTickets;
}
}

