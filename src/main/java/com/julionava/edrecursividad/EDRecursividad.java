/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julionava.edrecursividad;

/**
 *
 * @author julio.nava
 */
public class EDRecursividad {
    
    public static void main(String[] args) {
        //System.out.println("Pruebas");
        
        Recursividad recursividad = new Recursividad();
        
        int respuestaFactorial = recursividad.factorial(5);
        System.out.println("Respuesta factorial: " + respuestaFactorial);
        
        int fibonacci = recursividad.fibonacci(6);
        System.out.println("Respuesta fibonacci: " + fibonacci);
        
        int mcdRespuesta = recursividad.mcd(50, 120);
        System.out.println("Respuesta MCD: " + mcdRespuesta);
        
        System.out.println("--------------------------------------");
        recursividad.imprimirNumeros(5);
        System.out.println("--------------------------------------");
        
        int respuestaPotencia = recursividad.potencia(3, 4);
        System.out.println("Respuesta potencia: " + respuestaPotencia);
        
        int elementoABuscar = 10;
        int[] lista = { 2, 6, 7, 98, 23, 10, 54, 74 };
        int tamano = lista.length;
        
        boolean seEncontro = recursividad.buscarElemento(elementoABuscar, lista, tamano);
        System.out.println("Se encontro el elemento: " + seEncontro);
        
        int[] listaSuma = { 45, 74, 96 };
        int sumaListaRespuesta = recursividad.sumaLista(listaSuma, listaSuma.length);
        System.out.println("Suma de la lista: " + sumaListaRespuesta);
    }
    
}
