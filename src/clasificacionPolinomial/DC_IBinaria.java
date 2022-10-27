/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificacionPolinomial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class DC_IBinaria {
    
    public static int inferior(int[] a, int inf){
        int menor = inf;
        for (int i = inf; i < a.length; i++) {
            if (a[i] < a[menor]) {
                menor = i;
            }
        }
        return menor;
    }
    
    public static int[] ordenarArray(int[] a){
    for (int i = 0; i < a.length; i++){
              int menor = inferior(a, i);
              int temp = a[i];
              a[i] = a[menor];
              a[menor] = temp;
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
     public static int buscar(int[] a, int dato) {
        int inicio = 0;
        int fin = a.length - 1;
        int posicion;
            while(inicio <= fin) {
                posicion = (inicio + fin) / 2;
                if(a[posicion] == dato)
                    return posicion;
                else
                    if(a[posicion] < dato)
                        inicio = posicion + 1;
                    else
                        fin = posicion - 1;
            }
        return -1;
    }
    
    public static void main(String[] args) throws IOException {
        int[] Array;
        int tamaño, dato;
        
        System.out.println("Introduciendo el array a ordenar ");
        System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
        
        Array = leerArreglo(tamaño);
        imprimirArreglo(Array);
        
        Array = ordenarArray(Array);
        imprimirArreglo(Array);
        
        System.out.println("¿Cuál es el número que quieres buscar?");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        
        int resultado = buscar(Array, dato);

        if (resultado != -1) {
            System.out.println ( "Encontrado en: "+  resultado);
        } else {
            System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no estÃ¡ ordenado."  );
        }
        
    }
    
}
