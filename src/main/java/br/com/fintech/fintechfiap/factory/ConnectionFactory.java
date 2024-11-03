package br.com.fintech.fintechfiap.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static ConnectionFactory connectionManager;

    private ConnectionFactory() {
    }

    public static ConnectionFactory getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionFactory();
        }
        return connectionManager;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "rm558419",
                    "170106");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}