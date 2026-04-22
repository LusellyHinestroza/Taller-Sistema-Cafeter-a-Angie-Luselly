package Ejercicio5;

public class Ejerci5 {
    public static void main(String[] args) {

        //Declaración de  la variable del monto de apertura
        //Se inicia con un valor negativo -10 para cumplir lo que pide el ejercicio
        double montoApertura = -10;

        System.out.println("Iniciando El Turno De La Caja");

        //Estructura do-while
        do {
            System.out.println("Intentando ingresar monto: " + montoApertura);

            if (montoApertura <= 0) {
                System.out.println("Error: El monto debe ser mayor a $0. Intente de nuevo.");

                // Simulamos que el cajero ahora ingresa un valor correcto para que el ciclo termine
                montoApertura = 80000;
            }

        } while (montoApertura <= 0); //Aqui el ciclo se repite mientras el monto sea inválido

        //Mensaje final
        System.out.println("Caja abierta exitosamente con: $" + montoApertura);
    }
}

