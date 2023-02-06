package Opgave1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    public void setHouse(String house){
        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")){
            this.house = house;
        }else{
            throw new RuntimeException("Ugyldigt husnavn");
        }
    }

    public static void main(String[] args){
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();

        HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Harry", "Potter");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Ron", "Weasley");
        HogwartsStudent hogwartsStudent3 = new HogwartsStudent("Hermione", "Granger");

        Collections.addAll(hogwartsStudents, hogwartsStudent1, hogwartsStudent2, hogwartsStudent3);

        hogwartsStudent1.setHouse("Gryffindor");
        try{
            hogwartsStudent2.setHouse("Dalvænget");
        } catch(RuntimeException re){
            System.out.println("Husnavnet er ugyldigt! Skal være Gryffindor, Hufflepuff, Racvenclaw eller Slytherin");
        }
        hogwartsStudent3.setHouse("Ravenclaw");

        for (HogwartsStudent hogwartsStudent : hogwartsStudents){
            System.out.println(hogwartsStudent.getFirstName() + " " + hogwartsStudent.getLastName() + ", Hus: " + hogwartsStudent.getHouse());
        }

        System.out.println();

        Collections.sort(hogwartsStudents, new lastNameComparator());

        for (HogwartsStudent hogwartsStudent : hogwartsStudents){
            System.out.println(hogwartsStudent.getFirstName() + " " + hogwartsStudent.getLastName() + ", Hus: " + hogwartsStudent.getHouse());
        }

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getHouse() {
        return house;
    }


}
