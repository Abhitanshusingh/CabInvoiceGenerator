package com.bridgelabz.service;

public class CabInvoiceService {
    private static final double MAXUMUM_FARE = 5;
    private static final double PER_KILOMETER_COST = 10;
    private static final int PER_MINUTE_COST = 1;

    public Double calculateFare(double distance, int time) {
        double totalFare = (distance * PER_KILOMETER_COST) + (time * PER_MINUTE_COST);
        if (totalFare < MAXUMUM_FARE) {
            return MAXUMUM_FARE;
        }
        return totalFare;
    }
}
