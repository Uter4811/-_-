package com.company;

import java.util.Random;

public class Main2 {

    public static String func(String[] value, int[] chance) {

        int sum = 0;
        for (int i = 0; i < chance.length; i++) {
            sum += chance[i];
        }

        int iNumber = 1 + (int) (Math.random() * sum);
        int q = 0;
        for (int i = 0; i < chance.length; i++) {
            if (iNumber <= chance[i]) {
                q = i;
                break;
            }
            chance[i + 1] += chance[i];
        }
        return value[q];

    }

    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (n < 1000) {
            String func = func(new String[]{"a", "b", "c"}, new int[]{1, 1, 100});
            switch (func) {
                case ("a"):
                    a++;
                    break;
                case ("b"):
                    b++;
                    break;
                case ("c"):
                    c++;
                    break;
            }
            n++;
        }
        System.out.println("a = " + a + " b = " + b + " c = " + c);

    }
}

