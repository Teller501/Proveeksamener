package EO2;

import java.time.LocalDate;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår){
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel){
        this.filmtitel = filmtitel;
        this.udgivelsesår = LocalDate.now().getYear();
    }

    public static void main(String[] args) {
        Film film1 = new Film("Interstellar", 2016);
        Film film2 = new Film("Batman Dark Knight");

        System.out.println(film1);
        System.out.println(film2);
    }

    @Override
    public String toString() {
        return filmtitel + " " + udgivelsesår;
    }
}
