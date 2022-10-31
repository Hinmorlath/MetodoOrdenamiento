/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempoLineal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Gateway
 */
public class countingSort {
	
    public static void countingSort(int[] a, int limite) {
	int[] contadores = new int[limite + 1];
        int indice = 0;
		
	for(int valor: a)
            contadores[valor]++;
		
	for(int i = 0; i < contadores.length; i++){
            while(0 < contadores[i]){
		a[indice] = i;
		indice++;
		contadores[i]--;
            }
	}
    }
    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static int[] crearArreglo(int n, int lim) throws IOException{
        int[] a = new int[n];
	Random azar = new Random();
            for (int i = 0; i < n; i++)
		a[i] = azar.nextInt(lim + 1);
        return a;
    }
     public static void imprimirArreglo(int[] a) {
        System.out.println("---------------------------------------");
        System.out.println("Impresión de arreglos");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%4d", a[i]);
        }
         System.out.println("");
    }
    
    public static void main(String[] args) throws IOException {
        int[] Array;
        int tamaño, limite, dato;
        
	System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
        
        System.out.println("Se crearán valores entre 0 y un límite que tú decides.");
        
        System.out.println("Escribe el limite de los valores de tu Array: ");
        entrada = bufer.readLine();
        limite = Integer.parseInt(entrada);
	
        Array = crearArreglo(tamaño, limite);
	imprimirArreglo(Array);
		
	countingSort(Array, limite);
		
	System.out.println("Valores ordenados mediante algoritmo Counting Sort");
	System.out.println(Arrays.toString(Array));
    }
    
}