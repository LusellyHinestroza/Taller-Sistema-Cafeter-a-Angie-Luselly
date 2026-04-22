package ejecicio4;

public class Whiles {
    public static void main(String[] args){
      int inventario = 50;
      int perdidos = 2;

      while (inventario >= 10){
          inventario -= perdidos;
         
          System.out.println(String.format("Pedidos realizados: " + perdidos + " inventario: " + inventario));
      }
        System.out.println("Inventario a gotado " + inventario);
    }
}
