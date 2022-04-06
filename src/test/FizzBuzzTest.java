package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Test
    void uno_devuelve_uno(){

        fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.imprimir(1), "1");
    }

    @Test
    void dos_devuelve_dos(){

        fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.imprimir(2), "2");
    }

    @Test
    void tres_devuelve_fizz(){

        fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.imprimir(3), "Fizz");
    }

    @Test
    void cinco_devuelve_buzz(){

        fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.imprimir(5), "Buzz");
    }

    @Test
    void quince_devuelve_fizzbuzz(){

        fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.imprimir(15), "FizzBuzz");
    }

    @Test
    void contiene_numero_tres(){

        fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.imprimir(34));
    }

    @Test
    void contiene_numero_cinco(){

        fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.imprimir(75));
    }

}
