<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html >
<head>
    <title>LoginPage</title>
    <link rel="stylesheet" href= "styles.css">

</head>

<body>

<form action="LoginServlet" method="post">
    <div class="bg-pink-200 min-h-screen px-12 py-24">

        <div class="bg-purple-900 rounded-lg pl-96  py-3 min-h-screen ">
            <div class="bg-white rounded-lg w-2 min-h-screen ml-44">
                <div class="bg-purple-300 rounded-lg w-96 ml-32 min-h-screen px ">
                    <p class="font-bold text-white text-4xl text-center py-14">
                        SIGN IN
                    </p>

                    <div class=" py-2 space-y-4">
                        <div >
                            <p class="font-bold text-white ml-14   ">
                                Email
                                <input class=" text-center text-black rounded-lg px ml-8 " type="text" name="user_id"/>
                            </p>
                        </div>
                        <div >
                            <p class="font-bold text-white ml-14   ">
                                Password
                                <input class=" text-center text-black rounded-lg px ml-1 " type="password" name="user_password"/>
                            </p>
                        </div>
                        <br>
                        ${notes}
                        <br>
                        <p class="px-6">
                            Don't have an account? hit sign up to register!
                        </p>
                        <div class="flex space-x-0 px-7">

                            <div class="px-4">
                                <button type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " name="register" value="SIGN IN">SIGN IN</button>
                            </div>
                            <div class="px-2" >
                                <button type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " name="register" value="SIGN UP">SIGN UP</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</form>
</body>
</html>