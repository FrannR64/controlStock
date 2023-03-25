package org.example.service;

import org.example.connection.Connection;
import org.example.entity.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServiceProducto {

    Connection cn = new Connection();

    PreparedStatement ps;
    ResultSet rs;

    public ServiceProducto()  {
    }

    public void ingresarProducto(String nombre, int precio) throws SQLException {

        ps = cn.getConnection().prepareStatement("insert into objetos (nombre,precio) VALUES(?,?)");
        ps.setString(1, nombre);
        ps.setInt(2, precio);
        ps.executeUpdate();
    }

    public ArrayList<Producto> agregarFilas() throws SQLException {
        ArrayList<Producto> arrayProductos = new ArrayList<>();
        ps = cn.getConnection().prepareStatement("select * from objetos");
        rs = ps.executeQuery();
        while (rs.next()) {
            Producto obj = new Producto(rs.getInt(1), rs.getInt(3), rs.getString(2));
            arrayProductos.add(obj);
        }

        return arrayProductos;

    }

}
