package com.kelompok2.projecthaa.Models;

public class generalRiskCalculator extends userData {

    static int risk1 = 0, risk2 = 0, risk3 = 0, risk4 = 0, risk5 = 0,
            risk6 = 0, risk7 = 0, risk8 = 0;
    static double result;

    private int assessmentId;
    private String smoking;
    private String physicalActivity;
    private String familyHistory;
    private String cholesterolLevel;
    private String systolicBP;
    private String diastolicBP;
    private String bloodSugar;
    private String existingDisease;


    public generalRiskCalculator(int assessmentId, String physicalActivity, String smoking, String familyHistory, String cholesterolLevel, String systolicBP, String diastolicBP, String bloodSugar, String existingDisease) {
        super();
        this.assessmentId = assessmentId;
        this.physicalActivity = physicalActivity;
        this.smoking = smoking;
        this.familyHistory = familyHistory;
        this.cholesterolLevel = cholesterolLevel;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
        this.bloodSugar = bloodSugar;
        this.existingDisease = existingDisease;
    }

    public static double calculate(int assessmentId, String physicalActivity, String smoking, String familyHistory, String cholesterolLevel, String systolicBP,
                                String diastolicBP, String bloodSugar, String existingDisease) {
        double value;
        switch(assessmentId) {
            case 1:
            case 2:
                value = diabetesGeneralRiskCalculator(physicalActivity, smoking, familyHistory, cholesterolLevel, systolicBP,
                        diastolicBP, bloodSugar, existingDisease);
                return value;
            case 3:
                value = cvdGeneralRiskCalculator(physicalActivity, smoking, familyHistory, cholesterolLevel, systolicBP,
                        diastolicBP, bloodSugar, existingDisease);
                return value;
            case 4:
            case 5:
            case 6:
            case 7:
                value = genRiskCalculator(physicalActivity, smoking, familyHistory, cholesterolLevel, systolicBP,
                        diastolicBP, bloodSugar, existingDisease);
                return value;
            default:
                throw new IllegalStateException("Unexpected value: " + assessmentId);
        }

    }

    private static double diabetesGeneralRiskCalculator(String physicalActivity, String smoking, String familyHistory, String cholesterolLevel, String systolicBP,
                                                     String diastolicBP, String bloodSugar, String existingDisease) {
        double sum = 120;
        if(smoking != null ) {
            switch (smoking) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "high":
                    risk1 = 10;
                    break;
                case "medium":
                    risk1 = 2;
                    break;
                case "low":
                    risk1 = 7;
                    break;
            }
        }

        if(physicalActivity != null ) {
            switch (physicalActivity) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "high":
                    risk2 = 5;
                    break;
                case "medium":
                    risk2 = 1;
                    break;
                case "low":
                    risk2 = 3;
                    break;
            }
        }

        if(familyHistory != null) {
            switch (familyHistory) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "high":
                    risk3 = 5;
                    break;
                case "medium":
                    risk3 = 3;
                    break;
                case "low":
                    risk3 = 1;
                    break;
            }
        }

        if(cholesterolLevel != null) {
            switch (cholesterolLevel) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "high":
                    risk4 = 20;
                    break;
                case "medium":
                case "unknown" :
                    risk4 = 10;
                    break;
                case "low":
                    risk4 = 5;
                    break;
            }
        }

        if(systolicBP != null) {
            switch (systolicBP) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "high":
                    risk5 = 10;
                    break;
                case "medium":
                case "unknown" :
                    risk5 = 7;
                    break;
                case "low":
                    risk5 = 3;
                    break;
            }
        }

        if(diastolicBP != null) {
            switch (diastolicBP) {
                case "notCount":
                    risk6 = 0;
                    break;
                case "high":
                    risk6 = 10;
                    break;
                case "medium":
                case "unknown" :
                    risk6 = 7;
                    break;
                case "low":
                    risk6 = 3;
                    break;
            }
        }

        if(bloodSugar != null) {
            switch (bloodSugar) {
                case "notCount":
                    risk7 = 0;
                    break;
                case "high":
                    risk7 = 20;
                    break;
                case "medium":
                case "unknown" :
                    risk7 = 14;
                    break;
                case "low":
                    risk7 = 7;
                    break;
            }
        }

        if(existingDisease != null) {
            switch (existingDisease) {
                case "notCount":
                    risk8 = 0;
                    break;
                case "high":
                    risk8 = 40;
                    break;
                case "low":
                    risk8 = 10;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6 + risk7 + risk8) / sum) * 50;
//        System.out.println(risk1);
//        System.out.println(risk2);
//        System.out.println(risk3);
//        System.out.println(risk4);
//        System.out.println(risk5);
//        System.out.println(risk6);
//        System.out.println(risk7);
//        System.out.println(risk8);
//        System.out.println(result);
        return result;
    }

    private static double cvdGeneralRiskCalculator(String physicalActivity, String smoking, String familyHistory, String cholesterolLevel, String systolicBP,
                                                     String diastolicBP, String bloodSugar, String existingDisease) {
        double sum = 120;
        if(smoking != null ) {
            switch (smoking) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "high":
                    risk1 = 15;
                    break;
                case "medium":
                    risk1 = 5;
                    break;
                case "low":
                    risk1 = 10;
                    break;
            }
        }

        if(physicalActivity != null ) {
            switch (physicalActivity) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "high":
                    risk2 = 10;
                    break;
                case "medium":
                    risk2 = 5;
                    break;
                case "low":
                    risk2 = 3;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + physicalActivity);
            }
        }

        if(familyHistory != null) {
            switch (familyHistory) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "high":
                    risk3 = 10;
                    break;
                case "medium":
                    risk3 = 5;
                    break;
                case "low":
                    risk3 = 2;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + familyHistory);
            }
        }

        if(cholesterolLevel != null) {
            switch (cholesterolLevel) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "high":
                    risk4 = 20;
                    break;
                case "medium":
                case "unknown" :
                    risk4 = 8;
                    break;
                case "low":
                    risk4 = 3;
                    break;
            }
        }

        if(existingDisease != null) {
            switch (existingDisease) {
                case "notCount":
                    risk8 = 0;
                    break;
                case "high":
                    risk8 = 40;
                    break;
                case "low":
                    risk8 = 10;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6 + risk7 + risk8) / sum) * 40;
        return result;
    }

    private static double genRiskCalculator(String physicalActivity, String smoking, String familyHistory, String cholesterolLevel, String systolicBP,
                                                String diastolicBP, String bloodSugar, String existingDisease) {
        double sum = 120;
        if(smoking != null ) {
            switch (smoking) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "high":
                    risk1 = 5;
                    break;
                case "medium":
                    risk1 = 3;
                    break;
                case "low":
                    risk1 = 1;
                    break;
            }
        }

        if(physicalActivity != null ) {
            switch (physicalActivity) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "high":
                    risk2 = 50;
                    break;
                case "low":
                    risk2 = 5;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + physicalActivity);
            }
        }

        if(existingDisease != null) {
            switch (existingDisease) {
                case "notCount":
                    risk8 = 0;
                    break;
                case "high":
                    risk8 = 50;
                    break;
                case "low":
                    risk8 = 10;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6 + risk7 + risk8) / sum) * 30;
        return result;
    }


    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getPhysicalActivity() {
        return physicalActivity;
    }

    public void setPhysicalActivity(String physicalActivity) {
        this.physicalActivity = physicalActivity;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public String getCholesterolLevel() {
        return cholesterolLevel;
    }

    public void setCholesterolLevel(String cholesterolLevel) {
        this.cholesterolLevel = cholesterolLevel;
    }

    public String getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(String systolicBP) {
        this.systolicBP = systolicBP;
    }

    public String getDiastolicBP() {
        return diastolicBP;
    }

    public void setDiastolicBP(String diastolicBP) {
        this.diastolicBP = diastolicBP;
    }

    public String getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(String bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getExistingDisease() {
        return existingDisease;
    }

    public void setExistingDisease(String existingDisease) {
        this.existingDisease = existingDisease;
    }
}
