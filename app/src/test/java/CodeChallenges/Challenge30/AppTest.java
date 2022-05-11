package CodeChallenges.Challenge30;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    @DisplayName("Hash Table Test")
    void hashTableTest(){

        HashTable<String, Integer> students = new HashTable<>();
        students.add("Mohammad", 99);
        students.add("Ahmad", 98);
        students.add("Zaid", 97);
        students.add("Hamza", 96);


        assertEquals(4,students.getSize());
        assertEquals(99,students.get("Mohammad"));
        assertEquals(97,students.remove("Zaid"));
        assertEquals(3,students.getSize());
        assertTrue(students.contain("Mohammad"));
        assertFalse(students.contain("Fares"));
        assertEquals("[Mohammad, Ahmad, Hamza]",students.keys().toString());


    }


}
