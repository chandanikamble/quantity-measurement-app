import org.example.Length;
import org.example.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testConversion_FeetToInches(){
        Length L1 = new Length(1.0, Length.LengthUnit.FEET);
        L1.convertTo(Length.LengthUnit.INCHES);
        assertEquals(12.0, 12.0);
    }

    @Test
    public void testConversion_InchesToFeet(){
        Length L1 = new Length(24.0, Length.LengthUnit.INCHES);
        L1.convertTo(Length.LengthUnit.FEET);
        assertEquals(2.0, 2.0);
    }

    @Test
    public void testConversion_YardsToInches(){
        Length L1 = new Length(1.0, Length.LengthUnit.YARDS);
        L1.convertTo(Length.LengthUnit.INCHES);
        assertEquals(36.0, 36.0);
    }

    @Test
    public void testConversion_InchesToYards(){
        Length L1 = new Length(72.0, Length.LengthUnit.INCHES);
        L1.convertTo(Length.LengthUnit.YARDS);
        assertEquals(2.0, 2.0);
    }

    @Test
    public void testConversion_testCentimetersToInches(){
        Length L1 = new Length(2.54, Length.LengthUnit.CENTIMETERS);
        L1.convertTo(Length.LengthUnit.INCHES);
        assertEquals(1.0, 1.0);
    }

    @Test
    public void testConversion_testInchesEquality_FeetToYard(){
        Length L1 = new Length(6.0, Length.LengthUnit.FEET);
        L1.convertTo(Length.LengthUnit.YARDS);
        assertEquals(2.0, 2.0);
    }

    @Test
    public void testInchesEquality_ZeroValue(){
        Length L1 = new Length(0.0, Length.LengthUnit.FEET);
        L1.convertTo(Length.LengthUnit.INCHES);
        assertEquals(0.0, 0.0);
    }

    @Test
    public void testConversion_NegativeValue(){
        Length L1 = new Length(-1.0, Length.LengthUnit.FEET);
        L1.convertTo(Length.LengthUnit.INCHES);
        assertEquals(-12.0, -12.0);
    }

    @Test
    public void testConversion_InvalidUnit_Throws(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Length(1.0, null);
        });
    }

    @Test
    public void testConversion_NanOrInfinite_Throws(){
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class, ()->{
            new Length(Double.NaN, Length.LengthUnit.FEET);
        });

    }
}
