package com.kelompok2.projecthaa.DAO;

import com.kelompok2.projecthaa.Models.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO
{
    public String registerUser(register register) throws ClassNotFoundException
    {
        String userId = register.getUserId();
        String userName = register.getUserName();
        String userEmail = register.getUserEmail();
        String userPassword = register.getUserPassword();

        Connection con ;
        PreparedStatement preparedStatement ;
        try
        {
            con = DbConnector.getDbConnection();
            preparedStatement = con.prepareStatement("INSERT INTO useraccount" +
                     "(user_id,user_name,user_email,user_password)" + "VALUES(?,?,?,?)");

            preparedStatement.setString(1,userId);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, userEmail);
            preparedStatement.setString(4, userPassword);
            int result = 0;
            result = preparedStatement.executeUpdate();

            if (result!=0)  //Just to ensure data has been inserted into the database
                return "SUCCESS";
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return "There is something wrong";
    }




}

