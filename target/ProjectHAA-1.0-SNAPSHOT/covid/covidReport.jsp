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
                        <p>CoVid stands for Coronavirus and is a part of Severe Acute Respiratory Syndrome (SARS) that causes
                            breathing problems as the virus spreads around it's victim lungs reducing the amount of Oxygen inside.
                            If not treated quickly the effect could be fatal even if it's only a few hours late as the virus can fill in every bit of the victim's lungs.<br>
                            CoVid is prominent on older person as their immune system is not as strong as in their youth, but the effect is still applies to any ages.</p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>CoVid Symptoms are easy to identify pyhsically by fever signs in the first week, after
                            that it will develop into respiratory infection determined by how the person is severly coughing.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Do a self-isolation by taking a rest on a secure site e.g. home. to make sure how's
                            your condition.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Consult to a doctor for medicine and do a self-isolation at home or public-isolations
                            that was provided by public health services.
                        </p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Suggestion :</h2>
                    <div class="text-white text-justify">
                        <p>Consult to a doctor to get hospitalized and get extensive Oxygen and health support if needed.
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


