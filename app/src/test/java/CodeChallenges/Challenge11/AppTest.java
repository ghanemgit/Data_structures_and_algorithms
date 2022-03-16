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

        expected.add("Your stack is => { 1 } => null");
        expected.add("Your stack is => { 2 } => { 1 } => null");
        expected.add("Your stack is => { 3 } => { 2 } => { 1 } => null");
        expected.add("The extract form the queue is => 3");




        actual.add(pseudoQueue.enqueue(1));
        actual.add(pseudoQueue.enqueue(2));
        actual.add(pseudoQueue.enqueue(3));
        actual.add("The extract form the queue is => " + pseudoQueue.dequeue());

        assertLinesMatch(expected,actual);



    }
}
