package com.ejemplo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AppTest1 {
    @Test
    public void testSquareFunction() {
        // Definir la función square
        Function<Integer, Integer> square = x -> x * x;
        // Pruebas unitarias para la función square
        assertEquals(4, (int) square.apply(2));
        assertEquals(25, (int) square.apply(5));
        assertEquals(36, (int) square.apply(6));
        assertEquals(64, (int) square.apply(8));
        assertEquals(324, (int) square.apply(18));
        assertEquals(1156, (int) square.apply(34));
    }

    @Test
    public void testSquareCubeFunction() {
        // Definir la función squareCube
        Function<Integer, Integer> squareCube = x -> x * x * x;
        // Pruebas unitarias para la función squareCube
        assertEquals(8, (int) squareCube.apply(2));
        assertEquals(125, (int) squareCube.apply(5));
        assertEquals(216, (int) squareCube.apply(6));
        assertEquals(512, (int) squareCube.apply(8));
        assertEquals(5832, (int) squareCube.apply(18));
        assertEquals(39304, (int) squareCube.apply(34));
    }

    @Test
    public void testSquareAndSquareCubeWithList() {
        // Definir las funciones
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> squareCube = x -> x * x * x;
        // Lista de números de prueba
        List<Integer> numeros = Arrays.asList(2, 5, 6, 8, 18, 34);
        // Validar los resultados de aplicar las funciones a la lista
        assertEquals(4, (int) square.apply(numeros.get(0)));
        assertEquals(125, (int) squareCube.apply(numeros.get(1)));
        assertEquals(36, (int) square.apply(numeros.get(2)));
        assertEquals(512, (int) squareCube.apply(numeros.get(3)));
        assertEquals(324, (int) square.apply(numeros.get(4)));
        assertEquals(39304, (int) squareCube.apply(numeros.get(5)));
    }
}