package EO17;

import java.util.ArrayList;
import java.util.Collections;

public class Election {
    ArrayList<Candidate> candidates;

    public Election(){
        this.candidates = new ArrayList<>();
    }

    public int getTotalVotes(){
        int totalVotes = 0;
        for (Candidate candidate : candidates){
            totalVotes += candidate.getNumberOfVotes();
        }

        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();

        for (Candidate candidate : candidates){
            if (party.equals(candidate.getParty())){
                candidatesFromParty.add(candidate);
            }
        }

        return candidatesFromParty;
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate("Anders Teller" , "DF", 100);
        Candidate candidate2 = new Candidate("Nicolai Andersson" , "Nye Borgerlige", 388);
        Candidate candidate3 = new Candidate("Omar Kayed" , "De frie grønne", 1);
        Candidate candidate4 = new Candidate("Simon Bang" , "LA", 875);

        Election election = new Election();

        Collections.addAll(election.candidates, candidate, candidate2, candidate3, candidate4);

        System.out.println(election.getTotalVotes());
        System.out.println(election.getCandidatesFromParty("Nye Borgerlige"));
    }
}
