<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 19.59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CVD Assessment</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">

    <a href="generalRisk?assessmentId=3&disease=cvd" class="w-52 font-black text-purple-900 px-14 py-14 text-2xl">Back</a>

    <div class="relative py-3 sm:max-w-xl sm:mx-auto">
        <div class="max-w-lg mx-auto">
            <body>

            <form method="post" action="cvd" class="relative px-10 py-16 bg-purple-400 shadow-lg transform sm:rounded-2xl">

                <input class="bg-purple-400 text-purple-400" id="genRisk" name="genRisk" value="${genRisk}">

                <h1 class="h-12 font-black text-purple-900 px-20 text-2xl">CVD Assessment</h1>
                <h2 class="h-2 font-bold text-purple-700 px-20 text-justify">Possible Symptomps</h2><br>

                <label for="symptoms1" class="py-3 font-body flex place-content-center text-lg text-white">having pain or discomfort in the centre of the chest.</label>
                <select class="sm:font-body p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms1" name="symptoms1"><br>
                    <option value="yes">yes</option>
                    <option value="no">no</option>
                    <!-- <option value="unsure">unsure</option> -->
                </select><br>

                <label for="symptoms2" class="py-3 font-body flex text-lg text-white place-content-center">having pain or discomfort in the arms, the left shoulder, elbows, jaw, or back.</label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms2" name="symptoms2"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <label for="symptoms3" class="py-3 font-body flex text-lg text-white place-content-center">experiencing difficulty in breathing or shortness of breath.<br></label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms3" name="symptoms3"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <!-- <option value="unsure">unsure</option> -->
                </select><br>

                <label for="symptoms4" class="py-3 font-body flex text-lg text-white place-content-center">feels nausea or vomiting.</label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="number" id="symptoms4" name="symptoms4"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <label for="symptoms5" class="py-3 font-body flex text-lg text-white justify-center">light-headedness or faintness.</label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="number" id="symptoms5" name="symptoms5"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                </select><br>

                <br>

                <button type="submit" class="font-body text-white shadow-md container py-1 bg-purple-800 appearance-none rounded-lg focus:outline-none focus:ring-2">Generate Report</button>

            </form>
            </body>
        </div>
    </div>
</div>

</html>
