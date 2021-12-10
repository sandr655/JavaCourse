package com.company;




import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[][] arr  = {{1,2,3},{5,6,7},{9,10,11},{22,23,24}};
//        Scanner scr = new Scanner(System.in);
//
//        int[][] arr = new int[3][2];
//        for(int s = 0; s < arr.length; s++){
//
//            for (int k = 0; k < arr[s].length; k++){
//                System.out.println("введите число");
//                arr[s][k] = scr.nextInt();
//            }
//        }

// 1
        System.out.println("#1");
        int col = 0;
        int str = 0;

        for(int s = 0; s < arr.length; s++){
            int sum = 0;
            col = 0;
            str = str+1;
            for (int k = 0; k < arr[s].length; k++){
                sum = sum + arr[s][k];
                col = col+1;
            }
            System.out.println("line "+(s+1)+" сумма "+ sum);
        }
// 2
        System.out.println("#2");

            for(int i = 0; i != col; i++){
                int sum = 0;
                for(int i2 = 0; i2 != str; i2++) {
                    sum = sum + arr[i2][i];
                }
                System.out.println("Column "+(i+1)+" сумма "+sum);
            }

        // 4
        System.out.println("\n"+"#4");
        col = 0;
        str = 0;

        for(int s = 0; s < arr.length; s++){
            int sum = 0;
            col = 0;
            str = str+1;
            for (int k = 0; k < arr[s].length; k++){
                sum = sum + arr[s][k];
                col = col+1;
            }
            System.out.println("line "+(s+1)+" сумма "+ (sum/col));
        }
// 5
        System.out.println("\n"+"#5");
        List<Integer> arrList = new ArrayList();

        for(int s = 0; s < arr.length; s++) {
            str = str + 1;
            for (int k = 0; k < arr[s].length; k++) {
                arrList.add(arr[s][k]);
            }
        }

            Integer[] arrArray = new Integer[arrList.size()];
            Collections.reverse(arrList);
            for (int i = 0; i < arrList.size(); i++) {
                arrArray[i] = arrList.get(i);
            }

        System.out.println(Arrays.toString(arrArray));
 // 3
        System.out.println("\n"+"#3");


            int[][] arr2 = arr;

            for (int s = 0; s < arr2.length; s++) {

                for (int k = 0; k < arr2[s].length; k++) {
                    if (arr2[s][k] % 2 == 0) {
                        arr2[s][k] = 0;
                    } else {
                        arr2[s][k] = 1;
                    }
                }

            }
            System.out.print("новый массив ");
            for (int s = 0; s < arr2.length; s++) {
                System.out.println();
                for (int k = 0; k < arr2[s].length; k++) {
                    System.out.print(arr2[s][k] + " ");
                }
            }



        }

    }
