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
    <title>CVD Assessment Report</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">

    <div class="py-3">
        <div class="max-w-xl mx-auto">
            <body>
            <div class="container bg-purple-500 rounded-2xl px-8 py-8">

                <h1 class="h-12 font-black text-purple-900 px-20 text-3xl text-center">REPORT</h1>
                <h1 class="h-12 font-black text-purple-900 px-20 text-3xl text-center">CVD Assessment</h1><br>

                <div class="container max-w-xs mx-auto ${color} rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">${riskLevel}</h2><br>
                </div>

                <br>
                <div>
                    <h2 class="font-bold text-lg">Brief Explanation :</h2>
                    <div class="text-white text-justify">
                        <p>CVD is a type of condition that affects the working of one's heart.
                            The effect varies from stroke, heart failure, carditis, and more.
                            This condition can be potentially developed from smoking, high blood pressure, diabetes, lack of exercise, and more.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>Heart problems can be identified by the person's ability to run the day normally, sometimes the disease
                            can attack at random moments that causes high heartbeat, inability to breath or walk properly, or even a sudden heart attack.
                        </p><br>
                    </div>
                </div>

                ${riskLevel == "Low Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>Run a healthy life, do a food control and exercise routinely.</p><br></div></div>' : " " }

                ${riskLevel == "Medium Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>Consult to a doctor for a possible medication or routinity changes.</p><br></div></div>' : " " }

                ${riskLevel == "High Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>Directly go to specialist doctor for further check-up and treatments.</p><br></div></div>' : " " }

                <div class="container max-w-xs mx-auto py-4 my-5">
                    <button type="button" class="font-bold text-white shadow-md container max-w-xs mx-auto py-2 bg-pink-300 rounded-lg focus:ring-2">
                        <a href="/UserPageServlet">Save Report</a></button>
                </div>

            </div>
            </body>
        </div>
    </div>
</div>

</html>

