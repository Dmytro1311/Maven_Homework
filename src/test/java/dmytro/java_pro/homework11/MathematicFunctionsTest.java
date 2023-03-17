package dmytro.java_pro.homework11;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MathematicFunctionsTest {
    MathematicFunctions mathematicFunctions =  new MathematicFunctions();

    @Test

    public void  additionTest(){
        assertEquals(7.0,mathematicFunctions.addition(5,2));
    }

    @Test
    public void  subtractionTest(){
        assertEquals(6.0,mathematicFunctions.subtraction(10,4));



    }
    @Test
    public void  divisionTest(){
        assertEquals(5.0,mathematicFunctions.division(20,4));

    }
    @Test
    public void  multiplicationTest(){
        assertEquals(80.0,mathematicFunctions.multiplication(20,4));

    }
}
