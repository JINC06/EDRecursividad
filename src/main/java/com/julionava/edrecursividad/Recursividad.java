/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julionava.edrecursividad;

import java.util.Arrays;

/**
 *
 * @author julio.nava
 */
public class Recursividad {
    
    //Factorial:
    public int factorial(int n) {
        if (n == 0) return 1; // Caso base
        return n * factorial(n-1); // Llamada recursiva
    }
    
    //Fibonacci:
    public int fibonacci(int n) {
        if (n <= 1) return n; // Caso base
        return fibonacci(n-1) + fibonacci(n-2); // Llamada recursiva
    }
    
    //Calcular el máximo común divisor (MCD):
    public int mcd(int a, int b) {
        if (b == 0) return a; // Caso base
        return mcd(b, a % b); // Llamada recursiva
    }
    
    //Imprimir números del 1 al n:
    public void imprimirNumeros(int n) {
        if (n <= 0) return; // Caso base
        imprimirNumeros(n-1); // Llamada recursiva
        System.out.println(n);
    }
    
    //Calcular la potencia de un número:
    public int potencia(int base, int exponente) {
        if (exponente == 0) return 1; // Caso base
        return base * potencia(base, exponente-1); // Llamada recursiva
    }
    
    //Buscar un elemento en una lista:
    public boolean buscarElemento(int elemento, int[] lista, int tamano) {
        if (tamano == 0) return false; // Caso base
        if (lista[0] == elemento) return true; // Caso base
        return buscarElemento(elemento, Arrays.copyOfRange(lista, 1, tamano), tamano-1); // Llamada recursiva
    }
    
    //Calcular la suma de los elementos de una lista
    public int sumaLista(int[] lista, int tamano) {
        if (tamano == 0) return 0; // Caso base
        return lista[0] + sumaLista(Arrays.copyOfRange(lista, 1, tamano), tamano-1); // Llamada recursiva
    }
    
    
}
