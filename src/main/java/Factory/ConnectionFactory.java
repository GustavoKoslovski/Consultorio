package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/consultorio", "postgres", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}


