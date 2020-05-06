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
        // int iNumber = (int) (Math.random() * ++sum) + 1;
       // int Inter = (int) (Math.random() * ++rand) + 1;

        int[] arr = new int[chance.length];
        for(int i = 0; i<chance.length; i++){
            arr[i] = chance[i];
        }

        Arrays.sort(arr);

       /* for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int k = i+1; k < arr.length; k++) {

                if (arr[k] < min) {
                    min = arr[k];
                    min_i = k;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }*/

        int r = 0;

        for(int i = arr.length-1; i>= 0; i--){
            sum = sum - arr[i];
            if(iNumber>= sum){
                r = arr[i];
                break;
            }




        }
        int q = 0;
        for(int i= 0; i< chance.length; i++){
            if(chance[i] == r){
                q = i;
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
            String func = func(new String[]{"a", "b", "c"}, new int[]{2, 4, 3});
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


