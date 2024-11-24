import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQLLiteConnectionTest {

    private static final String HOME_DIR = System.getenv("HOME");
    private static final String DB_URL = String.format("jdbc:sqlite:/Users/%s/sqlite/chinook.db", HOME_DIRg);

    @Test
    public void testDatabaseConnection() {
        SQLLiteDB db = new SQLLiteDB();

        assertDoesNotThrow(() -> db.connect(DB_URL));
    }
}
