package com.Package;


import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
    public Insert() {
    }

    public static void insert() throws Exception {
        Statement stmt = null;
        java.sql.Connection connection= null;
        connection= Connection.getConnect();
        stmt = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO books(id,book_name,author)values (?,?,?)");
        Scanner scanner = new Scanner(System.in);
        int Book_id = scanner.nextInt();
        String Book_name = scanner.next();
        String Book_Author = scanner.next();
        preparedStatement.setInt(1, Book_id);
        preparedStatement.setString(2, Book_name);
        preparedStatement.setString(3, Book_Author);
        preparedStatement.execute();
    }
}



