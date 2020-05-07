package com.company;




import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static String func(String[] value, int[] chance) {

        int sum = 0;

        for (int i = 0; i < chance.length; i++) {
            sum += chance[i];
        }


        int iNumber = 1 + (int) (Math.random() * sum);
        

        int q = 0;
            for(int i = chance.length-1 ; i>=0; i--){
                sum = sum - chance[i];
         if(sum>iNumber) {
               q = i;
               break;
           }

            }











      /* for (int i = 1; i < value.length; i++) {
            if (chance[0] > iNumber) {
                sb.append(value[0]);
                j = j + sb;
                return j;
            } else if ((chance[i - 1] <= iNumber && iNumber < chance[i])) {
                sb.append(value[i]);
                j = j + sb;
                return j;
            }
        }*/
        return value[q];
    }

    public static void main(String[] args) {


        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (n < 1000) {
            String func = func(new String[]{"a", "b", "c"}, new int[]{5, 5, 5});
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


      /*  int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (n < 1000) {
            String func = funcA(new String[]{"a", "b", "c"});

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
*/
        }
   /* public static String funcA(String [] enter){
        int lenenter = enter.length;
        int iNumber2 = 0 + (int) (Math.random() * lenenter); ;
        return enter[iNumber2];
    }*/
    }


