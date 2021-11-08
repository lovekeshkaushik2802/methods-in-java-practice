package com.javaLearning;

public class Main {

    public static void main(String[] args) {

        // first method
        int calculate = calculateSum(3,2 ,1);
        System.out.println(calculate);

        // second method
        int calculateper = calculatePercentage1(50,50 , 50 , 50 ,50);
        System.out.println(calculateper);

        // third method
//        countingTable(5);


        // fourth method
        int percentage = calculatePercentage(500 , 80 ,80, 80, 80, 80);
        pritPercentage("Lovekesh" ,"Satya kumar", percentage);

        int percentage2 = calculatePercentage(500 , 75 ,88, 89, 90, 99);
        pritPercentage("Parul" ,"Pardeep", percentage2);

        int percentage3 = calculatePercentage(500 , 80 ,80, 88, 90, 98);
        pritPercentage("Ankit" ,"Shri bhagvan", percentage3);

        int percentage4 = calculatePercentage(500 , 90 ,88, 90, 100, 99);
        pritPercentage("Vivek" ,"Ram tilak", percentage4);


    }

    public static  int calculateSum(int num1 , int num2 , int num3){
        int sum = num1 + num2 + num3;
        if (sum == 5){
            return sum;
        }else{
            return sum;
        }
    }

    public static int calculatePercentage1(int sub1,int sub2 , int sub3 , int sub4 , int sub5){
        int totalSum = sub1 + sub2 + sub3 + sub4+ sub5;
        if (totalSum > 200){
            int sum = totalSum/5;
            return sum;
        } else {
            return -1;
        }
    }
/*
    public static void countingTable(int number){
        int multiply  =  number * 1;
        int multiply2 = number * 2;
        int multiply3 = number * 3;
        int multiply4 = number * 4;
        int multiply5 = number * 5;
        int multiply6 = number * 6;
        int multiply7 = number * 7;
        int multiply8 = number * 8;
        int multiply9 = number * 9;
        int multiply10 = number * 10;
        System.out.println(number + " x 1" + " = " +multiply);
        System.out.println(number + " x 2" +  " = " + multiply2);
        System.out.println(number + " x 3" +  " = " + multiply3);
        System.out.println(number + " x 4" +  " = " + multiply4);
        System.out.println(number + " x 5" +  " = " + multiply5);
        System.out.println(number + " x 6" +  " = " + multiply6);
        System.out.println(number + " x 7" +  " = " + multiply7);
        System.out.println(number + " x 8" +  " = " + multiply8);
        System.out.println(number + " x 9" +  " = " + multiply9);
        System.out.println(number + " x 10" + " = " + multiply10);
    }*/

    public static int calculatePercentage(int totalMarks , int mathematics , int physics , int chemistry , int english , int sanskrit ){
        int sumOfTotalSubjects = mathematics + physics + chemistry + english + sanskrit;
        int calculatePercentage = sumOfTotalSubjects*100/totalMarks;
        return calculatePercentage;
    }
    public static void pritPercentage(String studentName , String fatherName , int getPercentage){
        String printString = "Mr. " +studentName + " s/o Mr. " + fatherName + ". You get " + getPercentage  +" percentage";
        System.out.println(printString);
    }
}
