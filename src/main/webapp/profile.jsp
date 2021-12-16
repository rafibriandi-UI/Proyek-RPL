<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 16/12/2021
  Time: 06.30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href= "styles.css">
</head>

<body>
<div class="bg-purple-900 min-h-screen py-10 px-32 pr-36">
    <div class="bg-pink-300 rounded-lg py-5 ">

        <div >
            <input  class="bg-pink-300 text-white text-2xl font-bold px-16 " type="submit" value="ASSESSMENT">
            <input  class="bg-pink-300 text-white text-2xl font-bold px-16 " type="submit" value="HISTORY">
            <input  class="bg-pink-300 text-white text-2xl font-bold px-16" type="submit" value="MENU">
            <input  class="bg-pink-300 text-white text-2xl font-bold px-16 " type="submit" value="LOGOUT">
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

            <div class="py-12 px-24  ">
                <div class="bg-pink-300 rounded-lg   ">
                    <p class="text-white  font-serif font-bold px-6  ">
                        PERSONAL DATA
                    </p>
                </div>
                <div class="py-9">
                    <input class="rounded-lg text-center" type="text">
                </div>
                <div class="py-1">
                    <input class="rounded-lg text-center" type="text">
                </div>
                <div class="py-9">
                    <input class="rounded-lg text-center" type="text">
                </div>
                <div class="py-1">
                    <input class="rounded-lg text-center" type="text">
                </div>
                <div class="py-8">
                    <input class="rounded-lg text-center" type="text">
                </div>
                <div class="py-8 ">
                    <input class="rounded-lg text-center text-white bg-pink-600 py-1 px-4 font-bold" type="submit" value="SUBMIT PROFILE">
                </div>
            </div>


        </div>

    </div>
</div>
</body>

</body>

</html>

