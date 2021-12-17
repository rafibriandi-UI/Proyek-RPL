<%@ page import="com.kelompok2.projecthaa.Controller.userDataServlet" %>
<html>
<head>
    <title>User Data</title>
</head>

<link href="styles.css" rel="stylesheet">

<div class="min-h-screen bg-pink-200 flex-col justify-center sm:py-12">
    <div class="relative py-3 sm:max-w-xl sm:mx-auto">
        <div class="max-w-lg mx-auto">
            <body>

            <form method="post" action="userData" class=" relative px-8 py-16 bg-purple-400 shadow-lg transform  sm:skew-y-0 sm:rounded-2xl">

                <h1 class="h-12 font-black text-purple-900 flex justify-center px-20 text-2xl">Your Personal Data <br></h1>
                <p>${error}</p><br>

                <div class="mx-20">
                    <label for="name" class="py-3 font-extralight inline-flex text-lg text-white">Name :</label>
                    <input required class="font-light p-1 rounded-lg focus:outline-none focus:ring-2" type="text" id="name" name="name" value="${userData.name}"><br>
                </div>

                <div class="mx-20">
                    <label for="gender" class="py-3 font-extralight inline-flex text-lg text-white">Gender :</label>
                    <select class="font-light p-1 rounded-lg focus:outline-none focus:ring-2" id="gender" name="gender" value="${userData.gender}">
                        <option value="male" >Male</option>
                        <option value="female">Female</option>
                    </select><br>
                </div>

                <div class="mx-20">
                    <label for="age" class="py-3 font-extralight inline-flex text-lg text-white items-center">Your Age :</label>
                    <input required class="font-light p-1 rounded-lg focus:outline-none focus:ring-2" type="number" id="age" name="age" value="${userData.age}"><br>
                </div><br>

                <label class="font-semibold inline-flex text-lg text-white ml-40">Body Mass Index</label><br>
                <div class="mx-16">
                    <label for="height" class="py-3 font-extralight inline-flex text-white items-center">height : (in meter)</label>
                    <input required class="font-light p-1 rounded-lg focus:outline-none focus:ring-2" type="number" step="0.01" id="height" name="height" min="0" max="3" value="${BMI.height}"><br>

                    <label for="weight" class="py-3 font-extralight inline-flex text-white items-center">weight : (in kg)</label>
                    <input required class="p-1 appearance-none rounded-lg focus:outline-none focus:ring-2" type="number" step="0.1" id="weight" name="weight" min="0" max="200" value="${BMI.weight}"><br>
                </div>

                <div class="mx-20 bg-pink-200 rounded-lg my-3">
                    <p class="mx-24 font-semibold inline-flex text-white items-center">Your BMI :</p>
                    <p class="mx-28 py-2 font-body flex text-white inset-0">${bmi}</p>

                    <p class="mx-20 py-2 pb-4 font-body flex text-white items-center">${bmiCondition}</p>
                </div>
                <button type="submit" class="font-body text-white shadow-md container py-1 bg-purple-800 appearance-none rounded-lg focus:outline-none focus:ring-2">calculate BMI</button><br>
                <br>
                ${bmi != null ? '<button formaction="/assessment.jsp" type="submit" class="font-body text-white shadow-md container py-1 bg-purple-800 appearance-none rounded-lg focus:outline-none focus:ring-2">Next</button><br>' : " "}


            </form>
            </body>
        </div>
    </div>
</div>

</html>