/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package ejerciciosguia4;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro:");
        int num2 = sc.nextInt();
        System.out.println("1.Sumar // 2.Restar // 3.Multiplicar // 4.Dividir");
        int opc = sc.nextInt();
        switch(opc){
            case 1:
                System.out.println(sumar(num1,num2));
            break;
               
        }
        
        
    }
    public static int sumar(int num1,int num2){
        int suma;
        suma = num1 + num2;
        return suma;
    }
}
