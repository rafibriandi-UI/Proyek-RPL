<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 19.58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Diabetes Type 1 Assessment Report</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">

    <div class="py-3">
        <div class="max-w-xl mx-auto">
            <body>
            <div class="container bg-purple-500 rounded-2xl px-8 py-8">

                <h1 class="h-12 font-black text-purple-900 px-20 text-3xl text-center">REPORT</h1>
                <h1 class="h-12 font-black text-purple-900 px-20 text-3xl text-center">Diabetes Type 1 Assessment</h1><br>

                <div class="container max-w-xs mx-auto ${color} rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">${riskLevel}</h2><br>
                </div>

                <br>
                <div>
                    <h2 class="font-bold text-lg">Brief Explanation :</h2>
                    <div class="text-white text-justify">
                        <p>A chronic condition in which the pancreas produces little or no insulin.
                            Insulin is a hormone needed to allow sugar (glucose) to enter cells to
                            produce energy.
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>The exact cause of type 1 diabetes is unknown. Usually, the body's own immune system —
                            which normally fights harmful bacteria and viruses — mistakenly destroys the insulin-producing
                            (islet, or islets of Langerhans) cells in the pancreas.<br>
                            Other possible causes include:<br>
                        <div class="mx-5">
                            Genetics<br>
                            Exposure to viruses and other environmental factors.
                        </div>
                        </p><br>
                    </div>
                </div>

                ${riskLevel == "Low Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>Your risk of having a diabetes type 1 isnt high, but we still suggest you to taka careof your body carefully, from what you eat, drink, and avoid sugar.</p><br></div></div>' : "" }

                ${riskLevel == "Medium Risk" || riskLevel == "High Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>Because Type 1 diabetes is an autoimmune disease, meaning your body attacks itself if you really have it, betterfor you to consult a doctor to get further medical check up to make sure things so that it wont get worse.</p><br></div></div>' : ""}

                <div class="container max-w-xs mx-auto py-4 my-5">
                    <button type="button" class="font-bold text-white shadow-md container max-w-xs mx-auto py-2 bg-purple-800 rounded-lg focus:ring-2">
                        <a href="/UserPageServlet">Save Report</a></button>
                </div>

            </div>
            </body>
        </div>
    </div>
</div>

</html>


