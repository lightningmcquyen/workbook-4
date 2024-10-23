package com.pluralsight.hotel;

import java.util.Objects;

public final class Employee {
    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private final double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

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
        return Math.max(0, hoursWorked - 40); // Overtime hours > 40
    }

    public int employeeId() {
        return employeeId;
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public double payRate() {
        return payRate;
    }

    public double hoursWorked() {
        return hoursWorked;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Employee) obj;
        return this.employeeId == that.employeeId &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.department, that.department) &&
                Double.doubleToLongBits(this.payRate) == Double.doubleToLongBits(that.payRate) &&
                Double.doubleToLongBits(this.hoursWorked) == Double.doubleToLongBits(that.hoursWorked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, department, payRate, hoursWorked);
    }

    @Override
    public String toString() {
        return "Employee[" +
                "employeeId=" + employeeId + ", " +
                "name=" + name + ", " +
                "department=" + department + ", " +
                "payRate=" + payRate + ", " +
                "hoursWorked=" + hoursWorked + ']';
    }

}