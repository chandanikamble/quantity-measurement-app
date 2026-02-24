package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class QuantityMeasurementApp{
    private static final Logger logger = Logger.getLogger(QuantityMeasurementApp.class.getName());

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        logger.info("Enter value : ");
        double value = sc.nextDouble();

        logger.info("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        logger.info("Enter Target Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length.LengthUnit sourceUnit = Length.LengthUnit.valueOf(unit1);
        Length.LengthUnit targetUnit = Length.LengthUnit.valueOf(unit2);

        Length length = new Length(value, sourceUnit);

        double result = length.convertTo(targetUnit);
        logger.info("Converted value: " + result + " " + targetUnit);
    }
}
