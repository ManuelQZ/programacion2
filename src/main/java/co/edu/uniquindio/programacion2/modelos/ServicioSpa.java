package co.edu.uniquindio.programacion2.modelos;

public class ServicioSpa extends Servicio {
  public ServicioSpa(String nombre) {
    super(nombre);
  }

  @Override
  public void Consumible() {
    System.out.println("Consumiendo desde spa...");
  }
}
