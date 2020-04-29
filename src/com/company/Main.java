package com.company;

import java.util.Random;

public class Main {

       public  static  int n =1;
       String j= "";


    public String func(String[] value, int[]chance){
            int sum = 0;
            for(int i = 0; i< chance.length; i++){
                sum+= chance[i];

            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < value.length; i++){

                int iNumber = (int)(Math.random() * ++sum) + 1;


                if(iNumber>=chance[i] && chance[i]<iNumber){
                    sb.append(value[i]+ " ,");
                    j = j + sb;
                }

            }
            n++;
            return j;





        }

    public static void main(String[] args) {
            Main mn = new Main();
        String func = mn.func(new String[]{"а","b","c"}, new int[]{10,61,30});
        System.out.println(func);

    }


}
