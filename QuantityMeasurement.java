public class QuantityMeasurement{
    public static class Feet{
        private double value1;
        private double value2;

        public Feet(double value1, double value2){
            // validate(value1);
            // validate(value2);
            this.value1 = value1;
            this.value2 = value2;
        }

        // private validate(double value){

        // }

        public boolean isEqual(){
            return Double.compare(value1, value2) == 0;
        }
    }

    public static class Inches{
        private double value1;
        private double value2;

        public Inches(double value1, double value2){
            this.value1 = value1;
            this.value2 = value2;
        }

        public boolean isEqual(){
            return Double.compare(value1, value2) == 0;
        }

    }

    public static void demonstrateFeetEquality(){
        Feet feet = new Feet(5.0, 6.0);
        boolean result1 = feet.isEqual();
        System.out.println(result1);
    }

    public static void demonstrateInchesEquality(){
        Inches inches = new Inches(5.0, 5.0);
        boolean result2 = inches.isEqual();
        System.out.println(result2);
    }
    
    public static void main(String[] args){
        demonstrateFeetEquality();
        demonstrateInchesEquality();

    }
}