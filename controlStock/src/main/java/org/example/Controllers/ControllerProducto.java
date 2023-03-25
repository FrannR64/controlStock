package org.example.Controllers;

import org.example.entity.Producto;
import org.example.service.ServiceProducto;

import java.sql.SQLException;
import java.util.ArrayList;


public class ControllerProducto {

    ServiceProducto service = new ServiceProducto();

    public ControllerProducto()  {
    }

    public void ingresarProducto(String nombre, int precio) throws SQLException {

        service.ingresarProducto(nombre, precio);

    }

    public ArrayList<Producto> agregarFilas() throws SQLException {
        ArrayList<Producto>listaFilas=service.agregarFilas();
        return listaFilas;

    }
}
