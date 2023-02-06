package Opgave2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;

    public Beer(String name){
        this.name = name;
    }

    public void setAlcoholPercentage(double alcoholPercentage){
        if (alcoholPercentage >= 0 && alcoholPercentage <= 100){
            this.alcoholPercentage = alcoholPercentage;
        }else{
            throw new RuntimeException("Alkoholprocent skal være mellem 0 & 100");
        }
    }

    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        }else{
            throw new RuntimeException("Prisen kan ikke være negativ!");
        }
    }

    public String getName() {
        return name;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Beer> beers = new ArrayList<>();

        Beer beer1 = new Beer("Tuborg Classic");
        Beer beer2 = new Beer("Blanc1664");
        Beer beer3 = new Beer("Corona");
        Beer beer4 = new Beer("Harboe Pilsner");

        try{
            beer1.setAlcoholPercentage(-4.8);
            beer2.setAlcoholPercentage(2.1);
            beer3.setAlcoholPercentage(1.2);
            beer4.setAlcoholPercentage(3.5);

        }catch(RuntimeException re){
            System.out.println(re.getMessage());
        }

        try{
            beer1.setPrice(12.5);
            beer2.setPrice(22);
            beer3.setPrice(18);
            beer4.setPrice(5.5);
        } catch(RuntimeException re){
            System.out.println(re.getMessage());
        }


        Collections.addAll(beers, beer1,beer2,beer3,beer4);

        double totalPrice = 0;

        for (Beer beer : beers){
            System.out.println(beer.getName() + ": " + beer.getPrice() + "kr.");
            totalPrice += beer.getPrice();
        }

        double averagePrice = totalPrice/beers.size();

        System.out.println("Gennemsnitspris af øllene: " + averagePrice);
    }
}
