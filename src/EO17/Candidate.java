package EO17;

public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
        return name + " " + party + " " + numberOfVotes + " stemmer";
    }
}
