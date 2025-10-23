import java.util.ArrayList;

public class ReadProductos {

  public static void mostrarProductos(ArrayList<Producto> productos) {
    System.out.println("\n📋 LISTA DE PRODUCTOS: ");
    System.out.println("========================================");

    if (productos.isEmpty()) {
      System.out.println("⚠️  No hay productos para mostrar.");
    } else {
      for (Producto p : productos) {
        System.out.printf("%2d. %s%n", p.getId(), p.getNombre());
      }
    }

    System.out.println("========================================");
  }
}