package com.mycompany.multiplicarnumeros;
import java.util.Scanner;
public class MultiplicarNumeros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double n1 = lector.nextInt();
        double n2 = lector.nextInt();
        double res = n1*n2;
        System.out.println("El Resultado de la multiplicación es: " + res);                
    }
}
