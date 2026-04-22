package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        System.out.print("Ingresa la categoria de la bebida: ");
        Scanner sc = new Scanner(System.in);

        //Convertimos a char el primer caracter que se ingrese a 'categoria'
        char categoria = sc.next().charAt(0);

        //Convertimos el caracter en mayuscula
        switch (Character.toUpperCase(categoria)) {
            case 'B':
                System.out.println("Bebidas calientes 0%");
                break;
            case 'F':
                System.out.println("Bebida fria 5%");
                break;
            case 'C':
                System.out.println("Comida 8%");
                break;
            case 'P':
                System.out.println("Postre 8%");
        }
    }
}
