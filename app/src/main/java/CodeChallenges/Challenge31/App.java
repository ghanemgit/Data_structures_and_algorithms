package CodeChallenges.Challenge31;

import CodeChallenges.Challenge30.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App {

    public static void main(String[] args) {

        String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
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




