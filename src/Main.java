import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Producto> productosDB = obtenerProductosPredeterminados();
    int idSiguiente = productosDB.size() + 1;
    int opcionUsuario;

    System.out.println("🧵 Bienvenido/a a LANA STORE  🧶");

    menuPrincipal:
    while (true) {
      mostrarMenuPrincipal();

      while (!entrada.hasNextInt()) {
        System.out.print("⚠️  Por favor, ingrese un número válido: ");
        entrada.next();}
      opcionUsuario = entrada.nextInt();
      entrada.nextLine();

      switch (opcionUsuario) {
        case 1 -> {
          CreateProducto.agregarProducto(idSiguiente, productosDB, entrada);
          idSiguiente++;
          pausa(entrada);}
        case 2 -> {ReadProductos.mostrarProductos(productosDB);
          pausa(entrada);}
        case 3 -> {SearchProducto.buscarProducto(productosDB, entrada);
          pausa(entrada);}
        case 4 -> {UpdateProducto.editarProducto(productosDB, entrada);
          pausa(entrada);}
        case 5 -> {
          DeleteProducto.eliminarProducto(productosDB, entrada);
          pausa(entrada);}
        case 0 -> {
          System.out.println("\n👋 ¡Gracias por usar LANA STORE! Hasta pronto.");
          break menuPrincipal;}
        default -> {
          System.out.println("⚠️  Opción incorrecta, intente nuevamente.");
          pausa(entrada);}
      }
    }

    entrada.close();
  }

  public static void mostrarMenuPrincipal() {
    System.out.println("""
                
                \u001B[33m=========== MENÚ PRINCIPAL ===========\u001B[0m
                1️⃣  Crear producto
                2️⃣  Listar productos
                3️⃣  Buscar producto por nombre
                4️⃣  Editar producto
                5️⃣  Borrar producto
                0️⃣  Finalizar programa
                ========================================
                """);
    System.out.print("👉 Ingrese el número de la opción: ");
  }

  public static ArrayList<Producto> obtenerProductosPredeterminados() {
    ArrayList<Producto> productos = new ArrayList<>();
    productos.add(new Producto(1, "Hilo de algodón blanco"));
    productos.add(new Producto(2, "Hilo de algodón negro"));
    productos.add(new Producto(3, "Lana merino gris"));
    productos.add(new Producto(4, "Lana gruesa roja"));
    productos.add(new Producto(5, "Hilo de seda natural"));
    productos.add(new Producto(6, "Hilo de bordar multicolor"));
    productos.add(new Producto(7, "Agujas de tejer Nº5"));
    productos.add(new Producto(8, "Agujas de crochet Nº3"));
    productos.add(new Producto(9, "Set de marcadores de puntos"));
    productos.add(new Producto(10, "Bolsa organizadora de lanas"));
    return productos;
  }

  public static void pausa(Scanner entrada) {
    System.out.println("\nPresione ENTER para continuar...");
    entrada.nextLine();
    limpiarConsola();
  }

  public static void limpiarConsola() {
    for (int i = 0; i < 10; i++) System.out.println();
  }
}