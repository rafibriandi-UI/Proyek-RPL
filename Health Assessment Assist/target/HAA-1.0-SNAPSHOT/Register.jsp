<%--
  Created by IntelliJ IDEA.
  User: Rafi Briandi Z
  Date: 01/12/2021
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>
<!-- Give Servlet reference to the form as an instances
GET and POST services can be according to the problem statement-->
<form action="RegisterServlet" method="post">
    <p>ID:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->
    <input type="text" name="user_id"/>
    <br/>
    <p>Name:</p>
    <input type="text" name="user_name"/>
    <br/>
    <p>Email:</p>
    <input type="text" name="user_email"/>
    <br/>
    <p>Password:</p>
    <input type="password" name="user_password"/>
    <br/><br/><br/>
    <input type="submit"/>
</form>
</body>
</html>