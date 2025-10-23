import java.util.ArrayList;
import java.util.Scanner;

public class SearchProducto {

  public static void buscarProducto(ArrayList<Producto> productos, Scanner entrada) {
    System.out.print("\n Ingrese el nombre del producto a buscar 🔍 : ");
    String busqueda = entrada.nextLine().trim().toLowerCase();

    ArrayList<Producto> encontrados = new ArrayList<>();
    for (Producto p : productos) {
      if (p.getNombre().toLowerCase().contains(busqueda)) {
        encontrados.add(p);
      }
    }

    if (encontrados.isEmpty()) {
      System.out.println("❌ No se encontraron coincidencias.");
    } else {
      ReadProductos.mostrarProductos(encontrados);
    }
  }
}
