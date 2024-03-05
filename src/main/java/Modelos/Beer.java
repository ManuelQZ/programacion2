package Modelos;

public class Beer {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String color;
    private String volumenAlcohol;

    public Beer(BeerBuilder builder){
       this.nombre = builder.nombre;
       this.tipo = builder.tipo;
       this.cantidad = builder.cantidad;
       this.color = builder.color;
       this.volumenAlcohol = builder.volumenAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getColor() {
        return color;
    }

    public String getVolumenAlcohol() {
        return volumenAlcohol;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", volumenAlcohol='" + volumenAlcohol + '\'' +
                '}';
    }
}
