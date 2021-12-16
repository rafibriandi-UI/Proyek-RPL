package com.kelompok2.projecthaa.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnector
{
    public static Connection getDbConnection() throws SQLException, ClassNotFoundException
    {
        //Initialize all information about database

        final String url = "jdbc:mysql://localhost:3306/haa_db";
        final String password = "";
        final String user = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DbConnector tes = new DbConnector();
        tes.getDbConnection();
    }
    }

