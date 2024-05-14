package com.example.codequizzer;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

public class Connect {
    String url = "jdbc:postgresql://localhost:5432/javaQuizzer";
    String user = "postgres";
    String password = "root";

    ;

    public String selectTEXTfromDB() {
        StringBuilder stringBuilder = new StringBuilder();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM quizzer");

            while (resultSet.next()) {
                stringBuilder.append(resultSet.getString("push"));
            }
        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
        String str = String.valueOf(stringBuilder);
        return str;
    }
    public void writeToDb(String text) {

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO quizzer (text) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, text);
            statement.executeUpdate();
            System.out.println("Запис додано до таблиці orders");
        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
    }

        public String selectAllDb() {
            StringBuilder stringBuilder = new StringBuilder();

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM quizzer");

                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String textDB = resultSet.getString("text");

                    stringBuilder.append(id + "  |   " + textDB + "\n" );
                    stringBuilder.append("_____________________________________________________________________________________________"+ "\n");
                }

            } catch (SQLException e) {
                System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
            }
            String s = String.valueOf(stringBuilder);

            return s;
    }
    public void saveChangesBToDb(int id,  String text) {
        String sql = "UPDATE quizzer SET text = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, text);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String selectID (String id) {
        StringBuilder stringBuilder = new StringBuilder();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM quizzer");

            while (resultSet.next()) {
                String idDB = resultSet.getString("id");
                String textDB = resultSet.getString("text");

                if (idDB.equals(id)) {
                    stringBuilder.append(id + "  |   " + textDB + "\n");
                    stringBuilder.append("_____________________________________________________________________________________________" + "\n");
                }
            }

        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
        String s = String.valueOf(stringBuilder);
        return s;
    }

    public String selectTest (String id) {
        StringBuilder stringBuilder = new StringBuilder();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM quizzer");

            while (resultSet.next()) {
                String idDB = resultSet.getString("id");
                String textDB = resultSet.getString("text");

                if (idDB.equals(id)) {
                    stringBuilder.append(id + "  |   " + textDB + "\n");
                }
            }

        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
        String s = String.valueOf(stringBuilder);
        return s;
    }

    public int counterDB () {
        int counter = 0;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM  quizzer");
            while (resultSet.next()) {
                counter++;
            }
        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
        return counter;
    }
}
