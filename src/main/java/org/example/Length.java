package org.example;

import java.util.Objects;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor(){
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit){
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be a finite number.");
        }

        this.value = value;
        this.unit = unit;
    }

    public static Length add(Length l1, Length l2){
        if (l1 == null || l2 == null) {
            throw new NullPointerException("Length must not be null.");
        }
        double sum = l1.toBase() + l2.toBase();
        double convertedValue = convert(sum, l1.unit);
        return new Length(convertedValue, l1.unit);
    }

    public static double convert(double valueInBase, LengthUnit targetUnit) {
        // Convert to target
        double result = valueInBase / targetUnit.getConversionFactor();
        return Math.round(result * 10000.0) / 10000.0;
    }

    // Convert current value to base (INCHES)
    private double toBase() {
        return value * unit.getConversionFactor();
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }

    @Override()
    public boolean equals(Object obj){
        if(this == obj){ return true; }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Length other = (Length) obj;
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
