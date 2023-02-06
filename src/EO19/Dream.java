package EO19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dream {
    private LocalDate date;
    private int duration;
    private String type;

    public Dream(LocalDate date, int duration, String type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public boolean isPleasant(){

        if(type.equals("våd") && duration < 10){
            return true;
        } else if(type.equals("tør") && duration > 10){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Dream dream = new Dream(LocalDate.of(2002,12,23), 12, "våd");
        Dream dream2 = new Dream(LocalDate.of(2008,10,12), 17, "tør");
        Dream dream3 = new Dream(LocalDate.of(2004,8,21), 9, "mareridt");

        System.out.println(dream.isPleasant());
        System.out.println(dream2.isPleasant());
        System.out.println(dream3.isPleasant());

        ArrayList<Dream> dreams = new ArrayList<>();


        Collections.addAll(dreams, dream, dream2, dream3);
        System.out.println(dreams);

        Collections.sort(dreams, new dateComparator());
        System.out.println(dreams);
    }

    public static class dateComparator implements Comparator<Dream>{

        @Override
        public int compare(Dream o1, Dream o2) {
            return o1.date.compareTo(o2.date);
        }
    }

    @Override
    public String toString() {
        return date + " " + duration + " " + type;
    }
}
