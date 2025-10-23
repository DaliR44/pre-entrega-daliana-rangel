import java.util.Scanner;
import java.util.ArrayList;

public class UpdateProducto {

  public static void editarProducto(ArrayList<Producto> productos, Scanner entrada) {
    System.out.println("\n✏️  EDITAR PRODUCTO");

    if (productos.isEmpty()) {
      System.out.println("⚠️  No hay productos disponibles para editar.");
      return;
    }

    // Mostrar productos disponibles antes de pedir ID
    System.out.println("\n📋 LISTADO DE PRODUCTOS DISPONIBLES:");
    System.out.println("========================================");
    for (Producto p : productos) {
      System.out.printf("%2d. %s%n", p.getId(), p.getNombre());
    }
    System.out.println("========================================");

    System.out.print("\nIngrese el ID del producto a editar: ");

    // Validar que el usuario ingrese un número válido
    while (!entrada.hasNextInt()) {
      System.out.print("⚠️  Por favor, ingrese un número válido: ");
      entrada.next();
    }
    int id = entrada.nextInt();
    entrada.nextLine(); // limpiar buffer

    Producto producto = buscarPorId(productos, id);
    if (producto == null) {
      System.out.println("❌ Producto no encontrado.");
      return;
    }

    System.out.println("Producto actual: " + producto.getNombre());
    System.out.print("Ingrese el nuevo nombre (ENTER para dejar igual): ");
    String nuevoNombre = entrada.nextLine().trim();

    if (!nuevoNombre.isEmpty()) {
      producto.setNombre(nuevoNombre);
      System.out.println("✅ Nombre actualizado correctamente.");
    } else {
      System.out.println("ℹ️  No se realizaron cambios.");
    }
  }

  private static Producto buscarPorId(ArrayList<Producto> productos, int id) {
    for (Producto p : productos) {
      if (p.getId() == id) return p;
    }
    return null;
  }
}
