package EO3;

import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private int[] terninger;

    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
        this.terninger = new int[antalTerninger];
    }

    public int ryst(){
        int samletAntal = 0;
        Random r = new Random();

        for (int i = 0; i < antalTerninger; i++){
            int øjne = r.nextInt(1,7);
            terninger[i] = øjne;
            samletAntal += øjne;
        }

        return samletAntal;
    }

    public int[] se(){
        return terninger;
    }

    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(8);

        System.out.println(raflebæger.ryst());
        System.out.println(Arrays.toString(raflebæger.se()));
    }

}
