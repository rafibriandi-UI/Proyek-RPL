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

                <div class="container max-w-xs mx-auto ${color} rounded-lg py-4 my-5">
                    <h2 class="text-xl font-bold text-white text-center">${riskLevel}</h2><br>
                </div>

                <br>
                <div>
                    <h2 class="font-bold text-lg">Brief Explanation :</h2>
                    <div class="text-white text-justify">
                        <p>Type 2 diabetes is an impairment in the way the body regulates and uses sugar (glucose) as a fuel.
                            This long-term (chronic) condition results in too much sugar circulating in the bloodstream. Eventually,
                            high blood sugar levels can lead to disorders of the circulatory, nervous and immune systems.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>In type 2 diabetes, there are primarily two interrelated problems at work. Your pancreas does not produce enough insulin
                            — a hormone that regulates the movement of sugar into your cells — and cells respond poorly to insulin and take in less sugar.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Keep your blood glucose levels as near to normal as possible by following a diet plan,
                            taking prescribed medication and increasing your activity level.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Keeping your appointments with your healthcare providers and having
                            laboratory tests completed as ordered by your doctor.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Get an appointment with doctor in hospital  to get further treatment.
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
