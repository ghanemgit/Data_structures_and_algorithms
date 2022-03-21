package CodeChallenges.Challenge11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    PseudoQueue pseudoQueue;

    @BeforeEach
    void setUp(){
        pseudoQueue = new PseudoQueue();
    }

    @Test
    @DisplayName("Challenge 11 Test")
    void PseudoQueueTest(){

        List<String> expected = new ArrayList<>();
        List<String> actual = new ArrayList<>();


        expected.add("The extract form the queue is => 1");


        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);


        actual.add("The extract form the queue is => " + pseudoQueue.dequeue());

        assertLinesMatch(expected,actual);



    }
}
