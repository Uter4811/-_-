package com.company;

public class Main {

       public  static  int n =1;

        public  String func(String[] value, int[]chance){
            int sum = 0;
            for(int i = 0; i< chance.length; i++){
                sum+= chance[i];

            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < value.length; i++){
                sb.append(value[i]+" "+chance[i]/sum*n+" ,");
            }
            n++;
            return sb.toString();





        }

    public static void main(String[] args) {

    }
}
