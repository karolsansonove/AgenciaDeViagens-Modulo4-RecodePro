package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String USERNAME = "root";
    private static final String PASSWORD = "root#123";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenciaviagem";

    public static Connection createConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
