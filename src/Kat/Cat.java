package Kat;

import java.util.ArrayList;
import java.util.Collections;

public class Cat {

    private String name;
    private int numberOfLives;

    public Cat(String name){
        this.name = name;
        this.numberOfLives = 9;
    }

    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Anders");
        Cat cat2 = new Cat("Jens");
        Cat cat3 = new Cat("Nicolai");
        Cat cat4 = new Cat("Benjamin");

        Collections.addAll(cats, cat,cat2,cat3,cat4);

        for (Cat catObject : cats){
            System.out.println(catObject.getName() + " " + catObject.getNumberOfLives());
        }

        cat.retractLives();
        cat.retractLives();
        cat.retractLives();
        cat2.retractLives();
        cat2.retractLives();
        cat3.retractLives();
        cat3.retractLives();
        cat3.retractLives();
        cat3.retractLives();
        cat4.retractLives();
        cat4.retractLives();

        System.out.println();

        for (Cat catObject : cats){
            System.out.println(catObject.getName() + " " + catObject.getNumberOfLives());
        }


        Collections.sort(cats, new numberOfLivesComparator());

        System.out.println();

        for (Cat catObject : cats){
            System.out.println(catObject.getName() + " " + catObject.getNumberOfLives());
        }


    }

    public int retractLives(){


        if(numberOfLives > 0){
            this.numberOfLives --;
        }

        return numberOfLives;
    }

    public int getNumberOfLives(){
        return numberOfLives;
    }

    public String getName() {
        return name;
    }
}
