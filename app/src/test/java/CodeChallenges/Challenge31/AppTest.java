package CodeChallenges.Challenge31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AppTest {

    @Test
    @DisplayName("Hash Table repeated word Test")
    void hashTableRepeatedWordTest(){

        String str1 ="Once upon a time, there was a brave princess who...";
        String str2 ="It was the best of times, it was the worst of times, " +
                "it was the age of wisdom, it was the age of foolishness," +
                " it was the epoch of belief, it was the epoch of incredulity," +
                " it was the season of Light, it was the season of Darkness, " +
                "it was the spring of hope, it was the winter of despair, " +
                "we had everything before us, we had nothing before us," +
                " we were all going direct to Heaven, we were all going direct the other way – in short, " +
                "the period was so far like the present period, that some of its noisiest authorities insisted on its being received," +
                " for good or for evil, in the superlative degree of comparison only...";
        String str3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        String actual1 =App.repeatedWord(str1);
        String actual2 =App.repeatedWord(str2);
        String actual3 =App.repeatedWord(str3);

        assertEquals("a",actual1);
        assertEquals("it",actual2);
        assertEquals("summer",actual3);

    }


}
