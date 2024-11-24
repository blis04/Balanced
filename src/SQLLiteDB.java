import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLLiteDB {

    public void connect(String url) {
        try (var conn = DriverManager.getConnection(url)) {
            // TODO: implement what we want to do after connecting to the DB
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
