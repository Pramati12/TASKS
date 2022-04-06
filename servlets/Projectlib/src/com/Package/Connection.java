package com.Package;



import java.sql.Statement;
import java.sql.*;

public class Connection {

    public static java.sql.Connection getConnect() {
        java.sql.Connection Connection = null;
        Statement Statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "pramati123");
            Statement=Connection.createStatement();

        } catch (ClassNotFoundException var2) {
            var2.printStackTrace();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
        return Connection;

    }

}


