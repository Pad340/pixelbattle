package pixelbattle.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String URL = "jdbc:mysql://localhost:3304/pixelbattle";
    private static final String user = "root";
    private static final String password = "";
    private static Connection connect = null;

    public static Connection getConnect() {
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(URL, user, password);
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return connect;
    }
}
