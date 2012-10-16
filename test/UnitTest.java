
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

//

import org.junit.Test;

public class UnitTest {

    @Test
    public void shouldReturn36InchesFrom3Foot()
    {
        assertEquals(36, Unit.FEET.convertToBase(3));

    }
    @Test
    public void shouldReturn24InchesFrom2Foot()
    {
        assertEquals(24, Unit.FEET.convertToBase(2));

    }
    @Test
    public void shouldReturn36InchesFrom1Yard()
    {
        assertEquals(36, Unit.YARD.convertToBase(1));

    }
    @Test
    public void shouldReturn72InchesFromYards()
    {
        assertEquals(72, Unit.YARD.convertToBase(2));

    }
    @Test
    public void shouldConvertBaseToOther(){

        assertEquals(1,Unit.GRAM.convertBaseToOther(Unit.KG,1000));
    }


}

