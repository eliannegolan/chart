package com.example.application.views;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HR_data
{
    public List<Integer> GetHR() throws SQLException {
        Integer hr = null;
        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
        }

        Connection conn = DriverManager.getConnection(dbUrl, "postgres", "rules;eyes");

        List<Integer> HeartRate = null;
        try {
            Statement s = conn.createStatement();
            String sqlS = "SELECT * from hr;";
            ResultSet rs = s.executeQuery(sqlS);

            HeartRate = new ArrayList<>();
            while (rs.next()) {
                HeartRate.add(rs.getInt("hr"));
            }

            rs.close();
            s.close();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return HeartRate;
    }
}
