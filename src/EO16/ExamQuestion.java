package EO16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {
    private int number;
    private String grade;


    public void setGrade() {
        Random r = new Random();
        int gradeNumber = r.nextInt(1,7);

        switch(gradeNumber){
            case 1 -> this.grade = "A";
            case 2 -> this.grade = "B";
            case 3 -> this.grade = "C";
            case 4 -> this.grade = "D";
            case 5 -> this.grade = "E";
            case 6 -> this.grade = "F";
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new File("grades.txt"));

        ArrayList<ExamQuestion> examQuestions = new ArrayList<>();

        for (int i = 1; i <= 14; i++){
            ExamQuestion examQuestion = new ExamQuestion();
            examQuestion.setNumber(i);
            examQuestion.setGrade();
            examQuestions.add(examQuestion);
        }
        printStream.println(examQuestions);
        System.out.println(examQuestions);
    }

    @Override
    public String toString() {
        return number + ": " + grade;
    }
}
