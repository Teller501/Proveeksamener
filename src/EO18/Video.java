package EO18;

public class Video extends Media{
    private String aspectRatio;

    public Video(String name, double duration, String aspectRation){
        super(name,duration);
        this.aspectRatio = aspectRation;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }
}
