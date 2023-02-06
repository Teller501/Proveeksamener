package EO13;

import java.util.Random;

public class Julegave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public Julegave(){
        Random r = new Random();
        this.isSoft = r.nextBoolean();
        this.isRectangular = r.nextBoolean();
        this.doesRattle = r.nextBoolean();
    }

    public static void main(String[] args) {
        Julegave julegave1 = new Julegave();

        System.out.println("Rasler: " + julegave1.doesRattle);
        System.out.println("Rektangulær: " + julegave1.isRectangular);
        System.out.println("Blød: " + julegave1.isSoft);

        System.out.println("Lego?: " + julegave1.couldBeLego());
    }

    public boolean couldBeLego(){
        return !isSoft && isRectangular && doesRattle;
    }
}
