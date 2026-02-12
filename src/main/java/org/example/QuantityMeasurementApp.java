package org.example;

public class QuantityMeasurementApp{

    public static void demonstrateYardFeetEquality(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(3.0, Length.LengthUnit.FEET);
        boolean result = l1.equals(l2);
        System.out.println( 1.0 + " " + Length.LengthUnit.YARDS + " == " +
                3.0 + " " + Length.LengthUnit.FEET + " : " + result );
    }

    public static void demonstrateYardInchesEquality(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(36.0, Length.LengthUnit.INCHES);
        boolean result = l1.equals(l2);
        System.out.println( 1.0 + " " + Length.LengthUnit.YARDS + " == " +
                36.0 + " " + Length.LengthUnit.INCHES + " : " + result );
    }

    public static void demonstrateYardEquality(){
        Length l1 = new Length(2.0, Length.LengthUnit.YARDS);
        Length l2 = new Length( 2.0, Length.LengthUnit.YARDS);
        boolean result = l1.equals(l2);
        System.out.println( 2.0 + " " + Length.LengthUnit.YARDS + " == " +
                2.0 + " " + Length.LengthUnit.YARDS + " : " + result );
    }

    public static void demonstrateCentimetersEquality(){
        Length l1 = new Length(2.0, Length.LengthUnit.CENTIMETERS);
        Length l2 = new Length(2.0, Length.LengthUnit.CENTIMETERS);
        boolean result = l1.equals(l2);
        System.out.println( 2.0 + " " + Length.LengthUnit.CENTIMETERS + " == " +
                2.0 + " " + Length.LengthUnit.CENTIMETERS + " : " + result );
    }

    public static void demonstrateCMSInchesEquality(){
        Length l1 = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length l2 = new Length(0.393701, Length.LengthUnit.INCHES);
        boolean result = l1.equals(l2);
        System.out.println( 1.0 + " " + Length.LengthUnit.CENTIMETERS + " == " +
                0.393701 + " " + Length.LengthUnit.INCHES + " : " + result );
    }

    public static void main(String[] args) {
        demonstrateYardFeetEquality();
        demonstrateYardInchesEquality();
        demonstrateYardEquality();
        demonstrateCentimetersEquality();
        demonstrateCMSInchesEquality();
    }
}
