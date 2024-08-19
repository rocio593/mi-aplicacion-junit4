package com.ejemplo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.function.Function;

public class AppTest2 {
    // Métodos reutilizables para las funciones square y squareCube
    private Function<Integer, Integer> square = x -> x * x;
    private Function<Integer, Integer> squareCube = x -> x * x * x;

    @Test
    public void testSquareFunction() {
        // Casos límite
        assertEquals(0, (int) square.apply(0));
        assertEquals(1, (int) square.apply(1));
        assertEquals(1, (int) square.apply(-1));
        assertEquals(100000000, (int) square.apply(10000));
    }

    @Test
    public void testSquareCubeFunction() {
        // Casos límite
        assertEquals(0, (int) squareCube.apply(0));
        assertEquals(1, (int) squareCube.apply(1));
        assertEquals(-1, (int) squareCube.apply(-1));
        assertEquals(1000000000, (int) squareCube.apply(1000));
    }

    // Ejemplo de prueba basada en propiedades 
    @Test
    public void testSquareProperties() {
        for (int i = -1000; i <= 1000; i++) {
            assertEquals(i * i, (int) square.apply(i));
        }
    }

    @Test
    public void testSquareCubeProperties() {
        for (int i = -100; i <= 100; i++) {
            assertEquals(i * i * i, (int) squareCube.apply(i));
        }
    }
}