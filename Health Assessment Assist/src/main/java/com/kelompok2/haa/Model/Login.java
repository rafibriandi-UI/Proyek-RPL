package com.kelompok2.haa.Model;

public class Login
{
    //variable declaration
    protected String user_email;
    protected String user_password;

    //setter
    public void setUserEmail(String user_email)
    {
        this.user_email = user_email;
    }
    public void setUserPassword(String user_password)
    {
        this.user_password = user_password;
    }

    //getter
    public String getUserEmail()
    {
        return user_email;
    }
    public String getUserPassword()
    {
        return user_password;
    }


}
