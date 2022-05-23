package org.example;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message1 = "Hello \"Rajitha\"";
        System.out.println(message1);
        int age = 35;
        System.out.println(age);
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);
        byte age1 = 40;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        System.out.println(now);
        System.out.println("now.getTime(): " + now.getTime());
        byte x = 1;
        byte y = 2;
        x = 2;
        System.out.println(y);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println("message length: " + message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        String message2 = "c;\\Windows\\...";
        System.out.println(message2);
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[][] Rowscolumns = new int[2][3];
        Rowscolumns[0][0] = 1;
        System.out.println(Arrays.deepToString(Rowscolumns));
        int[][] RColumns = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(RColumns));
        int result = 10 + 3;
        System.out.println(("Addition result:" + result));
        int subtractionresult = 10 - 3;
        System.out.println(("subtraction result:" + subtractionresult));
        int divisionresult = 9 / 3;
        System.out.println(("Division result;" + divisionresult));
        double Divresult = (double) 10 / (double) 3;
        System.out.println(("decimal result:" + Divresult));
        int A = 1;
        A++;
        System.out.println(A);
        int B = 1;
        int C = B++;
        System.out.println("B result:" +B);
        System.out.println("C result:" +C);
        int D = 1;
        int E = ++D;
        System.out.println(D);
        System.out.println(E);
        int F = 1;
        F+=2;
        System.out.println(F);
        int G = 10 + 3 *2;
        System.out.println(G);
        //Implicit cating
        //byte > short > INt > long >float >double
        double H = 1.1;
        double I = H + 2;
        System.out.println("I result :" +I);
        int Mathresult = Math.round(1.1F);
        System.out.println("Math round :"+Mathresult);
        int ceilresult = (int)Math.floor(1.1F);
        System.out.println("ceil result:"+ ceilresult);
        int maxresult = Math.max(1,2);
        System.out.println("Max result:"+maxresult);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyresult = currency.format((123456.897));
        System.out.println("currencyresult:" +currencyresult);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentresult = percent.format(0.1);
        System.out.println("percent result:"+percentresult);


        }







    }














