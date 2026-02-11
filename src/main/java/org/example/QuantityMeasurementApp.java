package org.example;

public class QuantityMeasurementApp{

    public static void demonstrateFeetEquality(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        boolean result = f1.equals(f2);
        System.out.println("Feet Equality Result :" + result);
    }

    public static void demonstrateInchesEquality(){
        Length i1 = new Length(9.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(8.0, Length.LengthUnit.INCHES);
        boolean result = i1.equals(i2);
        System.out.println("Inches Equality Result:" + result);
    }

    public static void demonstrateFeetInchesComparison(){
        Length feet = new Length(2.0, Length.LengthUnit.FEET);
        Length inches = new Length(24.0, Length.LengthUnit.INCHES);
        boolean result = feet.equals(inches);
        System.out.println("Are Lengths equals :" + result);
    }

    public static void main(String[] args){
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}