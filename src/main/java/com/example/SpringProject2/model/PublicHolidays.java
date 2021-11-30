package com.example.SpringProject2.model;

import java.time.LocalDate;

public class PublicHolidays {
    private String date;
    private String description;
    private int holidayFinancialYear;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHolidayFinancialYearJANtoDEC() {
        return holidayFinancialYear;
    }

    public void setHolidayFinancialYearJANtoDEC(int holidayFinancialYearJANtoDEC) {
        this.holidayFinancialYear = holidayFinancialYearJANtoDEC;
    }
}
