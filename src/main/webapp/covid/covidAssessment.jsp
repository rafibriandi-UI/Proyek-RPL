<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 20.00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Covid-19 Assessment</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">
    <a href="/index.jsp" class=" font-black text-purple-900 px-14 py-14 text-2xl">Back</a>
    <div class="relative py-3 sm:max-w-xl sm:mx-auto">
        <div class="max-w-lg mx-auto">
            <body>

            <form method="post" action="covid" class="relative px-10 py-16 bg-purple-400 shadow-lg transform sm:rounded-2xl">

                <h1 class="h-12 font-black text-purple-900 px-20 text-2xl">Covid-19 Assessment</h1>
                <h2 class="h-2 font-bold text-purple-700 px-20 text-justify">Possible Symptomps</h2><br>

                <label for="symptoms1" class="py-3 font-body flex place-content-center text-lg text-white">High temperature or fever :</label>
                <select class="sm:font-body p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms1" name="symptoms1"><br>
                    <option value="yes">yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <label for="symptoms2" class="py-3 font-body flex text-lg text-white place-content-center">Having a continuous cough <br> (note : oughing more than an hour, or three or more coughing episodes in 24 hours) :</label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms2" name="symptoms2"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <label for="symptoms3" class="py-3 font-body flex text-lg text-white place-content-center">Losing, or Change in sense of smell or taste :<br></label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="symptoms3" name="symptoms3"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <label for="symptoms4" class="py-3 font-body flex text-white place-content-center">Do you live or having contact with someone who has symptoms of covid?</label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="number" id="symptoms4" name="symptoms4"><br>
                    <option value="yes" >yes</option>
                    <option value="no">no</option>
                    <option value="unsure">unsure</option>
                </select><br>

                <input id="genRisk" name="genRisk" value="${genRisk}">
                <br>

                <button type="submit" class="font-body text-white shadow-md container py-1 bg-pink-200 appearance-none rounded-lg focus:outline-none focus:ring-2">Generate Report</button>

            </form>
            </body>
        </div>
    </div>
</div>

</html>
