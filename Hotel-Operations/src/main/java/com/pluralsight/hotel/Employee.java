package com.pluralsight.hotel;

public class Employee {
    private final int employeeId;      // Unique ID for the employee
    private final String name;          // Name of the employee
    private final String department;     // Department where the employee works
    private final double payRate;        // Hourly pay rate for the employee
    private final double hoursWorked;    // Total hours worked by the employee

    // Constructor to initialize the Employee object
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate total pay, including overtime if applicable
    public double getTotalPay() {
        if (hoursWorked > 40) {
            return (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5); // Calculate overtime
        }
        return hoursWorked * payRate; // Calculate regular pay
    }

    // Getter for regular hours (capped at 40)
    public double getRegularHours() {
        return Math.min(hoursWorked, 40); // Regular hours
    }

    // Getter for overtime hours (hours above 40)
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40); // Overtime hours
    }

    // Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Getter for employee department
    public String getDepartment() {
        return department;
    }

    // Getter for pay rate
    public double getPayRate() {
        return payRate;
    }

    // Getter for hours worked
    public double getHoursWorked() {
        return hoursWorked;
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