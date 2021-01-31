package com.allaroundjava.salary.service;

import com.allaroundjava.salary.data.Training;
import com.allaroundjava.salary.data.WorkingDay;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class SalaryService {

    public static final double NORMAL_HOURLY_RATE = 1.33;
    public static final double OVERTIME_HOURLY_RATE = 1.90;

    public BigDecimal calculateSalary(List<WorkingDay> workingDays, List<Training> trainings) {
        BigDecimal result = BigDecimal.ZERO;
        for (WorkingDay workingDay : workingDays) {
            result = result.add(BigDecimal.valueOf(workingDay.getHours() * NORMAL_HOURLY_RATE));
            result = result.add(BigDecimal.valueOf(workingDay.getHoursOvertime() * OVERTIME_HOURLY_RATE));
        }

        for (Training training : trainings) {
            result = result.add(BigDecimal.valueOf(training.getHours() * 2.5));
            if (training.isOutsideOfResidence()) {
                result = result.add(BigDecimal.valueOf(3));
            }
        }

        if (Month.DECEMBER.equals(LocalDate.now().getMonth())) {
            result = result.add(BigDecimal.valueOf(150));
        }
        return result;
    }
}
