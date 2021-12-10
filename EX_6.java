package com.company;


import java.util.Scanner;

public class Main {

    static int otvet = 0;

    public static void main(String[] args) {

        for(int i = 0; i > -3; i++) {

            int num2 = 0;
            int num20 = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println(" 1 Ввести пример. " + "\n 2 Продолжить работать с предыдущем ответом." + "\n 3 Выход.");

            String str = sc.nextLine();
            char zz = str.charAt(0);




            if(zz == '1'){
                System.out.println("Введите пример (например 2 + 2) ");
                String str2 = sc.nextLine();
                String[] words = str2.split(" ");

                int num1 = Integer.parseInt(words[0]);
                String zn = words[1];
                char z = zn.charAt(0);


                if (z == '+' || z == '-' || z == '*' || z == '/') {
                    num2 = Integer.parseInt(words[2]);
                    otvet = calc(num1, num2, z);
                    System.out.println("otvet " + otvet);
                }

                if (z == '^') {
                    num2 = Integer.parseInt(words[2]);

                    otvet = stepen(num1, num2);
                    System.out.println("otvet " + otvet);
                }

                if (z == '?') {
                    num2 = Integer.parseInt(words[2]);
                    sravnit(num1, num2);
                }
                if (z == '!') {
                    otvet = factorial(num1);
                    System.out.println("otvet " + otvet);
                }



            } //if 1

            if(zz == '2'){
                System.out.println(" 1 Сложение. " + "\n 2 Вычитание." + "\n 3 Умножение."+ "\n 4 Деление."+ "\n 5 Факториал."+ "\n 6 Возведение в степень."+ "\n 7 Сравнение."+ "\n 0 Назад.");

                String str22 = sc.nextLine();
                char zz2 = str22.charAt(0);

                if (zz2 == '1') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    otvet = calc(otvet, num20, '+');
                    System.out.println("otvet " + otvet);
                }
                if (zz2 == '2') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    otvet = calc(otvet, num20, '-');
                    System.out.println("otvet " + otvet);
                }
                if (zz2 == '3') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    otvet = calc(otvet, num20, '*');
                    System.out.println("otvet " + otvet);
                }
                if (zz2 == '4') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    otvet = calc(otvet, num20, '/');
                    System.out.println("otvet " + otvet);
                }

                if (zz2 == '6') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    otvet = stepen(otvet, num20);
                    System.out.println("otvet " + otvet);
                }

                if (zz2 == '7') {
                    String nu = sc.nextLine();
                    num20 = Integer.parseInt(nu);
                    sravnit(otvet, num20);
                }
                if (zz2 == '5') {
                    otvet = factorial(otvet);
                    System.out.println("otvet " + otvet);
                }

            } // if 2



            if(zz == '3'){
                break;
            } // if 3



        }   // for


    }
    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");

        }

        return result;
    }
    public static void sravnit(int num1, int num2){
        String result = "";

        if(num1 > num2){
              result = num1 + " > " + num2;
      }
        if(num1 == num2){
            result = num1 + " = " + num2;
        }
        if(num1 < num2){
            result = num1 + " < " + num2;
        }

        System.out.println(result);
    }

    public static int factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static int stepen(int num1, int num2) {
        int result = 0;

        double num3 = Math.pow(num1, num2);
        long n = Math.round(num3);
        int st = (int) n;
        result = st;

        return result;
    }

}