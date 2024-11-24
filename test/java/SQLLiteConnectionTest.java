import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SQLLiteConnectionTest {

    @Test
    public void testDatabaseConnection() {
        SQLLiteDB db = new SQLLiteDB();

        assertDoesNotThrow(() -> db.connect(Constants.getTestDBFile()));
    }
}
