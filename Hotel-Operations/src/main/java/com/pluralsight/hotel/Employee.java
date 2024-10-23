package com.pluralsight.hotel;

/**
 * @param employeeId  Unique ID for the employee
 * @param name        Name of the employee
 * @param department  Department where the employee works
 * @param payRate     Hourly pay rate for the employee
 * @param hoursWorked Total hours worked by the employee
 */
public record Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
    // Constructor to initialize the Employee object
    // Here, you can use name directly as it's a constructor parameter

    // Method to calculate total pay, including overtime if applicable
    public double getTotalPay() {
        if (hoursWorked > 40) {
            return (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5); // Calculate overtime
        }
        return hoursWorked * payRate; // Calculate regular pay
    }

    // Representation of the Employee object
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId + ", " +
                "name='" + name + '\'' + ", " +
                "department='" + department + '\'' + ", " +
                "payRate=" + payRate + ", " +
                "hoursWorked=" + hoursWorked +
                '}';
    }
}