package Modelos;

public class BeerBuilder {
    protected String nombre;
    protected String tipo;
    protected int cantidad;
    protected String color;
    protected String volumenAlcohol;

    public BeerBuilder(){

    }

    public BeerBuilder nombre(String nombre){

        this.nombre = nombre;
        return this;
    }
    public BeerBuilder tipo(String tipo){

        this.tipo = tipo;
        return this;
    }
    public BeerBuilder cantidad(int cantidad){

        this.cantidad = cantidad;
        return this;
    }
    public BeerBuilder color(String color){

        this.color = color;
        return this;
    }
    public BeerBuilder volumenAlcohol(String volumenAlcohol){

        this.volumenAlcohol = volumenAlcohol;
        return this;
    }
    public Beer build(){
        Beer cerveza = new Beer(this);
        return cerveza;
    }

}
