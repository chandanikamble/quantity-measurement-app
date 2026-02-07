import java.util.Scanner;

public class QuantityMeasurementApp{
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

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first feet value: ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter second feet value: ");
        double value2 = scanner.nextDouble();

        Feet f1 = new Feet(value1);
        Feet f2 = new Feet(value2);

        boolean result = f1.equals(f2);
        System.out.print("Are the measurement equals: " + result);

    }
}