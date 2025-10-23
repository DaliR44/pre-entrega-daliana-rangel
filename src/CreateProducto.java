import java.util.ArrayList;
import java.util.Scanner;

public class CreateProducto {

  public static void agregarProducto(int id, ArrayList<Producto> productos, Scanner entrada) {
    System.out.println("\n🆕 CREANDO NUEVO PRODUCTO");
    System.out.print("Ingrese el nombre del producto: ");
    String nombre = entrada.nextLine().trim();

    if (nombre.isEmpty()) {
      System.out.println("❌ El nombre no puede estar vacío.");
    } else {
      productos.add(new Producto(id, nombre));
      System.out.println("✅ Producto agregado exitosamente con ID: " + id);
    }
  }
}