package org.example.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Menu extends JFrame {
    private JButton salirButton;
    private JButton ingresarProductoButton;
    private JButton verProductosButton;
    private JPanel panelMenu;

    //paneles
    IngresarProducto ingresarProducto = new IngresarProducto();


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


    }

}
