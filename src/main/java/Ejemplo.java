
import java.util.Scanner; // Libreria java que toma datos de entrada por teclado

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
public class Ejemplo {

    /**
     * // Metodo principal punto donde inicia el programa
     */
    public static void main(String[] args) {
        
        Scanner lec = new Scanner(System.in); //Declaracion de variable que toma dato por teclado
        final int totalEdades = 3; // Se declara una constante
        int edades [] = new int [totalEdades]; // Arreglo puede almacenar maximo 10 numeros enteros
        // Ciclo que haceun recorrido de Diez repeticiones para agregar elementos del arreglo
        for (int i = 0; i < totalEdades; i++) {
            System.out.println("\n Ingrese edad"); // Mensaje de texto en pantalla
            edades [i] = lec.nextInt();// Guaramos el elemento en el arreglo
            
        }
        // Ciclo que hace un recorrido de Diez repeticiones para imprimir elemtos del arreglo
        System.out.println("\n Impresion de edades: "); // Mensaje de texto en pantalla
        System.out.println("# "+ " Edad ");
        for (int i = 0; i < totalEdades; i++) {
            
            System.out.println(i + 1 +"  "+edades[i]+"  "); // Imprime el elemento de arreglo
            
            
        } 
        
        // Buscar un elemento en el arreglo
        System.out.println("Ingrese el valor a buscar: ");
        int elementoBuscado = lec.nextInt();
        boolean encontrado = false;
        
        
        for (int i = 0; i < 3 ; i++) {
            if (edades [i] == elementoBuscado) {
                System.out.println("La edad " + elementoBuscado + " se encuentra en la posicion " + i + " del arreglo ");
                encontrado = true;
                break;
                
            }
            
            
            
        }
        
        if (!encontrado) {
            System.out.println("La edad " + elementoBuscado + " no se encuentra el arreglo.");
            
        }
        
        
    }
}
