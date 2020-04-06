package com.bridgelabz.service;

public class CabInvoiceService {
    private static final double MAXUMUM_FARE = 5;
    private static final double PER_KILOMETER_COST = 10;
    private static final int PER_MINUTE_COST = 1;

    public Double calculateFare(double distance, int time) {
        double totalFare = (distance * PER_KILOMETER_COST) + (time * PER_MINUTE_COST);
        return Math.max(totalFare, MAXUMUM_FARE);
    }

    public double calculateFareForMultipleRides(Ride[] rides) {
        double aggregateFare = 0;
        for (Ride ride : rides) {
            aggregateFare += calculateFare(ride.distance, ride.time);
        }
        return aggregateFare;
    }
}
