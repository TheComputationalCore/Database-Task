package Task9;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDatabaseConnection {

    public static Connection getConnection() {
        try {
            // Retrieve DB credentials from environment variables
            String url = System.getenv("DB_URL");
            String username = System.getenv("DB_USER");
            String password = System.getenv("DB_PASS");

            // Validate credentials
            if (url == null || username == null || password == null) {
                throw new IllegalStateException(
                        "Database credentials not set. Please configure DB_URL, DB_USER, DB_PASS as environment variables.");
            }

            // Establish database connection
            return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.err.println("❌ Failed to connect to the database:");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection connection = getConnection();

        if (connection != null) {
            System.out.println("✅ Connection created successfully.");
        } else {
            System.out.println("❌ Connection not created.");
        }
    }
}
