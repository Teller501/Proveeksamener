package EO18;

public class Audio extends Media{
    private String loudness;

    public Audio(String name, double duration, String loudness){
        super(name,duration);
        this.loudness = loudness;
    }

    public String getLoudness() {
        return loudness;
    }
}
