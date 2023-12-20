package org.portfolio.cleanjava.mw.jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Configuration {

    private static String H2DRIVER = "org.h2.Driver";
    private static String H2ADDR = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static String USER = "";
    private static String PASSWORD = "";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = getDBConnection();

        if(conn != null){
            System.out.println("Connection success");
        }
    }

    public static Connection getDBConnection() throws ClassNotFoundException, SQLException {

        Connection connection = null;

        Class.forName(H2DRIVER);

        connection = DriverManager.getConnection(H2ADDR, USER, PASSWORD);

        return connection;

    }

}
