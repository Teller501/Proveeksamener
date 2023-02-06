package EO18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class Media {
    private String name;
    private double duration;

    public Media(String name, double duration){
        this.name = name;
        this.duration = duration;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Media> media = new ArrayList<>();

        Audio audio = new Audio("Nights.mp3", 4.23, "-8.4dB");
        Audio audio2 = new Audio("Revenge.mp3", 3.12, "-8.4dB");
        Audio audio3 = new Audio("Off the Grid.mp3", 2.48, "-8.4dB");

        Video video = new Video("Kasper går amok.mp4", 0.43, "16:9");
        Video video2 = new Video("Interstellar.mp4", 102.98, "16:9");
        Video video3 = new Video("Kasper går amok.mp4", 0.12, "4:3");

        Collections.addAll(media, audio,audio2,audio3,video,video2,video3);

        PrintStream printStream = new PrintStream(new File("mediainfo.txt"));

        for(Media medias : media){
            if (medias instanceof Audio){
                System.out.println("Navn: " + medias.name + " Længde: " + medias.duration + " Lydstyrke: " + ((Audio) medias).getLoudness());
                printStream.println("Navn: " + medias.name + " Længde: " + medias.duration + " Lydstyrke: " + ((Audio) medias).getLoudness());
            } else if(medias instanceof Video){
                System.out.println("Navn: " + medias.name + " Længde: " + medias.duration + " Aspect Ratio: " + ((Video) medias).getAspectRatio());
                printStream.println("Navn: " + medias.name + " Længde: " + medias.duration + " Aspect Ratio: " + ((Video) medias).getAspectRatio());
            }
        }
    }
}
