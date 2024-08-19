package com.ejemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {	System.out.println( "========================" );
        System.out.println( "||El nuevo 2.1.0 Group||" );
        System.out.println( "========================" );

        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> squareCube = x -> x * x * x;
        // Ejemplo de uso
        int num = 5;
        int result = square.apply(num);
        int resultCube = squareCube.apply(num);
        
        List<Integer> numeros = Arrays.asList(2, 5, 6, 8, 18, 34);
        
        for (int i = 0; i < numeros.size(); i++) {
        	System.out.println("Número a operar "+numeros.get(i));
            System.out.println("El cuadrado de " + numeros.get(i) + " es: " + square.apply(numeros.get(i))+" y su cubo es: " + squareCube.apply(numeros.get(i)));
            System.out.println("___________________________________________");
        	
		}
    }
}


