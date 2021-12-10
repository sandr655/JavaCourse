package com.company;


import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String str= "Maik 123";


       stroka(str);

    }
    public static void stroka(String str) {

        String[] words = str.split(" ");
        int num = Integer.parseInt(words[1]);
        int total = 0;
        int sum = number(num,total);



        System.out.println("Привет "+words[0]+"! Сумма цифр в числе = "+st(sum));
    }
    public static int number(int num, int total){

        if (num == 0) return total;
        total += num % 10;
        return number(num / 10, total);
    }

    public static String st(int num){
        String s = "null";
        String[]array = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"};
        if ( num >= 0 && num <= 10 )
            s = array[num];

    return s;}
}