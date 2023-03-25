package org.example.interfaz;


import org.example.Controllers.ControllerProducto;
import org.example.entity.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class VerProductos extends JFrame{
    private JPanel verProductos;
    private JTable table1;
    private JScrollPane scrollPane;
    DefaultTableModel tablaProducto=new DefaultTableModel(0,3);
    ControllerProducto controllerProducto =new ControllerProducto();


    public VerProductos() throws SQLException {

        this.setContentPane(verProductos);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        setTabla();



    }

    private void setTabla() throws SQLException {
        String cabecera[]={"ID","NOMBRE","PRECIO"};
        tablaProducto.setColumnIdentifiers(cabecera);

    }

    public void recargar() throws SQLException {
        String precio,id;
        ArrayList<Producto> filas= controllerProducto.agregarFilas();
        String []informacion=new String[4];
        for (int i=0; i<filas.size();i++){
            id=String.valueOf(filas.get(i).getId());
            precio=String.valueOf(filas.get(i).getPrecio());
            informacion[0]=id;
            informacion[1]=filas.get(i).getProducto();
            informacion[2]=precio;

            tablaProducto.addRow(informacion);
        }
        table1.setModel(tablaProducto);

    }




}
