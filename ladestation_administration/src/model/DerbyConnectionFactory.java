/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ibr
 */
public class DerbyConnectionFactory {

    private static final String URL = "jdbc:derby://localhost:1527/ladestation";
    private static final String USERNAME = "ladestation";
    private static final String PASSWORD = "ladestation";

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
