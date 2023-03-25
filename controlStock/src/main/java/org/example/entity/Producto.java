package org.example.entity;

public class Producto {
    private int id;
    private int precio;
    private  String Producto;


    public Producto(int id, int precio, String nombre) {
        this.id=id;
        this.precio = precio;
        this.Producto = nombre;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
