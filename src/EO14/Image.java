package EO14;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height){
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Image image = new Image("Billede.png", 600, 400);

        System.out.println("Kendt filtype: " + image.isKnownFileType());
        System.out.println("Er portræt: " + image.isPortrait());
        System.out.println("Er landskab: " + image.isLandscape());
    }

    public boolean isKnownFileType(){
        return fileName.endsWith(".gif") || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")
                || fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bmp");
    }


    public boolean isPortrait(){
        return height > width;
    }

    public boolean isLandscape(){
        return width > height;
    }
}
