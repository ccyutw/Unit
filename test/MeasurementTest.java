import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//Ensures relationships between units are correct
public class MeasurementTest {
    @Test
    public void shouldCompareFrom3YardToInch()
    {
        Measurement newMes = new Measurement(3, Unit.YARD);
        assertTrue(newMes.equals(new Measurement(108, Unit.INCH)));

    }
    @Test
    public void shouldConvertFrom2YardToInch()
    {
        Measurement newMes = new Measurement(2, Unit.YARD);
        assertTrue(newMes.equals(new Measurement(72, Unit.INCH)));

    }
    @Test
    public void shouldCompare1TbspAnd3TspAreEqual(){
        Measurement newMes = new Measurement(1,Unit.TBSP);
        assertTrue(newMes.equals(new Measurement(3, Unit.TSP)));

    }

    @Test
    public void shouldCompare1OzAnd6TspAreEqual(){
        Measurement newMes = new Measurement(1,Unit.OZ);
        assertTrue(newMes.equals(new Measurement(6, Unit.TSP)));

    }

    @Test
    public void shouldCompare1CupAnd48TspAreEqual(){
        Measurement newMes = new Measurement(1,Unit.CUP);
        assertTrue(newMes.equals(new Measurement(48, Unit.TSP)));
    }

    @Test
    public void shouldCompare1CupAnd16TbspAreEqual(){
        Measurement newMes = new Measurement(1,Unit.CUP);
        assertTrue(newMes.equals(new Measurement(16, Unit.TBSP)));
    }

    @Test
    public void shouldCompare1InchAnd1TspAreNotEqual(){
        Measurement newMes = new Measurement(1,Unit.INCH);
        assertFalse(newMes.equals(new Measurement(1, Unit.TSP)));
    }

    @Test
    public void shouldCompare1FeetAnd1TspAreNotEqual(){
        Measurement newMes = new Measurement(1,Unit.FEET);
        assertFalse(newMes.equals(new Measurement(1, Unit.TSP)));
    }
    @Test
    public void shouldCompare1YardAnd1TspAreNotEqual(){
        Measurement newMes = new Measurement(1,Unit.YARD);
        assertFalse(newMes.equals(new Measurement(1, Unit.TSP)));
    }
    @Test
    public void shouldCompare1KgAnd1000Grams(){
        Measurement newMes = new Measurement(1,Unit.KG);

        assertTrue(newMes.equals(new Measurement(1000,Unit.GRAM)));
    }
    @Test
    public void shouldAdd1KgAnd1000Grams(){
        Measurement newMes = new Measurement(1,Unit.KG);
        Measurement anotherNewMes = new Measurement(1000,Unit.GRAM);

        assertThat(newMes.add(anotherNewMes), is(new Measurement(2, Unit.KG)));
    }
    @Test
    public void shouldAdd2KgAnd1000Grams(){
        Measurement newMes = new Measurement(2,Unit.KG);
        Measurement anotherNewMes = new Measurement(1000,Unit.GRAM);

        assertThat(newMes.add(anotherNewMes), is(new Measurement(3, Unit.KG)));
    }
    @Test
    public void shouldAdd2ozAnd2Tbsp(){
        Measurement newMes = new Measurement(2,Unit.OZ);
        Measurement anotherNewMes = new Measurement(2,Unit.TBSP);

        assertThat(newMes.add(anotherNewMes), is(new Measurement(3, Unit.OZ)));
    }
    @Test
    public void shouldAdd2OzAnd1Inch(){
        Measurement newMes = new Measurement(2,Unit.OZ);
        Measurement anotherNewMes = new Measurement(2,Unit.TBSP);

        assertThat(newMes.add(anotherNewMes), is(new Measurement(3, Unit.OZ)));
    }


}

