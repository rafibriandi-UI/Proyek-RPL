<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 19.56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<link href="styles.css" rel="stylesheet">

<body>


    <div class="min-h-screen bg-pink-200 px-8 py-16 justify sm:py-12">
        <a href="/index.jsp" class=" font-black text-purple-900 px-14 py-14 text-2xl">Back</a>


        <div class=" relative my-12 mx-40 px-8 py-16 bg-white shadow-lg transform -skew-y-6 sm:skew-y-0 sm:rounded-2xl">
            <h1 class="h-12 font-black text-pink-300 text-2xl">Assessment List</h1><br>

            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=1&disease=diabetest1">Diabetes Type 1 Assessment</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=2&disease=diabetest2">Diabetes Type 2 Assessment</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=3&disease=cvd">General CVD Assessment (Cardiovascular Disease)</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=4&disease=coldFlu">Is it Cold or Flu?</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=5&disease=covid">Covid Assessment</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=6&disease=malaria">Malaria Assessment</a> </button>
            <button class="sm:font-semibold text-purple-900 container border-2 p-1 appearance-none rounded-lg focus:outline-none focus:ring-2"
                    type="submit" name="assessmentId"> <a href="assessment/generalRisk?assessmentId=7&disease=sinusitis">Sinusitis Assessment</a> </button>
        </div>
    </div>
</body>

</html>

