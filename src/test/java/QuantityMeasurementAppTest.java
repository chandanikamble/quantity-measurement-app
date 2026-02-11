import org.example.Length;
import org.example.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testFeetEquality_SameValue(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_DifferentValue(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = null;
        assertFalse(f1.equals(f2), "The value should not be null");
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        String s1 = "Some_value";
        assertFalse(f1.equals(s1));
    }

    @Test
    public void testFeetEquality_SameReference(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = f1;
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testInchesEquality_SameValue(){
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(2.0, Length.LengthUnit.INCHES);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_NullComparison(){
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = null;
        assertFalse(i1.equals(i2), "The value should not be null");
    }

    @Test
    public void testInchesEquality_DifferentClass(){
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        String s1 = "Some_value";
        assertFalse(i1.equals(s1));
    }

    @Test
    public void testInchesEquality_SameReference(){
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = i1;
        assertTrue(i1.equals(i2));
    }


    public void testFeetInchesEquality_SameValue(){
        Length f1 = new Length(2.0, Length.LengthUnit.FEET);
        Length f2 = new Length(24.0, Length.LengthUnit.INCHES);
        assertEquals(f1, f2);
    }

    @Test
    public void testFeetInchesEquality_DifferentValue(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(24.0, Length.LengthUnit.FEET);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testFeetInchesEquality_NullComparison(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = null;
        assertFalse(f1.equals(f2), "The value should not be null");
    }

    @Test
    public void testFeetInchesEquality_DifferentClass(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        String s1 = "Some_value";
        assertFalse(f1.equals(s1));
    }

    @Test
    public void testFeetInchesEquality_SameReference(){
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = f1;
        assertTrue(f1.equals(f2));
    }

}
