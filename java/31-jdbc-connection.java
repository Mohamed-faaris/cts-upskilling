/*
31. Basic JDBC Connection
• Objective: Connect Java with a relational database.
• Task: Connect to a local MySQL/SQLite database and retrieve data.
• Instructions:
o Set up a database with a students table.
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and
print results.
*/
import java.sql.*;
class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:try.db"; 
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            return;
        }
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                String sql = "SELECT * FROM students";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " - " + rs.getInt("age"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}