package com.traulko.day2.service;

import com.traulko.day2.entity.CustomExecutor;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalendarService {
    public Calendar calculateDateOfExecution(CustomExecutor executor) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, executor.getCountOfDaysToExecute());
        return calendar;
    }

    public int calculatePersonYears(Calendar calendar) {
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int personBirthYear = calendar.get(Calendar.YEAR);
        return currentYear - personBirthYear;
    }

    public DayOfWeek getBirthDayOfWeek(Calendar calendar) {
        return DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK) - 1);
    }

    public boolean isBirthdayToday(Calendar calendar) {
        Calendar currentDate = Calendar.getInstance();
        boolean isCurrentDay = currentDate.get(Calendar.DATE) == calendar.get(Calendar.DATE);
        boolean isCurrentMonth = currentDate.get(Calendar.MONTH) == calendar.get(Calendar.MONTH);
        return (isCurrentDay && isCurrentMonth);
    }
}
