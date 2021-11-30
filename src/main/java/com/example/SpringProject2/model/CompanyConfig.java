package com.example.SpringProject2.model;

import java.util.concurrent.atomic.AtomicInteger;

public class CompanyConfig {
    private int numberOfHolidays;
    private double workingHours;

    public int getNumberOfHolidays() {
        return numberOfHolidays;
    }

    public void setNumberOfHolidays(int numberOfHolidays) {
        this.numberOfHolidays = numberOfHolidays;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
