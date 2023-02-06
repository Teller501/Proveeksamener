package Proveeksamen4;

import java.util.Arrays;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private char shiftValue;

    public CodeMessage(String plainText){
        this.plainText = plainText;
        ciphers = new int[plainText.length()];
    }

    public static void main(String[] args) {
        CodeMessage codeMessage = new CodeMessage("Hej mit navn er Anders Teller");
        System.out.println(codeMessage.plainText);
        codeMessage.convertText();
        System.out.println(Arrays.toString(codeMessage.ciphers));
    }

    public int convertToNumber(char shiftValue){
        int convertedNumber = 0;
        switch(shiftValue){
            case 'A' -> convertedNumber = 1;
            case 'B' -> convertedNumber = 2;
            case 'C' -> convertedNumber = 3;
            case 'D' -> convertedNumber = 4;
            case 'E' -> convertedNumber = 5;
            case 'F' -> convertedNumber = 6;
            case 'G' -> convertedNumber = 7;
            case 'H' -> convertedNumber = 8;
            case 'I' -> convertedNumber = 9;
            case 'J' -> convertedNumber = 10;
            case 'K' -> convertedNumber = 11;
            case 'L' -> convertedNumber = 12;
            case 'M' -> convertedNumber = 13;
            case 'N' -> convertedNumber = 14;
            case 'O' -> convertedNumber = 15;
            case 'P' -> convertedNumber = 16;
            case 'Q' -> convertedNumber = 17;
            case 'R' -> convertedNumber = 18;
            case 'S' -> convertedNumber = 19;
            case 'T' -> convertedNumber = 20;
            case 'U' -> convertedNumber = 21;
            case 'V' -> convertedNumber = 22;
            case 'W' -> convertedNumber = 23;
            case 'X' -> convertedNumber = 24;
            case 'Y' -> convertedNumber = 25;
            case 'z' -> convertedNumber = 26;
        }
        return convertedNumber;
    }

    public void convertText(){
        for (int i = 0; i < plainText.length(); i++){
            char plainTextChar = plainText.toUpperCase().charAt(i);
            int convertedChar = convertToNumber(plainTextChar);
            ciphers[i] = convertedChar;
        }
    }
}
