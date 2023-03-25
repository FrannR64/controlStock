package org.example.connection;

import java.sql.*;

public class Connection {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/controlstock";
    private java.sql.Connection CN=null;

    public Connection() {
        try {
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("ERROR AL CONECTAR " + e);
        }
    }

    public java.sql.Connection getConnection() {
        return CN;
    }


    public void close() {
        CN = null;

        if (CN == null) {
            System.out.println("CONEXION TERMINADA");

        }
    }

}
