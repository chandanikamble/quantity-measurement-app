package org.example;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor(){
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit){
        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit(){
        value = value * unit.getConversionFactor();
//        unit = LengthUnit.INCHES;
//        System.out.println("value: " + value);
        return value;
    }

//    public boolean compare(Length thatLength){
//        System.out.println("value : " + value);
////        return false;
//    }

    @Override()
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Length other = (Length) obj;
//        System.out.println("Feet value: "+this.convertToBaseUnit());
//        System.out.println("Inch Value: "+other.convertToBaseUnit());
        return Double.compare(this.convertToBaseUnit(), other.convertToBaseUnit()) == 0;
    }

//    public static void main(String[] args){
//        Length length1 = new Length(12.0, LengthUnit.FEET);
//        Length length2 = new Length(1.0, LengthUnit.INCHES);
//        System.out.println("Are lengths equals?" + length1.equals(length2));
//    }
}
