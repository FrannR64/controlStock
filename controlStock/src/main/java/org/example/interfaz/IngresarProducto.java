package org.example.interfaz;

import org.example.Controllers.ControllerObjeto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class IngresarProducto extends JFrame {
    private JPanel ingresarProducto;
    private JTextField producto;
    private JTextField precio;
    private JButton agregarButton;
    ControllerObjeto controllerObjeto=new ControllerObjeto();


    public IngresarProducto() throws SQLException {
        this.setContentPane(ingresarProducto);
        this.setSize(300,300);
        this.setLocationRelativeTo(null);


        //enviar objeto
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor=Integer.parseInt(precio.getText());
                try {
                    controllerObjeto.ingresarProducto(producto.getText(),valor);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }



}
