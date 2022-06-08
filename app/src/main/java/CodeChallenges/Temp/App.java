package CodeChallenges.Temp;

import CodeChallenges.Challenge35_36_37_38.Graph;
import CodeChallenges.Challenge35_36_37_38.Node;

import java.util.*;

public class App {

    public static void main(String[] args) {

/*
        int[][] nodes = {
                            {0, 1, 0, 0, 1},
                            {1, 0, 1, 1, 0},
                            {0, 1, 0, 1, 0},
                            {0, 1, 1, 0, 1},
                            {1, 0, 0, 1, 0}
                                                  };
        System.out.println(nodes.length);
        adjacencyMatrix(nodes);
*/

        System.out.println("The two input string are equal -> " + isStringAnagrams("Software", "Swear often"));


    }

    public static boolean isStringAnagrams(String str1, String str2) {

        boolean isEqual = false;
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i)==str2.charAt(j) && str1.charAt(i)!=' ' && str2.charAt(i)!=' '){
                    isEqual = true;
                }else {
                    isEqual = false;
                }
            }

        }
        return isEqual;
    }

    public static boolean isNodesConnected(Graph graph, Node node, Node node1) {

        List<Node> neighbors = graph.getNeighbors(node);

        return neighbors.contains(node1);
    }

    public static void adjacencyMatrix(int[][] arr) {

        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(chars[i]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    System.out.print(" -> " + chars[j]);
                }
            }
            System.out.println();
        }
    }

    public static boolean isTheStringUnique(String str) {
        boolean isUnique = true;
        Hashtable<Integer, Character> stringChar = new Hashtable<>();

        for (int i = 0; i < str.length(); i++) {

            if (stringChar.contains(str.charAt(i)) && i > 0)
                isUnique = false;
            stringChar.put(i + 1, str.charAt(i));

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

    public static String generateRandomPassword(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }
}
