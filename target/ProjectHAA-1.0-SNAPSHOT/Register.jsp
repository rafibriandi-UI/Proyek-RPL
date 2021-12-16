<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 03/12/2021
  Time: 15.44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Data</title>
    <link rel="stylesheet" href= "styles.css">

</head>
<body>


<form action="RegisterServlet" method="post">

    <div class="bg-purple-300 min-h-screen px-12 py-24">


        <div class="bg-purple-900  rounded-lg py-7
                  px-40 " >

            <div class="bg-purple-300 rounded-lg ">

                <p class=" text-center font-bold text-white text-4xl py-7">
                    SIGN UP
                </p>

                <p class=" font-bold text-white text-center  py">ID</p>

                <p class="text-center">
                    <input class=" text-center rounded-lg" type="text" name="user_id"/>
                    <br/>
                </p>
                <p class="font-bold text-white  text-center ">Username</p>
                <p class="text-center">
                    <input class=" text-center rounded-lg " type="text" name="user_name"/>
                    <br/>
                <p class="font-bold text-white text-center ">Email</p>
                <p class="text-center">
                    <input class=" text-center rounded-lg " type="text" name="user_email"/>
                    <br/>
                <p class="font-bold text-white text-center ">Password</p>
                <p class="text-center">
                    <input class="text-center rounded-lg" type="password" name="user_password"/>
                    <br/><br/>
                <p class="text-center">
                    Already have an account? Sign in

                </p>
                <br>
                <div class="flex space-x-0">

                    <div class="px-48">
                        <input type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " value="SIGN IN">
                    </div>
                    <div class="px-0" >
                        <input type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " value="SIGN UP">
                    </div>
                </div>

                <br>
                <br>
                <br>

            </div>
        </div>
    </div>

</form>
</body>
</html>
