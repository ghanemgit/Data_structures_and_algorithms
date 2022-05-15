package CodeChallenges.Challenge31;

import CodeChallenges.Challenge30.HashTable;
import java.util.Arrays;



public class App {

    public static void main(String[] args) {

        String string = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        System.out.println("The repeated word is => "+repeatedWord(string));

    }


    public static String repeatedWord(String str) {

        //This split to mark the space between the words and to help us to dividing it
        String[] wordsArr = str.toLowerCase().replaceAll("[^a-zA-Z’]+"," ").split(" ");
        System.out.println(Arrays.toString(wordsArr));
        // hashTable for storing word and its count
        HashTable<String, Integer> wordsHashTable = new HashTable<>();

        // store all the words of string and the count of word in hashTable
        for (int i=0; i<wordsArr.length; i++) {

            //check if the word already exist in hash table
            if (wordsHashTable.contain(wordsArr[i])){

                //if exist add the same word to tha hash table and increase the value by one
                wordsHashTable.add(wordsArr[i], wordsHashTable.get(wordsArr[i]) + 1);

                //at the same time assign the value of that word in count variable
                int count = wordsHashTable.get(wordsArr[i]);

                //if the count more than one that mean the word is repeated so return the that's key
                if (count > 1) {
                    return wordsArr[i];
                }
            }
            //else the word does not exist add it normally to the table
            else
                wordsHashTable.add(wordsArr[i], 1);
        }
        //if there is no repeated words return this string
        return "No Repetition";
    }
}




