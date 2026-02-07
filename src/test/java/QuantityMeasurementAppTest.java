import org.example.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testFeetEquality_SameValue(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);
        assertEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = null;
        assertFalse(f1.equals(f2), "The value should not be null");
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        String s1 = "Some_value";
        assertFalse(f1.equals(s1));
    }

    @Test
    public void testFeetEquality_SameReference(){
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = f1;
        assertTrue(f1.equals(f2));
    }
}
