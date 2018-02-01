
package algus;

import java.util.Arrays;

public class Massiivid {
    public static void main(String[] arg){
        int[] pikkused = {176,163,158,171,169};
        System.out.println("Kokku:" +pikkused.length);
        System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
        for(int i=0; i<pikkused.length; i++){
            System.out.println(pikkused[i]);
             }
            int summa = 0;
            for(int m=0; m<pikkused.length; m++){
                summa= pikkused[m] + summa;
                
            }

        
        System.out.println("Summa on:" +summa);
        summa=0;
        for(int pikkus: pikkused){summa+=pikkus;}
        System.out.println(summa);
        System.out.println(Arrays.stream(pikkused).sum());
    }
}
