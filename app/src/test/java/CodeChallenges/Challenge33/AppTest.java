package CodeChallenges.Challenge33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static CodeChallenges.Challenge33.App.leftJoin;

public class AppTest {

    @Test
    @DisplayName("Hash Table left Join Test")
    void hashTableLeftJoinTest(){

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

       leftJoin(left,right);

       //5 words with its Synonyms and Antonyms
       assertEquals(6, leftJoin(left,right).size());
       //6 because I  added new line as element in the list to improve the style of output 5+1

    }



}
