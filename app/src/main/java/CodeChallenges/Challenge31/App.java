package CodeChallenges.Challenge31;

import CodeChallenges.Challenge30.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App {

    public static void main(String[] args) {

        String string = "It was the best of times, it was the worst of times," +
                " it was the age of wisdom, it was the age of foolishness, it was " +
                "the epoch of belief, it was the epoch of incredulity, it was the " +
                "season of Light, it was the season of Darkness, it was the spring " +
                "of hope, it was the winter of despair, we had everything before us," +
                " we had nothing before us, we were all going direct to Heaven, " +
                "we were all going direct the other way – in short, the period was so" +
                " far like the present period, that some of its noisiest authorities" +
                " insisted on its being received, for good or for evil, in the superlative" +
                " degree of comparison only...";
        System.out.println("The repeated word is => "+repeatedWord(string));

    }


    public static String repeatedWord(String str) {

        //This split to mark the space between the words and to help us to dividing it
        String[] wordsArr = str.toLowerCase().split(" ");

        // hashTable for storing word and its count
        HashTable<String, Integer> wordsHashTable = new HashTable<>();

        // store all the words of string and the count of word in hashTable
        for (String string : wordsArr) {
            if (wordsHashTable.contain(string))
                wordsHashTable.add(string, wordsHashTable.get(string) + 1);
            else
                wordsHashTable.add(string, 1);
        }

         //traverse again from first word of string str to check if count of word is greater than 1
         //either take a new stream or store the words in vector of strings in previous loop
        for (String string : wordsArr) {
            int count = wordsHashTable.get(string);
            if (count > 1) {
                return string;
            }
        }
        return "No Repetition";
    }
}




