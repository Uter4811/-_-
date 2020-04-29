package com.company;

import java.util.Random;

public class Main {

       public  static  int n =1;
       String j= "";



    public String func(String[] value, int[]chance){
            int sum = 0;
            for (int i = 0; i < chance.length; i++) {
                sum += chance[i];

            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < value.length; i++) {

                int iNumber = (int) (Math.random() * ++sum) + 1;


                if (iNumber >= chance[i] && chance[i] < iNumber) {
                    sb.append(value[i] + " ,");
                    j = j + sb;

                }

            }
            n++;
            return j;

        }



    public static void main(String[] args) {
            Main mn = new Main();
            int n= 0;
            int a = 0;
            int b=0;
            int c=0;
            while(n<1000) {
                String func = mn.func(new String[]{"а", "b", "c"}, new int[]{2, 5, 10});
                int[] arr = new int[func.length()];

                for (int i = 0; i < func.length(); i++) {
                    arr[i]= func.charAt(i);
                }

                for (int i = 0; i < arr.length; i++) {
                    if(func.charAt(i)=='a'){
                        a++;
                    }
                    if(func.charAt(i)=='b'){
                        b++;
                    }
                    if(func.charAt(i)=='c'){
                        c++;
                    }
                }


                n++;
            }

        System.out.println(a+" "+b+" "+c);
    }


}
