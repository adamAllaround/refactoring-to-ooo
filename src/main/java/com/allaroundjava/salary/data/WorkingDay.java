package com.allaroundjava.salary.data;

import java.time.LocalDate;

public class WorkingDay {
    private final LocalDate date;
    private final double hours;
    private final double hoursOvertime;

    WorkingDay(LocalDate date, double hours, double hoursOvertime) {
        this.date = date;
        this.hours = hours;
        this.hoursOvertime = hoursOvertime;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getHours() {
        return hours;
    }

    public double getHoursOvertime() {
        return hoursOvertime;
    }
}
