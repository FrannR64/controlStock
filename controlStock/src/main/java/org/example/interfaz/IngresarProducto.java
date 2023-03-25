package org.example.interfaz;

import org.example.Controllers.ControllerProducto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class IngresarProducto extends JFrame {
    private JPanel ingresarProducto;
    private JTextField producto;
    private JTextField precio;
    private JButton agregarButton;

    ControllerProducto controllerProducto =new ControllerProducto();


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
                    controllerProducto.ingresarProducto(producto.getText(),valor);
                    Window cerrar = SwingUtilities.getWindowAncestor(ingresarProducto);
                     cerrar.dispose();
                     JOptionPane.showMessageDialog(null,"producto guardado");


                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }



}
