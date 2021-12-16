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
    <title>UserPage</title>
    <link rel="stylesheet" href= "styles.css">
</head>
<body>

<div class="bg-pink-300 min-h-screen pr-96">
    <div class="flex flex-row">
        <div class="bg-purple-900 min-h-screen px-10 py-10">
            <p class="font-bold text-white text-4xl px-40">
                WELCOME TO
            </p>
            <p class="font-bold text-white text-4xl px-6 py-9">
                HEALTH ASSESSMENT ASSIST!
            </p>
            <div class="bg-pink-300 rounded-lg px-6  py-1">
                <p class="text-white text-2xl px-0">
                    ONLINE PLATFORM TO MAKE IT EASIER FOR
                </p>
                <p class="text-white text-2xl">
                    YOU TO FIND OUT ABOUT YOUR HEALTH CONDITION
                </p>
            </div>
            <div class="py-48 px-48">
                <input class="rounded-lg text-white text-2xl outline outline-offset-2 outline-white px-7 " type="submit" value="READ MORE">
            </div>
        </div>
        <div class=" py-4">
            <div class="px-4 py-11 ">
                <button class="bg-purple-900 text-white rounded-lg px-40 text-6xl font-bold " type="submit" ><a href="">PROFILE</a></button>

            </div>
            <div class="px-4 py-11">
                <button class="bg-purple-900 text-white rounded-lg px-24 text-6xl font-bold" type="submit" ><a href="/userData">ASSESSMENT</a></button>
            </div>
            <div class="px-4 py-11">
                <button class="bg-purple-900 text-white rounded-lg px-40 text-6xl font-bold" type="submit" ><a href="">HISTORY</a></button>
            </div>
            <div class="px-4 py-11">
                <button class="bg-purple-900 text-white rounded-lg px-40 text-6xl font-bold" type="submit" ><a href="">LOGOUT</a></button>
            </div>
        </div>
    </div>
</div>

</body>
</html>

