/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiempoLineal;

import static clasificacionPolinomial.DC_IBinaria.bufer;
import static clasificacionPolinomial.DC_IBinaria.entrada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Gateway
 */
public class RadixSort {
	
    public static int[] radixSort(int[] a) {
        int rep=1;
        int numBytes=4;
        int numColas=(int) Math.pow(2, numBytes);
                
        Queue[] cola = new LinkedList[numColas];
        for(int i = 0; i < numColas; i++)
            cola[i] = new LinkedList();
        
        int div=0;
        for(int i = 0; i < rep; i++){
            for(int numero:a){
                if(i==0)
                    if(numero>rep)
                        rep=numero;
                int numCola = (numero>>div)&0xf;
                cola[numCola].add(numero);
            }
            div = div + numBytes;
            int j=0;
            for(Queuec:cola){
                while(!c.isEmpty())
                    a[j++] = c.remove();
            }
            if(i==0)
                rep = (int) (Math.log(rep) / Math.log(numColas)) + 1;
        }
        return a;
    }
    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static int[] leerArreglo(int n) throws IOException{
        int[] a = new int[n];
        System.out.println("-------------------------------------");
        for(int i = 0; i < a.length; i++){
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
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
        int tamaño;
        
	System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
	
        Array = leerArreglo(tamaño);
	imprimirArreglo(Array);
		
	Array = radixSort(Array);
		
	System.out.println("Valores ordenados mediante algoritmo Radix Sort");
	System.out.println(Arrays.toString(Array));
    }
    
}