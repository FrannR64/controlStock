package org.example.Controllers;
import org.example.interfaz.IngresarProducto;
import org.example.service.ServiceObjeto;
import java.sql.SQLException;


public class ControllerObjeto {

    ServiceObjeto service=new ServiceObjeto();

    public ControllerObjeto() throws SQLException {
    }

    public void ingresarProducto(String nombre,int precio) throws SQLException {

        service.ingresarProducto(nombre,precio);

    }

}
