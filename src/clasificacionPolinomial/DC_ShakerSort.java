/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificacionPolinomial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DC_ShakerSort {
    
    public static int[] ordenarArray(int[] a){
	int izq, der, k, aux;
	izq = 1;
	der = a.length - 1;
	k = a.length - 1;
        
                
	while(izq <= der){            
            for(int i = der; i >= izq; i--){
		if(a[i - 1] > a[i]){
                    aux = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = aux;
                    k = i;
		}
            }
            izq = k + 1;
                        
            for(int i = izq; i <= der; i++){
		if(a[i - 1] > a[i]){
                    aux = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = aux;
                    k = i;
		}
            }
            der = k - 1;
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
        
        System.out.println("Introduciendo el array a ordenar ");
        System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
        
        Array = leerArreglo(tamaño);
        imprimirArreglo(Array);
        
        Array = ordenarArray(Array);
        imprimirArreglo(Array);
        
        
    }
    
}
