package com.allaroundjava.salary.data;

import java.time.LocalDate;

public class Training {
    private final LocalDate date;
    private final double hours;
    private final boolean outsideOfResidence;

    Training(LocalDate date, double hours, boolean outsideOfResidence) {
        this.date = date;
        this.hours = hours;
        this.outsideOfResidence = outsideOfResidence;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getHours() {
        return hours;
    }

    public boolean isOutsideOfResidence() {
        return outsideOfResidence;
    }
}
