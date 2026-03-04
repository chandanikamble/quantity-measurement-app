package org.example;

import java.util.Scanner;

public class QuantityWeight {
    public final double value;
    public final WeightUnit unit;

    public static Scanner sc = new Scanner(System.in);

    public QuantityWeight(double value, WeightUnit unit){
        if(unit == null ) {
            throw new IllegalArgumentException("Units cannot be null.");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite.");
        }
        this.value = value;
        this.unit = unit;
    }

    @Override()
    public boolean equals(Object obj){
        if(this == obj){ return true; }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        QuantityWeight other = (QuantityWeight) obj;

        double thisBase = this.unit.convertToBaseUnit(this.value);
        double otherBase = other.unit.convertToBaseUnit(other.value);

        return Double.compare(thisBase, otherBase) == 0;
    }

    public static QuantityWeight convertTo(double value, WeightUnit unit, WeightUnit targetUnit){
        double valueInBase = value * unit.getConversionFactor();
        double convertedValue = valueInBase / targetUnit.getConversionFactor();
        return new QuantityWeight(convertedValue, targetUnit);
    }

    public static QuantityWeight add(QuantityWeight w1, QuantityWeight w2){
        double sum = w1.unit.convertToBaseUnit(w1.value) + w2.unit.convertToBaseUnit(w2.value);
        double convertedValue = w1.unit.convertFromBaseUnit(sum);
        return new QuantityWeight(convertedValue, w1.unit);
    }

    public static QuantityWeight add(QuantityWeight w1, QuantityWeight w2, WeightUnit targetUnit){
        double sum = w1.unit.convertToBaseUnit(w1.value) + w2.unit.convertToBaseUnit(w2.value);
        double convertedValue = targetUnit.convertFromBaseUnit(sum);

        return new QuantityWeight(convertedValue, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

//    public static void demonstrateWeightEquality() {
//        System.out.print("Enter First value : ");
//        double value1 = sc.nextDouble();
//
//        System.out.print("Enter Unit : ");
//        String unit1 = sc.next().toUpperCase();
//
//        System.out.print("Enter Second value: ");
//        double value2 = sc.nextDouble();
//
//        System.out.print("Enter Unit : ");
//        String unit2 = sc.next().toUpperCase();
//
//        QuantityWeight weight1 = new QuantityWeight(value1, WeightUnit.valueOf(unit1));
//        QuantityWeight weight2 = new QuantityWeight(value2, WeightUnit.valueOf(unit2));
//
//        boolean result = weight1.equals(weight2);
//        System.out.println("Weight Equality Result :" + result);
//    }
//
//    public static void demonstrateUnitConversion() {
//        System.out.print("Enter value : ");
//        double value = sc.nextDouble();
//
//        System.out.print("Enter Unit : ");
//        String unit1 = sc.next().toUpperCase();
//
//        System.out.print("Enter Target Unit : ");
//        String unit2 = sc.next().toUpperCase();
//
//        QuantityWeight result = QuantityWeight.convertTo(value, WeightUnit.valueOf(unit1), WeightUnit.valueOf(unit2));
//        System.out.println("Weight Equality Result :" + result);
//    }
//
//    public static void demonstrateAdditon(){
//        System.out.print("Enter First value : ");
//        double value1 = sc.nextDouble();
//        System.out.print("Enter Unit : ");
//        String unit1 = sc.next();
//        WeightUnit u1 = WeightUnit.valueOf(unit1.toUpperCase());
//
//        System.out.print("Enter Second value: ");
//        double value2 = sc.nextDouble();
//        System.out.print("Enter Unit : ");
//        String unit2 = sc.next().toUpperCase();
//        WeightUnit u2 = WeightUnit.valueOf(unit2.toUpperCase());
//
//        QuantityWeight weight1 = new QuantityWeight(value1, u1);
//        QuantityWeight weight2 = new QuantityWeight(value2, u2);
//        QuantityWeight result = QuantityWeight.add(weight1, weight2);
//        System.out.print("Addition of values : " + result);
//    }
//
//    public static void demonstrateAdditonWithTargetUnit(){
//        System.out.print("Enter First value : ");
//        double value1 = sc.nextDouble();
//        System.out.print("Enter Unit : ");
//        String unit1 = sc.next();
//        WeightUnit u1 = WeightUnit.valueOf(unit1.toUpperCase());
//
//        System.out.print("Enter Second value: ");
//        double value2 = sc.nextDouble();
//        System.out.print("Enter Unit : ");
//        String unit2 = sc.next().toUpperCase();
//        WeightUnit u2 = WeightUnit.valueOf(unit2.toUpperCase());
//
//        System.out.print("Enter Target Unit : ");
//        String unit3 = sc.next().toUpperCase();
//        WeightUnit u3 = WeightUnit.valueOf(unit3.toUpperCase());
//
//        QuantityWeight weight1 = new QuantityWeight(value1, u1);
//        QuantityWeight weight2 = new QuantityWeight(value2, u2);
//        QuantityWeight result = QuantityWeight.add(weight1, weight2, u3);
//        System.out.print("Addition of values : " + result);
//    }

    public static void main(String[] args){
//        demonstrateWeightEquality();
//        demonstrateUnitConversion();
//        demonstrateAdditon();
//        demonstrateAdditonWithTargetUnit();
        System.out.print("Enter First value : ");
        double value1 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit1 = sc.next().toUpperCase();

        System.out.print("Enter Second value: ");
        double value2 = sc.nextDouble();
        System.out.print("Enter Unit : ");
        String unit2 = sc.next().toUpperCase();

        QuantityWeight weight1 = new QuantityWeight(value1, WeightUnit.valueOf(unit1));
        QuantityWeight weight2 = new QuantityWeight(value2, WeightUnit.valueOf(unit2));

        System.out.println("Weight Equality Result :" + weight1.equals(weight2));
        QuantityWeight result = QuantityWeight.add(weight1, weight2);
        System.out.println("Sum :" + result);

        System.out.print("Enter Target Unit for addition : ");
        String unit3 = sc.next().toUpperCase();

        QuantityWeight explicitadd = QuantityWeight.add(weight1, weight2, WeightUnit.valueOf(unit3));
        System.out.println("addition target unit :" + explicitadd);

        System.out.print("Enter Target Unit for conversion : ");
        String unit4 = sc.next().toUpperCase();
        QuantityWeight convertedres = QuantityWeight.convertTo(result.value, result.unit, WeightUnit.valueOf(unit4));
        System.out.println("converted value :" + convertedres);
    }
}
