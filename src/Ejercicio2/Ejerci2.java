package Ejercicio2;

public class Ejerci2 {
    public static void main(String[] args) {

        //Datos iniciales
        double subtotal = 42500;
        double porcentajeDescuento = 0.15;
        double limiteDescuento = 30000;

        //true o false
        boolean tieneDerecho = subtotal > limiteDescuento;

        //Valor del descuento
        double valorDescuento = subtotal * porcentajeDescuento;

        //Total a pagar
        double totalAPagar = subtotal - valorDescuento;

        //Resultados con System.out.printf
        // El %f es para números decimales
        // El %b es para booleanos
        System.out.printf("Valor del descuento: %.2f\n", valorDescuento);
        System.out.printf("Total a pagar: %.2f\n", totalAPagar);
        System.out.printf("¿Tiene derecho al descuento?: %b\n", tieneDerecho);
    }
}

