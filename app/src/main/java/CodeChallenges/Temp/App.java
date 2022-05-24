package CodeChallenges.Temp;

import java.util.HashSet;
import java.util.Hashtable;

public class App {

    public static void main(String[] args) {

        System.out.println(repeatedWord("summer dog This is summer dog, I know dog summer."));

    }

    public static boolean isTheStringUnique(String str){
    boolean isUnique = true;
        Hashtable<Integer,Character> stringChar = new Hashtable<>();

        for (int i = 0; i < str.length(); i++) {

            if (stringChar.contains(str.charAt(i)) && i>0)
                isUnique = false;
            stringChar.put(i+1,str.charAt(i));

        }
        return isUnique;
    }

    public static String repeatedWord(String inputWord) {

        String[] wordArray = inputWord.split("\\s+");
        HashSet hashSet = new HashSet();

        for (int i = 0; i < wordArray.length; i++) {
            if (hashSet.contains(wordArray[i])) {
                return wordArray[i];
            } else {
                hashSet.add(wordArray[i].toLowerCase());
            }
        }
        return null;
    }
}
