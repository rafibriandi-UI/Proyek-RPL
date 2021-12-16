<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 25/11/2021
  Time: 19.57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex flex-col justify-center">
    <a href="/index.jsp" class=" font-black text-purple-900 px-14 py-14 text-2xl">Back</a>
    <div class="relative py-3 sm:max-w-xl sm:mx-auto">
        <div class="max-w-lg mx-auto">
            <body>

            ${assessmentId} ${disease}

            <form method="post" action="/assessment/generalRisk?assessmentId=${assessmentId}&disease=${disease}" class=" relative px-8 py-16 bg-purple-400 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:rounded-2xl">

                <h1 class="h-12 font-black text-purple-900 px-20 text-2xl">General Risk Factor<br></h1>

                <label for="smoking" class="py-3 font-body inline text-lg text-white">Smoking :</label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="smoking" name="smoking"><br>
                    <option value="low" >no</option>
                    <option value="medium">quit smoking not long ago</option>
                    <option value="high">yes</option>
                </select><br>

                <label for="physicalActivity" class="py-3 font-body inline-flex text-lg text-white items-center">Physical Activity per week :</label>
                <select class="sm:font-body p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="physicalActivity" name="physicalActivity">
                    <option value="high">higher than 300 minutes</option>
                    <option value="medium">150 up to 300 minutes</option>
                    <option value="low">less than 150 minutes</option>
                </select><br>

                <label for="familyHistory" class="py-3 font-body inline-flex text-lg text-white items-center">Family History of the disease:</label>
                <select class="sm:font-body  p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="familyHistory" name="familyHistory"><br>
                    <option value="high">exist</option>
                    <option value="medium">unsure</option>
                    <option value="low">not exist</option>
                </select><br>

                <label for="cholesterolLevel" class="py-3 font-body inline-flex text-white items-center">Total Cholesterol Level (mg/dL) : </label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="cholesterolLevel" name="cholesterolLevel"><br>
                    <option value="high">higher than 240, more than 200 for Adolescents/Children</option>
                    <option value="medium">200 up to 239, 170 up to 199 for Adolescents/Children</option>
                    <option value="low">less than 200, less than 170 for  Adolescents/Children</option>
                    <option value="unknown">i dont know</option>
                </select><br>

                <label for="systolicBP" class="py-3 font-body inline-flex text-white items-center">Systolic Blood Pressure : </label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="systolicBP" name="systolicBP"><br>
                    <option value="high">140 or higher</option>
                    <option value="medium">120 up to 139</option>
                    <option value="low">less than 120</option>
                    <option value="unknown">i dont know</option>
                </select><br>

                <label for="diastolicBP" class="py-3 font-body inline-flex text-white items-center">Diastolic Blood Pressure : </label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="diastolicBP" name="diastolicBP"><br>
                    <option value="high">90 or higher</option>
                    <option value="medium">80 up to 89</option>
                    <option value="low">less than 80</option>
                    <option value="unknown">i dont know</option>
                </select><br>

                <label for="bloodSugar" class="py-3 font-body inline-flex text-white items-center">blood sugar : </label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="bloodSugar" name="bloodSugar"><br>
                    <option value="high">126+(fasting) / 220-300(after eating) / 200+(2-3 hours after eating)</option>
                    <option value="medium">101-125(fasting) / 190-230(after eating) / 140-160(2-3 hours after eating)</option>
                    <option value="low">80-100(fasting) / 170-200(after eating) / 120-140(2-3 hours after eating)</option>
                    <option value="unknown">i dont know</option>
                </select><br>

                <label for="existingDisease" class="py-3 font-body inline-flex text-white items-center">Have you been diagnosed with the disease before? : </label>
                <select class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="text" id="existingDisease" name="existingDisease"><br><br>
                    <option value="high">yes</option>
                    <option value="low">no</option>
                </select><br>

                <button type="submit" class="font-body text-white shadow-md container py-1 bg-pink-200 appearance-none rounded-lg focus:outline-none focus:ring-2">submit</button>
                ${genRisk}
                <br>
                <button type="button" class="font-body text-white shadow-md container py-1 bg-pink-200 appearance-none rounded-lg focus:outline-none focus:ring-2">
                    <a href="/assessment/${disease}?genRisk=${genRisk}">Next</a></button>
            </form>

            ${smoking}
            ${physicalActivity}
            ${familyHistory}
            ${cholesterolLevel}
            ${systolicBP}
            ${diastolicBP}
            ${bloodSugar}
            ${existingDisease}
            </body>
        </div>
    </div>
</div>

</html>
