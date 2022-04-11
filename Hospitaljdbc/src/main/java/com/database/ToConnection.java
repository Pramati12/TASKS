package com.database;

import com.model.Hospital;
import com.servlet.HospitalServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.*;

public class ToConnection {

    public static Statement statement = null;
    public static Connection connection = null;
    private static Logger logger = LoggerFactory.getLogger(HospitalServlet.class);

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JdbcConn", "root", "pramati123");
            statement = connection.createStatement();
            if (statement != null) {
                System.out.println("Connection Succes");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        return connection;
    }

    public static ResultSet getHospitalList() throws SQLException {
        connection = getConnection();
        ResultSet resultSet = connection.createStatement().executeQuery("select * from Hospital");
        return resultSet;

    }

    public static ResultSet createHospitalList(Hospital hospital) {
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("insert into Hospital values(?,?,?,?");
            preparedStatement.setInt(1, hospital.getHospitalId());
            preparedStatement.setString(2, hospital.getHospitalName());
            preparedStatement.setString(5, hospital.getAddress());
            preparedStatement.setString(5, hospital.getCity());
            int x = preparedStatement.executeUpdate();
            if (x > 0) {
                logger.info("Successfully created new Hospital");
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            logger.info(String.valueOf(e));
        }
        return (ResultSet) preparedStatement;
    }

    public static ResultSet updateHospitalList(Hospital hospital) {
        PreparedStatement preparedStatement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("UPDATE hospital SET HospitalId=?,HospitalName=?,Address=?,City=?");
            preparedStatement.setInt(1, hospital.getHospitalId());
            preparedStatement.setString(2, hospital.getHospitalName());
            preparedStatement.setString(5, hospital.getAddress());
            preparedStatement.setString(5, hospital.getCity());
            preparedStatement.executeUpdate();

            connection.close();

        } catch (Exception e) {
            logger.info(e.toString());
        }
        return (ResultSet) preparedStatement;
    }

    public static ResultSet deleteHospitalList(int hospitalId) throws SQLException {
        connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Hospital where id=" + hospitalId);
        preparedStatement.executeUpdate();
        return (ResultSet) preparedStatement;
    }
    public static ResultSet getHospitalOrdered() throws SQLException {
        connection = getConnection();
        ResultSet resultSet = connection.createStatement().executeQuery("select * from Hospital order by name");
        return resultSet;
    }
}






