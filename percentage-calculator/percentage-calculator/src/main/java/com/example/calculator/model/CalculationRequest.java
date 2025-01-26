package com.example.calculator.model;

public class CalculationRequest {
    private double part;
    private double whole;
    private double percentage;

    // Getters and Setters
    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    public double getWhole() {
        return whole;
    }

    public void setWhole(double whole) {
        this.whole = whole;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
