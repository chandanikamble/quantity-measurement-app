import org.example.Length;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testAddition_SameUnit_FeetPlusFeet(){
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(2.0, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(3.0, Length.LengthUnit.FEET);
        assertEquals(expected , actual);
    }

    @Test
    public void testAddition_SameUnit_InchPlusInch(){
        Length l1 = new Length(6.0, Length.LengthUnit.INCHES);
        Length l2 = new Length(6.0, Length.LengthUnit.INCHES);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_CrossUnit_FeetPlusInches(){
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(2.0, Length.LengthUnit.FEET);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_CrossUnit_InchPlusFeet(){
        Length l1 = new Length(12.0, Length.LengthUnit.INCHES);
        Length l2 = new Length(1.0, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(24.0, Length.LengthUnit.INCHES);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_CrossUnit_YardPlusFeet(){
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(3.0, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(2.0, Length.LengthUnit.YARDS);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_CrossUnit_CentimeterPlusInch(){
        Length l1 = new Length(2.54, Length.LengthUnit.CENTIMETERS);
        Length l2 = new Length(1.0, Length.LengthUnit.INCHES);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(5.08, Length.LengthUnit.CENTIMETERS);
        assertEquals(expected, actual);
    }
    // 7
//    @Test
//    public void testAddition_Commutativity(){
//        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
//        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);
//        Length actual = Length.add(l1, l2);
//        Length expected = new Length(5.08, Length.LengthUnit.CENTIMETERS);
//        assertEquals(expected, actual);
//    }

    @Test
    public void testAddition_WithZero(){
        Length l1 = new Length(5.0, Length.LengthUnit.FEET);
        Length l2 = new Length(0.0, Length.LengthUnit.INCHES);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(5.0, Length.LengthUnit.FEET);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_NegativeValues(){
        Length l1 = new Length(5.0, Length.LengthUnit.FEET);
        Length l2 = new Length(-2.0, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(3.0, Length.LengthUnit.FEET);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_NullSecondOperand(){
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = null;
        NullPointerException ex = assertThrows(
                NullPointerException.class,
                () -> Length.add(l1, l2)
        );
        assertEquals("Length arguments must not be null.", ex.getMessage());
    }

    @Test
    public void testAddition_LargeValues(){
        Length l1 = new Length(1e6, Length.LengthUnit.FEET);
        Length l2 = new Length(1e6, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(2e6, Length.LengthUnit.FEET);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddition_SmallValues(){
        Length l1 = new Length(0.002, Length.LengthUnit.FEET);
        Length l2 = new Length(0.002, Length.LengthUnit.FEET);
        Length actual = Length.add(l1, l2);
        Length expected = new Length(0.004, Length.LengthUnit.FEET);
        assertEquals(expected, actual);
    }
}
