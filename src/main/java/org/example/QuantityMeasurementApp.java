package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class QuantityMeasurementApp{
    private static final Logger logger = Logger.getLogger(QuantityMeasurementApp.class.getName());

    private static void validateFinite(double value) {
        if (Double.isNaN(value)) {
            throw new IllegalArgumentException(" Cannot be NaN.");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException(" Must be finite.");
        }
    }

    private static void validateUnit(String value) {
        if (value.trim().isEmpty() || value.equalsIgnoreCase("null")) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }

        try {
            Length.LengthUnit.valueOf(value.trim().toUpperCase());
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(
                    "Invalid unit not allowed. Allowed units: FEET, INCHES, YARDS, CENTIMETERS."
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            logger.info("Enter First value : ");
            double value1 = sc.nextDouble();
            validateFinite(value1);
            logger.info("Enter Unit : ");
            String unit1 = sc.next();
            validateUnit(unit1);
            Length.LengthUnit u1 = Length.LengthUnit.valueOf(unit1.toUpperCase());

            logger.info("Enter Second value: ");
            double value2 = sc.nextDouble();
            validateFinite(value2);
            logger.info("Enter Unit : ");
            String unit2 = sc.next().toUpperCase();
            validateUnit(unit2);
            Length.LengthUnit u2 = Length.LengthUnit.valueOf(unit2.toUpperCase());

            Length length1 = new Length(value1, u1);
            Length length2 = new Length(value2, u2);
            Length result = Length.add(length1, length2);
            logger.fine("Converted value: " + result);

        }catch (IllegalArgumentException iae) {
            logger.info("Error : " + iae.getMessage());
        }
    }
}

