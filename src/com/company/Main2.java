package com.company;



import java.util.Random;

public class Main2 {




    public static String func(String[] value, int[]chance){
        String j= "";
        int sum = 0;
        int rand = value.length;
        for (int i = 0; i < chance.length; i++) {
            sum += chance[i];

        }

        StringBuilder sb = new StringBuilder();

           int iNumber = 1 + (int) (Math.random() * sum);
           // int iNumber = (int) (Math.random() * ++sum) + 1;
            int Inter = (int) (Math.random() * ++rand) + 1;





             for(int i = 1; i< value.length; i++) {
                 if(chance[0] > iNumber ){

                     sb.append(value[0]);
                     j = j + sb;

                     return j;
                 } else if((chance[i-1] <= iNumber &&  iNumber < chance[i])){

                     sb.append(value[i]);
                     j = j + sb;

                     return j;
                 }
             }
        return j;

            }









    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (n < 1000) {
            String func = func(new String[]{"a", "b", "c"}, new int[]{2, 5, 10});

            for (int i = 0; i < func.length(); i++) {
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
            }
            n++;
        }

        System.out.println("a = " + a + " b = " + b + " c = " + c);

    }


}

