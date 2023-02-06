package EO11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article (String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public static void main(String[] args) {
        Article article = new Article("Øvelse 11", "1. Lav en klasse Article der har tre attributter: heading, body og\n" +
                "author. Lav test-kode der sætter alle tre attributter, og sørg for at \n" +
                "body er en lang tekst – f.eks. indholdet af denne øvelsesbeskrivelse! \n" +
                "2. Tilføj en metode getLongestWord, der returnerer det længste ord \n" +
                "(længste sekvens af bogstaver eller tegn uden mellemrum) fra body. \n" +
                "3. Tilføj en metode getWords, der returnerer en liste af alle ord fra \n" +
                "body, men hvor hvert ord kun forekommer en enkelt gang.", "Peter Lind");

        System.out.println(article.getLongestWord());
        System.out.println(article.getWords());
    }

    public String getLongestWord(){
        String[] splittedBody = body.split(" ");
        String longestWord = splittedBody[0];

        for (String word : splittedBody){
            if (longestWord.length() < word.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }

    public ArrayList<String> getWords(){
        String[] splittedBody = body.split(" ");
        ArrayList<String> eachWord = new ArrayList<>();

        for (String word : splittedBody){
            if (!eachWord.contains(word)){
                eachWord.add(word);
            }
        }

        return eachWord;
    }
}
