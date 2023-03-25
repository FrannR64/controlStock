package org.example.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Menu extends JFrame {
    private JButton ingresarProductoButton;
    private JButton verProductosButton;
    private JPanel panelMenu;

    //----------------------paneles------------------------------------------
    IngresarProducto ingresarProducto = new IngresarProducto();
    VerProductos verProductos=new VerProductos();


    public Menu() throws SQLException {
        this.setContentPane(panelMenu);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);

        //Boton Ingresar producto
        ingresarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarProducto.setVisible(true);
            }
        });


        //boton ver productos
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    verProductos.recargar();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                verProductos.setVisible(true);
            }
        });
    }

}
