package org.example;

import org.example.interfaz.Menu;
import org.example.service.ServiceProducto;

import javax.swing.*;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        JFrame menu=new Menu();
        menu.setVisible(true);



    }
}