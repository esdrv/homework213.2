package com.msaggik.homework213;

public class Railwayticket {
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;


    public Railwayticket() {
    }

    public Railwayticket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float ticketPrice) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.travelTime = travelTime;
        this.ticketPrice = ticketPrice;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Железнодорожный билет:" +
                " место отправления " + departurePoint +
                ", место прибытия " + arrivalPoint +
                ", дата отправления " + departureDate +
                ", время пути " + travelTime +
                ", стоимость билета " + ticketPrice + " монет";
    }
}