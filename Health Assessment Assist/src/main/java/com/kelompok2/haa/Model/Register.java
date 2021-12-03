package com.kelompok2.haa.Model;

public class Register
{
    // Variable declaration
    protected String user_id;
    protected String user_name;
    protected String user_email;
    protected String user_password;

    //setter
    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public void setUserName(String user_name)
    {
        this.user_name = user_name;
    }
    public void setUserEmail(String user_email)
    {
        this.user_email = user_email;
    }
    public void setUserPassword(String user_password)
    {
        this.user_password = user_password;
    }

    //getter

    public  String getUserId()
    {
        return user_id;
    }

    public String getUserName()
    {
        return user_name;
    }
    public String getUserEmail()
    {
        return user_email;
    }
    public String getUserPassword()
    {
        return user_password;
    }
}
