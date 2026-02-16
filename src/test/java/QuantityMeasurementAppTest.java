import org.example.Length;
import org.example.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testYardEquality_SameValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L2 = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(L1, L2);
    }

    @Test
    public void testYardEquality_DifferentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L2 = new Length(2.0, Length.LengthUnit.YARDS);
        assertNotEquals(L1, L2);
    }

    @Test
    public void testYardToFeetEquality_EquivalentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L2 = new Length(3.0, Length.LengthUnit.FEET);
        assertEquals(L1, L2);
    }

    @Test
    public void testFeetToYardEquality_EquivalentValue(){
        Length L1 = new Length(3.0, Length.LengthUnit.FEET);
        Length L2 = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(L1, L2);
    }

    @Test
    public void testFeetEquality_SameReference(){
//        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
//        QuantityMeasurementApp.Feet f2 = f1;
//        assertTrue(f1.equals(f2));
    }

    @Test
    public void testInchesEquality_SameValue(){
//        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
//        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(1.0);
//        assertEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_DifferentValue(){
//        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
//        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(2.0);
//        assertNotEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_NullComparison(){
//        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
//        QuantityMeasurementApp.Inches i2 = null;
//        assertFalse(i1.equals(i2), "The value should not be null");
    }

    @Test
    public void testInchesEquality_DifferentClass(){
//        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
//        String s1 = "Some_value";
//        assertFalse(i1.equals(s1));
    }

    @Test
    public void testInchesEquality_SameReference(){
//        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
//        QuantityMeasurementApp.Inches i2 = i1;
//        assertTrue(i1.equals(i2));
    }
}
