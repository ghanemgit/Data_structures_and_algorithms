package CodeChallenges.Challenge33;

import java.util.*;

public class App {

    public static void main(String[] args) {
        HashMap<String,String> left = new HashMap<>();
        HashMap<String,String> right = new HashMap<>();

        left.put("diligent","employed");
        left.put("fond","enamored");
        left.put("guide","usher");
        left.put("outfit","garb");
        left.put("wrath","anger");

        right.put("diligent","idle");
        right.put("fond","averse");
        right.put("guide","follow");
        right.put("flow","jam");
        right.put("wrath","delight");

        System.out.println(leftJoin(left,right));

    }



    public static List<String> leftJoin(HashMap<String,String> left, HashMap<String,String> right){

        List<String> results = new ArrayList<>();
        for(String k : left.keySet()){
            if(left.containsKey(k)){
                results.add("\n"+k +  " => " + left.get(k)+ ", " + right.get(k));
            } else{
                results.add(k + " => " + left.get(k) + ", " + null);
            }
        }
        results.add("\n");

        return results;
    }
}
