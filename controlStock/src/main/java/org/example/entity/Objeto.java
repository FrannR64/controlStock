package org.example.entity;

public class Objeto {
    private int precio;
    private  String Producto;


    public Objeto(int precio, String nombre) {
        this.precio = precio;
        this.Producto = nombre;
    }

    public Objeto() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        this.Producto = producto;
    }
}
