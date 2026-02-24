package org.example;

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
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }

        this.value = value;
        this.unit = unit;
    }

    public double convertTo(LengthUnit targetUnit) {
        return convert(this.value, this.unit, targetUnit);
    }

    //    // Static conversion method (as required)
    public static double convert(double value,
                                 LengthUnit sourceUnit,
                                 LengthUnit targetUnit) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite.");
        }
        if (sourceUnit == null || targetUnit == null) {
            throw new IllegalArgumentException("Units cannot be null.");
        }

        // Convert to base unit (INCHES)
        double valueInBase = value * sourceUnit.getConversionFactor();

        // Convert to target
        double result = valueInBase / targetUnit.getConversionFactor();

        // Optional rounding (4 decimal places)
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
        if(this == obj){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Length other = (Length) obj;

        return Double.compare(this.toBase(), other.toBase()) == 0;
    }


//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Length)) return false;
//
//        Length other = (Length) obj;
//
//        return Double.compare(this.toBase(), other.toBase()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Double.hashCode(toBase());
//    }
}
