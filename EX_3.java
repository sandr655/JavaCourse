package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[]{3, 22, 1, 13, 4, 6, 16, 5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }


        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] < 100) {
                System.out.print(arr[i] + " ");
            }
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\n" + max);

        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);


        int m = arr.length;
        int[] arrP = new int[m];
        m = arr.length - 1;
        int i2 = 0;

        for (int i = m; i!=-1; i--){
            arrP[i2] = arr[m];
            m = m-1;
            i2++;

        }
        System.out.println(Arrays.toString(arrP));
    }
}