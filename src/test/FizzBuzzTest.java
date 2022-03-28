package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void test_multiplo_de_tres(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.esMultiploDeTres(3), true);
    }

    @Test
    void test_multiplo_de_cinco(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.esMultiploDeCinco(5), true);

    }

    @Test
    void test_multiplo_tres_y_cinco(){

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.esMultiploDeTresYCinco(30), true);
    }

}
