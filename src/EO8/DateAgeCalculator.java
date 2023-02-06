package EO8;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int calculateLowest(){
        return Math.round(yourAge / 2 + 7);
    }

    public boolean isDateable(){
        if (dateAge >= calculateLowest()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        DateAgeCalculator dac1 = new DateAgeCalculator(24, 17);

        System.out.println(dac1.calculateLowest());
        System.out.println(dac1.isDateable());
    }
}
