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
                <div class="bg-purple-300 rounded-lg w-96 ml-32 min-h-screen ">
                    <p class="font-bold text-white text-4xl text-center py-14">
                        SIGN IN
                    </p>

                    <div class=" py-2 space-y-4">
                        <div >
                            <p class="font-bold text-white ml-14   ">
                                Email
                                <input class=" text-center text-slate-900 rounded-lg px ml-8 " type="text" name="user_name"/>
                            </p>
                        </div>
                        <div >
                            <p class="font-bold text-white ml-14   ">
                                Password
                                <input class=" text-center text-slate-900 rounded-lg px ml-1 " type="password" name="user_name"/>
                            </p>
                        </div>
                        <br>
                        <br>
                        <p class="px-6">
                            Don't have an account? hit sign up to register!
                        </p>
                        <div class="flex space-x-0">

                            <div class="px-2">
                                <input type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " value="SIGN IN">
                            </div>
                            <div class="px-20" >
                                <input type="submit" class="px-10 py-2 rounded-lg bg-pink-200 " value="SIGN UP">
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