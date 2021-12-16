package com.kelompok2.projecthaa.Models;

import java.io.Serializable;

public class userData implements Serializable {
        public String name;
        public String gender;
        public String age;
        public double BMI;
        public String bmiCondition;

        public userData(){
            super();
        }

        public userData(String name, String gender, String age, double BMI, String bmiCondition) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.BMI = BMI;
            this.bmiCondition = bmiCondition;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String birthdate) {
            this.age = age;
        }

        public double getBMI() {
            return BMI;
        }

        public void setBMI(double BMI) {
            this.BMI = BMI;
        }

        public String getBmiCondition() {
            return bmiCondition;
        }

        public void setBmiCondition(String bmiCondition) {
            this.bmiCondition = bmiCondition;
        }
}
