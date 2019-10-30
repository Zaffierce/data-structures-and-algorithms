package code401challenges.hashTable;

import java.util.Arrays;

import java.util.Scanner;

public class RepeatedWord {

    public String RepeatedWord(String str) {
        Scanner sc = new Scanner(str);
        HashTable hashTable = new HashTable();

//        https://www.daniweb.com/programming/software-development/threads/331201/java-split-text-by-spaces-and-punctuation
//        String regEx = "([.,!?:;'\\\"-]|\\\\s)+";

        while(sc.hasNext()) {
            String string = sc.next().toLowerCase(); //.split(regEx);
            if (hashTable.contains(string)) {
                return string;
            } else {
                hashTable.add(string, 0);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        RepeatedWord repeatedWord = new RepeatedWord();
        System.out.println(repeatedWord.RepeatedWord("This is a beautiful string, a string that is nice and simple."));
    }
}
