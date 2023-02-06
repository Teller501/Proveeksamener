package EO6;

public class Bil {
    private Trailer trailer;
    private int weight;

    public Bil(int weight){
        this.weight = weight;
    }

    public int getTotalWeight(){
        if (trailer != null){
            return weight + trailer.getWeight();
        }else{
            return weight;
        }
    }

    public void setTrailer(Trailer trailer) {
        if(getTotalWeight() + trailer.getWeight() <= 3500){
            this.trailer = trailer;
        }
    }

    public static void main(String[] args) {
        Bil bil = new Bil(2500);
        Trailer trailer = new Trailer(1000);

        bil.setTrailer(trailer);

        System.out.println(bil.trailer);
    }
}
