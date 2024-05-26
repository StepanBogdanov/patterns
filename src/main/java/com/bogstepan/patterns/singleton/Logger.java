package com.bogstepan.patterns.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLog(Object obj, String info) {
        String className = obj.getClass().getName();
        String date = LocalDate.now().format(formatter);
        System.out.printf("Log info: %s - %s - %s\n", date, className, info);
    }
}
