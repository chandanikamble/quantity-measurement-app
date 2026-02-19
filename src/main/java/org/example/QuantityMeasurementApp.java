package org.example;

import java.util.Scanner;

public class QuantityMeasurementApp{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First value : ");
        double value1 = sc.nextDouble();

        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter Second value: ");
        double value2 = sc.nextDouble();

        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length length1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length length2 = new Length(value2, Length.LengthUnit.valueOf(unit2));

        Length result = Length.add(length1, length2);
        System.out.println("Converted value: " + result);
    }
}

