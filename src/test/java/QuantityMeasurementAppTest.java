import org.example.Length;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testConversion_FeetToInches(){
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        double actual = l1.convertTo(Length.LengthUnit.INCHES);
        double expected = 12.0;
        assertEquals(expected, actual);

    }

    @Test
    public void testConversion_InchesToFeet(){
        Length l1 = new Length(24.0, Length.LengthUnit.INCHES);
        double actual = l1.convertTo(Length.LengthUnit.FEET);
        double expected = 2.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_YardsToInches(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        double actual = l1.convertTo(Length.LengthUnit.INCHES);
        double expected = 36.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_InchesToYards(){
        Length l1 = new Length(72.0, Length.LengthUnit.INCHES);
        double actual = l1.convertTo(Length.LengthUnit.YARDS);
        double expected = 2.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_testCentimetersToInches(){
        Length l1 = new Length(2.54, Length.LengthUnit.CENTIMETERS);
        double actual = l1.convertTo(Length.LengthUnit.INCHES);
        double expected = 1.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_testInchesEquality_FeetToYard(){
        Length l1 = new Length(6.0, Length.LengthUnit.FEET);
        double actual = l1.convertTo(Length.LengthUnit.YARDS);
        double expected = 2.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testInchesEquality_ZeroValue(){
        Length l1 = new Length(0.0, Length.LengthUnit.FEET);
        double actual = l1.convertTo(Length.LengthUnit.INCHES);
        double expected = 0.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_NegativeValue(){
        Length l1 = new Length(-1.0, Length.LengthUnit.FEET);
        double actual = l1.convertTo(Length.LengthUnit.INCHES);
        double expected = -12.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testConversion_InvalidUnit_Throws(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Length(1.0, null);
        });
    }

    @Test
    public void testConversion_NanOrInfinite_Throws(){
         assertThrows(IllegalArgumentException.class, ()->{
            new Length(Double.NaN, Length.LengthUnit.FEET);
        });

    }
}
