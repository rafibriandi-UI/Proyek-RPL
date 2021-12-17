package com.kelompok2.projecthaa.Models;

public class riskCalculator {

    static double result, sum, risk1, risk2, risk3, risk4, risk5, risk6, risk7;

    public static double calculate(String disease, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                   String symptoms5, String symptoms6, String symptoms7) {
        double value;
        switch(disease) {
            case "diabetest1":
            case "diabetest2":
                sum = 110;
                value = riskCalculator1(sum, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5);
                return value;
            case "cvd":
                sum = 100;
                value = riskCalculator2(sum, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, symptoms6);
                return value;
            case "coldFlu":
                sum = 130;
                value = riskCalculator3(sum, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5);
                return value;
            case "covid":
                sum = 140;
                value = riskCalculator4(sum, symptoms1, symptoms2, symptoms3, symptoms4);
                return value;
            case "malaria":
                sum = 130;
                value = riskCalculator5(sum, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, symptoms6);
                return value;
            case "sinusitis":
                sum = 130;
                value = riskCalculator6(sum, symptoms1, symptoms2, symptoms3, symptoms4, symptoms5, symptoms6, symptoms7);
                return value;
            default:
                throw new IllegalStateException("Unexpected value: " + disease);
        }

    }

    private static double riskCalculator1(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                         String symptoms5) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 20;
                    break;
                case "unsure":
                    risk1 = 12;
                    break;
                case "no":
                    risk1 = 4;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 30;
                    break;
                case "unsure":
                    risk2 = 20;
                    break;
                case "no":
                    risk2 = 5;
                    break;
            }
        }

        if(symptoms3 != null ) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 30;
                    break;
                case "unsure":
                    risk3 = 15;
                    break;
                case "no":
                    risk3 = 6;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 20;
                    break;
                case "medium":
                    risk4 = 12;
                    break;
                case "no":
                    risk4 = 4;
                    break;
            }
        }

        if(symptoms5 != null ) {
            switch (symptoms5) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "yes":
                    risk5 = 10;
                    break;
                case "unsure":
                    risk5 = 5;
                    break;
                case "no":
                    risk5 = 2;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5) / sum) * 50;
        return result;
        }

    private static double riskCalculator2(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                          String symptoms5, String symptoms6) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 20;
                    break;
                case "unsure":
                    risk1 = 12;
                    break;
                case "no":
                    risk1 = 4;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 10;
                    break;
                case "unsure":
                    risk2 = 5;
                    break;
                case "no":
                    risk2 = 2;
                    break;
            }
        }

        if(symptoms3 != null ) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 20;
                    break;
                case "unsure":
                    risk3 = 10;
                    break;
                case "no":
                    risk3 = 3;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 10;
                    break;
                case "medium":
                    risk4 = 6;
                    break;
                case "no":
                    risk4 = 2;
                    break;
            }
        }

        if(symptoms5 != null ) {
            switch (symptoms5) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "yes":
                    risk5 = 10;
                    break;
                case "unsure":
                    risk5 = 5;
                    break;
                case "no":
                    risk5 = 2;
                    break;
            }
        }

        if(symptoms6 != null ) {
            switch (symptoms6) {
                case "notCount":
                    risk6 = 0;
                    break;
                case "yes":
                    risk6 = 30;
                    break;
                case "unsure":
                    risk6 = 15;
                    break;
                case "no":
                    risk6 = 6;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6) / sum) * 60;
        return result;
    }

    private static double riskCalculator3(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                          String symptoms5) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 20;
                    break;
                case "unsure":
                    risk1 = 12;
                    break;
                case "no":
                    risk1 = 4;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 20;
                    break;
                case "unsure":
                    risk2 = 10;
                    break;
                case "no":
                    risk2 = 4;
                    break;
            }
        }

        if(symptoms3 != null) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 40;
                    break;
                case "unsure":
                    risk3 = 22;
                    break;
                case "no":
                    risk3 = 6;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 30;
                    break;
                case "medium":
                    risk4 = 16;
                    break;
                case "no":
                    risk4 = 5;
                    break;
            }
        }

        if(symptoms5 != null ) {
            switch (symptoms5) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "yes":
                    risk5 = 20;
                    break;
                case "unsure":
                    risk5 = 10;
                    break;
                case "no":
                    risk5 = 6;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5) / sum) * 70;
        return result;
    }

    private static double riskCalculator4(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4
                                          ) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 20;
                    break;
                case "unsure":
                    risk1 = 12;
                    break;
                case "no":
                    risk1 = 4;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 40;
                    break;
                case "unsure":
                    risk2 = 20;
                    break;
                case "no":
                    risk2 = 6;
                    break;
            }
        }

        if(symptoms3 != null ) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 40;
                    break;
                case "unsure":
                    risk3 = 20;
                    break;
                case "no":
                    risk3 = 6;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 40;
                    break;
                case "medium":
                    risk4 = 20;
                    break;
                case "no":
                    risk4 = 6;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4) / sum) * 70;
        return result;
    }

    private static double riskCalculator5(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                          String symptoms5, String symptoms6) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 20;
                    break;
                case "unsure":
                    risk1 = 12;
                    break;
                case "no":
                    risk1 = 4;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 10;
                    break;
                case "unsure":
                    risk2 = 5;
                    break;
                case "no":
                    risk2 = 2;
                    break;
            }
        }

        if(symptoms3 != null ) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 20;
                    break;
                case "unsure":
                    risk3 = 10;
                    break;
                case "no":
                    risk3 = 4;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 20;
                    break;
                case "medium":
                    risk4 = 12;
                    break;
                case "no":
                    risk4 = 4;
                    break;
            }
        }

        if(symptoms5 != null ) {
            switch (symptoms5) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "yes":
                    risk5 = 30;
                    break;
                case "unsure":
                    risk5 = 15;
                    break;
                case "no":
                    risk5 = 6;
                    break;
            }
        }

        if(symptoms6 != null ) {
            switch (symptoms6) {
                case "notCount":
                    risk6 = 0;
                    break;
                case "yes":
                    risk6 = 30;
                    break;
                case "unsure":
                    risk6 = 15;
                    break;
                case "no":
                    risk6 = 6;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6) / sum) * 70;
        return result;
    }

    private static double riskCalculator6(double sum, String symptoms1, String symptoms2, String symptoms3, String symptoms4,
                                          String symptoms5, String symptoms6, String symptoms7) {
        if(symptoms1 != null ) {
            switch (symptoms1) {
                case "notCount":
                    risk1 = 0;
                    break;
                case "yes":
                    risk1 = 30;
                    break;
                case "unsure":
                    risk1 = 15;
                    break;
                case "no":
                    risk1 = 6;
                    break;
            }
        }

        if(symptoms2 != null ) {
            switch (symptoms2) {
                case "notCount":
                    risk2 = 0;
                    break;
                case "yes":
                    risk2 = 10;
                    break;
                case "unsure":
                    risk2 = 5;
                    break;
                case "no":
                    risk2 = 2;
                    break;
            }
        }

        if(symptoms3 != null ) {
            switch (symptoms3) {
                case "notCount":
                    risk3 = 0;
                    break;
                case "yes":
                    risk3 = 30;
                    break;
                case "unsure":
                    risk3 = 15;
                    break;
                case "no":
                    risk3 = 6;
                    break;
            }
        }

        if(symptoms4 != null ) {
            switch (symptoms4) {
                case "notCount":
                    risk4 = 0;
                    break;
                case "yes":
                    risk4 = 10;
                    break;
                case "medium":
                    risk4 = 5;
                    break;
                case "no":
                    risk4 = 2;
                    break;
            }
        }

        if(symptoms5 != null ) {
            switch (symptoms5) {
                case "notCount":
                    risk5 = 0;
                    break;
                case "yes":
                    risk5 = 10;
                    break;
                case "unsure":
                    risk5 = 5;
                    break;
                case "no":
                    risk5 = 2;
                    break;
            }
        }

        if(symptoms6 != null ) {
            switch (symptoms6) {
                case "notCount":
                    risk6 = 0;
                    break;
                case "yes":
                    risk6 = 20;
                    break;
                case "unsure":
                    risk6 = 10;
                    break;
                case "no":
                    risk6 = 4;
                    break;
            }
        }

        if(symptoms7 != null ) {
            switch (symptoms7) {
                case "notCount":
                    risk7 = 0;
                    break;
                case "yes":
                    risk3 = 20;
                    break;
                case "unsure":
                    risk3 = 10;
                    break;
                case "no":
                    risk3 = 4;
                    break;
            }
        }

        result = ((risk1 + risk2 + risk3 + risk4 + risk5 + risk6 + risk7) / sum) * 70;
        return result;
    }

}
