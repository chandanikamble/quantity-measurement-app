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
    public void testYardToInchesEquality_EquivalentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L2 = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(L1, L2);
    }

    @Test
    public void testInchestoYardEquality_EquivalentValue(){
        Length L1 = new Length(36.0, Length.LengthUnit.INCHES);
        Length L2 = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(L1, L2);
    }

    @Test
    public void testYardToFeet_NonEquivalentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length L2 = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(L1, L2);
    }

    @Test
    public void testCentimetersToInches_EquivalentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length L2 = new Length(0.393701, Length.LengthUnit.INCHES);
        assertEquals(L1, L2);
    }

    @Test
    public void testCentimetersToFeet_NonEquivalentValue(){
        Length L1 = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length L2 = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(L1, L2);
    }
//10,11
    @Test
    public void testEquality_YardWithNullUnit(){
        Length L1 = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length L2 = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(L1, L2);
    }
}
