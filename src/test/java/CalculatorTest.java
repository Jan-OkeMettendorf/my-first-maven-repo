import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testCalcAdd(){

        //GIVE

        int a = 2;
        double b = 3;

        //WHEN

        double result = Calculator.calculateAdd(a, b);

        //THEN

        Assertions.assertEquals(5, result);

    }

    @Test
    void testCalcSub(){

        //GIVE

        int a = 2;
        double b = 3;

        //WHEN

        double result = Calculator.calculateSub(a, b);

        //THEN

        Assertions.assertEquals(-1, result);

    }

    @Test
    void testCalcMul(){

        //GIVE

        int a = 2;
        double b = 3;

        //WHEN

        double result = Calculator.calculateMul(a, b);

        //THEN

            Assertions.assertEquals(6, result);

    }

    @Test
    void testCalcDiv(){

        //GIVE

        int a = 2;
        double b = 4;

        //WHEN

        double result = Calculator.calculateDiv(a, b);

        //THEN

        Assertions.assertEquals(0.5, result);

    }

    @Test
    void testCheckGreaterThan100True(){

        //GIVE

        int a = 200;
        double b = 4;

        //WHEN

        boolean result = Calculator.checkSomeNumberGreaterThan100(a, b);

        //THEN

        Assertions.assertTrue(result);

    }

    @Test
    void testCheckGreaterThan100False(){

        //GIVE

        int a = 5;
        double b = 4;

        //WHEN

        boolean result = Calculator.checkSomeNumberGreaterThan100(a, b);

        //THEN

        Assertions.assertFalse(result);

    }

    @Test
    void testCheckFancyTrue(){

        //GIVE

        String word = "asdfancyasd";

        //WHEN

        boolean result = Calculator.checkWordContainsFancy(word);

        //THEN

        Assertions.assertTrue(result);

    }

    @Test
    void testCheckFancyFalse(){

        //GIVE

        String word = "asdasd";

        //WHEN

        boolean result = Calculator.checkWordContainsFancy(word);

        //THEN

        Assertions.assertFalse(result);

    }

    @Test
    void testCheckLengthGreaterThan20CharsTrue(){

        //GIVE

        String word = "asdasasdag4gneklbmemb54b5zt45d";

        //WHEN

        boolean result = Calculator.checkLengthWordGreaterThan20Chars(word);

        //THEN

        Assertions.assertTrue(result);

    }

    @Test
    void testCheckLengthGreaterThan20CharsFalse(){

        //GIVE

        String word = "asdasat45d";

        //WHEN

        boolean result = Calculator.checkLengthWordGreaterThan20Chars(word);

        //THEN

        Assertions.assertFalse(result);

    }





}
