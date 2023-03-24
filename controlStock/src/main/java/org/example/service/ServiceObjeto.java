package org.example.service;

import org.example.connection.Connection;
import org.example.entity.Objeto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceObjeto {

    Connection cn= new Connection();
    Statement st=cn.getConnection().createStatement();
    PreparedStatement ps;
    ResultSet rs;

    public ServiceObjeto() throws SQLException {
    }

    public void ingresarProducto(String nombre, int precio) throws SQLException {

        ps=cn.getConnection().prepareStatement("insert into objetos (nombre,precio) VALUES(?,?)");
        ps.setString(1,nombre);
        ps.setInt(2,precio);
        ps.executeUpdate();
}


}
