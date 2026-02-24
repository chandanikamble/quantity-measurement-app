package org.example;

import java.util.Scanner;

public class QuantityMeasurementApp{

    public static void demonstrateFeetInchesComparison(){
//        Length feet = new Length(3.0, Length.LengthUnit.FEET);
//        Length inches = new Length(24.0, Length.LengthUnit.INCHES);
//        boolean result = feet.equals(inches);
//        System.out.println("Are Lengths equals :" + result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        double value = sc.nextDouble();

        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter Target Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length.LengthUnit sourceUnit = Length.LengthUnit.valueOf(unit1);
        Length.LengthUnit targetUnit = Length.LengthUnit.valueOf(unit2);

        Length length = new Length(value, sourceUnit);

        double result = length.convertTo(targetUnit);
//        double result = Length.convert(value, sourceUnit, targetUnit);

        System.out.println("Converted value: " + result + " " + targetUnit);
    }
}
