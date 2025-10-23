import java.util.ArrayList;
import java.util.Scanner;

public class DeleteProducto {

  public static void eliminarProducto(ArrayList<Producto> productos, Scanner entrada) {
    System.out.println("\n🗑️  ELIMINAR PRODUCTO");

    if (productos.isEmpty()) {
      System.out.println("⚠️  No hay productos disponibles para eliminar.");
      return;}

    System.out.println("\n📋 LISTADO DE PRODUCTOS DISPONIBLES:");
    System.out.println("========================================");

    for (Producto p : productos) {
      System.out.printf("%2d. %s%n", p.getId(), p.getNombre());}
    System.out.println("========================================");

    System.out.print("\nIngrese el ID del producto a eliminar: ");
    while (!entrada.hasNextInt()) {
      System.out.print("⚠️  Por favor, ingrese un número válido: ");
      entrada.next();}

    int id = entrada.nextInt();
    entrada.nextLine(); // limpiar buffer

    Producto producto = buscarPorId(productos, id);
    if (producto == null) {
      System.out.println("❌ Producto no encontrado.");
      return;
    }

    System.out.printf("¿Confirma eliminar \"%s\"? (s/n): ", producto.getNombre());
    String confirmacion = entrada.nextLine();

    if (confirmacion.equalsIgnoreCase("s")) {
      productos.remove(producto);
      System.out.println("✅ Producto eliminado correctamente.");
    } else {
      System.out.println("❎ Operación cancelada.");
    }
  }

  private static Producto buscarPorId(ArrayList<Producto> productos, int id) {
    for (Producto p : productos) {
      if (p.getId() == id) return p;
    }
    return null;
  }
}

