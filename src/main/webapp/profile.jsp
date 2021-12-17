<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href= "styles.css">
</head>

<body>
<form action="ProfileServlet" method="post">
    <div class="bg-purple-900 min-h-screen py-10 px-32 pr-36">
        <div class="bg-pink-300 rounded-lg py-5 ">

            <div class="flex justify-center">
                <button  class="bg-pink-300 text-white text-2xl font-bold px-16 " type="submit" name="assessment" value="assessment"> ASSESSMENT</button>
                <button class="bg-pink-300 text-white text-2xl font-bold px-16" type="submit" name="menu" value="menu"> MENU</button>
                <button  class="bg-pink-300 text-white text-2xl font-bold px-16 " type="submit" name="logout" value="logout"> LOGOUT</button>
            </div>
        </div>
        <div class="divide-x-0 grid grid-cols-3 pr-48 ">
            <div class="pb-64 w-72 py-10 ">

            </div>
            <div class="px-44 py-9 ">
                <div class="bg-white rounded-lg min-h-screen w-2">

                </div>
            </div>
            <div class="flex space-x-0  ">
                <div class =" py-10  ">
                    <p class="text-white font-bold text-2xl font-serif py-5 ">
                        PROFILE
                    </p>
                    <div class ="">
                        <p class="text-white font-bold py-5">
                            USERNAME
                        </p>
                    </div>
                    <div class ="">
                        <p class="text-white font-bold py-5">
                            EMAIL
                        </p>
                    </div>
                    <div class ="">
                        <p class="text-white font-bold py-5">
                            WEIGHT
                        </p>
                    </div>
                    <div class ="">
                        <p class="text-white font-bold py-5">
                            HEIGHT
                        </p>
                    </div>
                    <div class ="">
                        <p class="text-white font-bold py-5">
                            BMI
                        </p>
                    </div>
                </div>

                <div class="py-16 px-24  ">
                    <div class="bg-pink-300 rounded-lg  py ">
                        <p class="text-white  font-serif font-bold px-4   ">
                            PERSONAL DATA
                        </p>
                    </div>
                    <div class="py-11">
                        <input class="rounded-lg text-center" type="text" value="${t.user_name}">
                    </div>
                    <div class="py-0">
                        <input class="rounded-lg text-center" type="text" value="${t.email}">
                    </div>
                    <div class="py-9">
                        <input class="rounded-lg text-center" type="text" value="${t.weight}">
                    </div>
                    <div class="py-1">
                        <input class="rounded-lg text-center" type="text" value="${t.height}">
                    </div>
                    <div class="py-10
                    ">
                        <input class="rounded-lg text-center" type="text" value="${BMI}">
                    </div>

                </div>


            </div>

        </div>
    </div>

</form>
</body>
</html>