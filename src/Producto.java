public class Producto {
  private int id;
  private String nombre;

  public Producto(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

 // public boolean coincideId(int idBuscado) {
   // return this.id == idBuscado;
  //}

  @Override
  public String toString() {
    return String.format("%2d. %s", id, nombre);
  }
}