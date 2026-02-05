public class QuantityMeasurement{
    public static class Feet{
        private double value;

        public Feet(double value){
            this.value = value;
        }

        @Override()
        public boolean equals(Object obj){
            if(this == obj){
                return true;
            }

            if(obj == null || this.getClass() != obj.getClass()){
                return false;
            }

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;

        }
    }

    public static class Inches{
        private double value;

        public Inches(double value){
            this.value = value;
        }

        @Override()
        public boolean equals(Object obj){
            if(this == obj){
                return true;
            }

            if(obj == null || this.getClass() != obj.getClass()){
                return false;
            }

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;

        }

    }

    public static void demonstrateFeetEquality(){
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);
        boolean result = f1.equals(f2);
        System.out.println("Feet Equality Result:" + result);
    }

    public static void demonstrateInchesEquality(){
        Inches inch1 = new Inches(5.0);
        Inches inch2 = new Inches(6.0);
        boolean result = inch1.equals(inch2);
        System.out.println("Inches Equality Result:" + result);
    }
    
    public static void main(String[] args){
        demonstrateFeetEquality();
        demonstrateInchesEquality();

    }
}