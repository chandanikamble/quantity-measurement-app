package org.example;

import java.util.Scanner;

public class QuantityMeasurementApp{

    public static void demonstrateYardFeetEquality(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value : ");
        double value1 = scanner.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = scanner.next().toUpperCase();

        System.out.print("Enter second value : ");
        double value2 = scanner.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = scanner.next().toUpperCase();

        Length l1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length l2 = new Length(value2, Length.LengthUnit.valueOf(unit2));
        boolean result = l1.equals(l2);
        System.out.println( result );
    }

    public static void demonstrateYardInchesEquality(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        double value1 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter second value : ");
        double value2 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length l1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length l2 = new Length(value2, Length.LengthUnit.valueOf(unit2));
        boolean result = l1.equals(l2);
        System.out.println( result );
    }

    public static void demonstrateYardEquality(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        double value1 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter second value : ");
        double value2 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length l1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length l2 = new Length( value2, Length.LengthUnit.valueOf(unit2));
        boolean result = l1.equals(l2);
        System.out.println( result );
    }

    public static void demonstrateCentimetersEquality(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        double value1 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter second value : ");
        double value2 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length l1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length l2 = new Length(value2, Length.LengthUnit.valueOf(unit2));
        boolean result = l1.equals(l2);
        System.out.println( result );
    }

    public static void demonstrateCMSInchesEquality(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        double value1 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter second value : ");
        double value2 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        Length l1 = new Length(value1, Length.LengthUnit.valueOf(unit1));
        Length l2 = new Length(value2, Length.LengthUnit.valueOf(unit2));
        boolean result = l1.equals(l2);
        System.out.println( result );
    }

    public static void main(String[] args) {
        demonstrateYardFeetEquality();
        demonstrateYardInchesEquality();
        demonstrateYardEquality();
        demonstrateCentimetersEquality();
        demonstrateCMSInchesEquality();
    }
}
