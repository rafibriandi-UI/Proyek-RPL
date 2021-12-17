<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 20.01
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
                        <p>Sinusitis is a common condition in which the lining of the sinuses
                            becomes inflamed. It's usually caused by a viral infection and often
                            improves within two or three weeks.
                            The sinuses are small, air-filled cavities behind your cheekbones and forehead.<br>

                            Sinusitis is usually the result of a cold or flu virus spreading to the sinuses from the upper airways. Only a few cases are caused by bacteria infecting the sinuses.
                            An infected tooth or fungal infection can also occasionally cause the sinuses to become inflamed.<br>


                            It's not clear exactly what causes sinusitis to become chronic (long-lasting), but it has been associated with
                            allergies and related conditions, including allergic rhinitis, asthma and hay fever, nasal polyps (growths inside the nose), smoking,  and a weakened immune system</p><br>
                    </div>
                </div>

                <div>
                    <h2 class="font-bold text-lg">Condition Review :</h2>
                    <div class="text-white text-justify">
                        <p>Sinusitis usually occurs after an upper respiratory tract infection, such as a cold. If you have a persistent cold and develop the symptoms below, you may have sinusitis.
                            Symptoms of sinusitis include:<br>
                        <div class="mx-5">
                            a green or yellow discharge from your nose<br>
                            a blocked nosepain and tenderness around your cheeks<br>
                            eyes or foreheada sinus headache<br>
                            having a high temperature (fever) of 38C (100.4F) or more<br>
                            toothache<br>
                            reduced sense of smell<br>
                            and bad breath (halitosis)
                        </div>
                        </p><br>
                    </div>
                </div>

                ${riskLevel == "Low Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>With few known symptoms you are less likely to have sinusitis, however make sure to underlying conditions such as allergies and asthma are well controlled may improve the symptoms of chronic sinusitis.</p><br></div></div>' : " " }

                ${riskLevel == "Medium Risk" || riskLevel == "High Risk" ? '<div><h2 class="font-bold text-lg">Suggestion :</h2><div class="text-white text-justify"><p>when the first symptom (yellow discharge from your nose) is present, there is a high enough chance that you have sinusitis so you need to be sure with your doctor, if not please make sure to underlying conditions such as allergies and asthma are well controlled may improve the symptoms of chronic sinusitis in few days, if the symptoms not dissappearing then the best way is to see doctor immedietly.</p></div></div>' : " " }

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

