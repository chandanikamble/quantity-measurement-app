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
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
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



//public class QuantityMeasurementApp {
//
//    public static void demonstrateEquality(
//            double value1, Length.LengthUnit unit1,
//            double value2, Length.LengthUnit unit2) {
//
//        Length l1 = new Length(value1, unit1);
//        Length l2 = new Length(value2, unit2);
//
//        System.out.println(
//                value1 + " " + unit1 + " == " +
//                        value2 + " " + unit2 + " : " +
//                        l1.equals(l2)
//        );
//    }
//
//    public static void main(String[] args) {
//        demonstrateEquality(1.0, Length.LengthUnit.FEET, 12.0, Length.LengthUnit.INCHES);
//        demonstrateEquality(1.0, Length.LengthUnit.YARDS, 36.0, Length.LengthUnit.INCHES);
//        demonstrateEquality(30.48, Length.LengthUnit.CENTIMETERS, 1.0, Length.LengthUnit.FEET);
//        demonstrateEquality(3.0, Length.LengthUnit.FEET, 1.0, Length.LengthUnit.YARDS);
//    }
//}
