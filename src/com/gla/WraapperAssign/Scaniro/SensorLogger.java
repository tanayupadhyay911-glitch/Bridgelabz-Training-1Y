package com.gla.WraapperAssign.Scaniro;

import java.util.*;

public class SensorLogger {

    public static void logTemperature(Double temp) {
        if (temp != null) {
            System.out.println("Logged: " + temp);
        }
    }

    public static void main(String[] args) {
        double primitiveTemp = 25.5;
        Double wrapperTemp = 30.2;

        // auto-boxing
        logTemperature(primitiveTemp);

        // direct wrapper
        logTemperature(wrapperTemp);
    }
}
