package EO10;

public class BMI {
    private double height;
    private double weight;

    public BMI (double height, double weight){
        if (height > 100){
            this.height = height/100;
        }else{
            this.height = height;
        }
        this.weight = weight;
    }

    public double calculate(){
        return weight/Math.pow(height,2);
    }

    public boolean isUnderWeight(){
        return calculate()<18.5;
    }

    public boolean isOverWeight(){
        return calculate() > 25;
    }

    public boolean isNormalWeight(){
        return calculate() > 18.5 && calculate() < 25;
    }

    public static void main(String[] args) {
        BMI bmi = new BMI(179, 102);
        System.out.println(bmi.calculate());
        System.out.println("Normalvægtig: " + bmi.isNormalWeight());
        System.out.println("Overvægtig: " + bmi.isOverWeight());
        System.out.println("Undervægtig: " + bmi.isUnderWeight());
    }
}
