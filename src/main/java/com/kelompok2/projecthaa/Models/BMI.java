package com.kelompok2.projecthaa.Models;

public class BMI {
    private String height;
    private String weight;
    private double BMI;

//    public BMI() {
//        this.height = 170;
//        this.weight = 56;
//        this.BMI = 19.5;
//    }

    public BMI(String height, String weight, double BMI) {
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
    }

    public static double bmiCounter(String height, String weight) {
        Double h = Double.parseDouble(height);
        Double w = Double.parseDouble(weight);
        float bmi;
        return bmi = (float) (w / (h * h));
    }
    public static String bmiCondition(double BMI) {
        String message;

        if (BMI <= 18.4) {
            message = "Underweight";
        } else if (BMI < 24.9) {
            message = "Normal weight";
        } else if (BMI < 29.9) {
            message = "Overweight";
        } else if (BMI < 35.0) {
            message = "Obesity class 1";
        } else if (BMI < 39.9) {
            message = "Obesity class 2";
        } else {
            message = "Obesity class 3";
        }
        return message;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}
