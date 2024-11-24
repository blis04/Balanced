public class Constants {

    public static String getTestDBFile() {
        return String.format("jdbc:sqlite:/%s/Desktop/Balanced/src/resources/chinook.db", System.getenv("HOME"));
    }
}
