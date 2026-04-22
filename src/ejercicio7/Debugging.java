package ejercicio7;

public class Debugging {
    public static void main(String[] args){
        int cantidadVendida = 5; /* SALE ERROR POR QUE DICES QUE ES UN ENTERO PERO PONES UN STRING*/
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;
        boolean aplicaDescuento = (total > 20000); /* NO TENIA EL ;*/
        if (aplicaDescuento == true) { /* LE FALTA =*/
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);

    }
}
