package com.pluralsight.hotel;

public record Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {

    public double getTotalPay() {
        if (hoursWorked > 40) {
            return (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5); // Overtime calculation
        }
        return hoursWorked * payRate; // Regular pay
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40); // Regular hours are capped at 40
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40); // Overtime hours are any hours over 40
    }
}