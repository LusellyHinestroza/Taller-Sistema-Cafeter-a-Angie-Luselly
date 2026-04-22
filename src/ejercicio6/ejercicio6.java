package ejercicio6;

public class ejercicio6 {
    public static void main(String[] args) {
        // Se hardcordea los elementos de productos y precios.
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        //Se inicializa el total fuera del scope del for
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            //Vamos incrementando el total según los precios que esten en el arrreglo
            total = total + precios[i];
            //Imprimimos el precio de cada producto
            System.out.println((i + 1) + ". " + productos[i] + " precio: " + precios[i]);
            //Se valida Sí estamos en la última iteración
            if (i == productos.length - 1) {
                total = total / precios.length;
            }
        }


        System.out.println("El precio promedio del menu es: " + total);
    }
}
