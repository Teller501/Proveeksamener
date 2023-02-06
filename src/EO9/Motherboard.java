package EO9;

public class Motherboard {
    private SataDrive[] sataDrives = new SataDrive[4];

    public void printSataDrives(){
        for (SataDrive sataDrive : sataDrives){
            System.out.println(sataDrive);
        }
    }

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();

        SataDrive sataDrive1 = new SataDrive();
        SataDrive sataDrive2 = new SataDrive();
        SataDrive sataDrive3 = new SataDrive();
        SataDrive sataDrive4 = new SataDrive();

        motherboard.printSataDrives();

        motherboard.setSataDrives(sataDrive1);
        motherboard.setSataDrives(sataDrive2);
        motherboard.setSataDrives(sataDrive3);
        motherboard.setSataDrives(sataDrive4);

        motherboard.printSataDrives();
    }

    public void setSataDrives(SataDrive sataDrive) {
        for (int i = 0; i < sataDrives.length; i++){
            if (sataDrives[i] == null){
                sataDrives[i] = sataDrive;
            }
        }

    }
}
