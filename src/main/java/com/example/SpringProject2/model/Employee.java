package com.example.SpringProject2.model;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private Long phoneNumber;
    private String designation;
    private double trainingSalary;
    private double salary;
    private String line1;
    private String line2;
    private List<employeeHolidays> holidays;




    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public double getTrainingSalary()
    {
        return trainingSalary;
    }

    public void setTrainingSalary(double trainingSalary)
    {
        this.trainingSalary = trainingSalary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public List<employeeHolidays> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<employeeHolidays> holidays) {
        this.holidays = holidays;
    }




}
