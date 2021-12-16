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
    <title>Malaria Assessment Report</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">
    <a href="/index.jsp" class=" font-black text-purple-900 px-14 py-14 text-2xl">Back</a>
    <div class="py-3">
        <div class="max-w-xl mx-auto">
            <body>
            <div class="container bg-purple-500 rounded-2xl px-8 py-8">

                <h1 class="h-12 font-black text-purple-900 px-20 text-3xl text-center">REPORT</h1>

                <div class="container max-w-xs mx-auto bg-red-400 rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">High Risk</h2><br>
                </div>

                <div class="container max-w-xs mx-auto bg-yellow-300 rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">Medium Risk</h2><br>
                </div>

                <div class="container max-w-xs mx-auto bg-green-400 rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">Low Risk</h2><br>
                </div>

                <br>
                <div>
                    <h2 class="font-bold text-lg">Brief Explanation :</h2>
                    <div class="text-white text-justify">
                        <p>CVD is a type of condition that affects the working of one's heart.
                            The effect varies from stroke, heart failure, carditis, and more. This condition can be potentially
                            developed from smoking, high blood pressure, diabetes, lack of exercise, and more.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>Symptoms can be identified by having chills/cold from the body and runny nose,
                            furthermore coughs with pleghm indicates the larynx are affected by the disease.                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Consult to a doctor or buy a light cold/flu medicine.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Consult to a doctor for specific drug prescription to handle the cold/flu
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Directly go to specialist doctor for further check-up and treatments.
                        </p><br>
                    </div>
                </div>

                <div class="container max-w-xs mx-auto py-4 my-5">
                    <button type="button" class="font-bold text-white shadow-md container max-w-xs mx-auto py-2 bg-pink-300 rounded-lg focus:ring-2">
                        <a href="/${pageContext.request.contextPath}.jsp">Save Report</a></button>
                </div>

            </div>
            </body>
        </div>
    </div>
</div>

</html>


