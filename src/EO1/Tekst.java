package EO1;

import java.util.ArrayList;
import java.util.Arrays;

public class Tekst {
    private ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String tekststring){
        tekstLinjer.add(tekststring);
    }

    public int findAntalUnikke(){
        ArrayList<String> unikke = new ArrayList<>();
        int unikkeStringe = 0;

        for (String tekststring : tekstLinjer){
            if (!unikke.contains(tekststring)){
                unikke.add(tekststring);
                unikkeStringe++;
            }
        }

        return unikkeStringe;
    }

    public static void main(String[] args) {
        Tekst tekst = new Tekst();

        tekst.tilføj("Hej");
        tekst.tilføj("Hej");
        tekst.tilføj("Anders");
        tekst.tilføj("Teller");
        tekst.tilføj("Hej");
        tekst.tilføj("Hej");
        tekst.tilføj("Svend");
        tekst.tilføj("Anders");

        System.out.println(tekst.findAntalUnikke());



    }
}
