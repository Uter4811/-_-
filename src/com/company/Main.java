package com.company;

public class Main {

        public  String func(String[] value, int[]chance){
            int y = 0;
            for(int f = 0; f< chance.length -1; f++){
                y = y + chance[f];
            }


            String h = "";
            for(int i=0; i<chance.length; i++){


                String k = "";
                for(int j = 0; j < chance[i]/y; j++){
                    h= h + value[i];
                }

            }




            return h;
        }

    public static void main(String[] args) {
	  Main m = new Main();
	  String n = m.func(new String[]{"Пейсинг", "не", "нужен"}, new int[]{10, 61, 30});
        System.out.println(n);
    }
}
