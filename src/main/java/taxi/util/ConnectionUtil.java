package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.controller.IndexController;

public class ConnectionUtil {
    private static final String URL =
            "jdbc:mysql://localhost:3306/taxi_service_db?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "_A1b2c3d4e5_";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final Logger logger = LogManager.getLogger(IndexController.class);

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            logger.error("Can't find SQL Driver", e);
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            logger.info("Connection to DB was successful.");
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            logger.error("Can't create connection to DB", e);
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
