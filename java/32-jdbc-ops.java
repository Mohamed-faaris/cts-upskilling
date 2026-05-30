/*
32. Insert and Update Operations in JDBC
• Objective: Perform insert/update SQL queries from Java.
• Task: Add and modify student data using JDBC.
• Instructions:
o Create a StudentDAO class.
o Implement methods to insert new records and update student details.
o Use PreparedStatement for parameterized queries.
*/

import java.sql.*;

class StudentDAO {
    private String url = "jdbc:sqlite:try.db";

    public void insertStudent(String name, int age) {
        String sql = "INSERT INTO students(name, age) VALUES(?, ?)";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStudent(int id, String name, int age) {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " - " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " - " + rs.getInt("age"));
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent("Eve", 22);
        dao.updateStudent(1, "Alice Smith", 31);
        dao.displayStudents();
    }
}