package Tests;

import Algorithms.ReversedSentence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversedSentenceTest {


    @Test
    public void reverseSentenceTest() {
        ReversedSentence reverse = new ReversedSentence();

        String sentence = "I love you";
        String expectedResult = "you love I";

        String actualResult = reverse.reverse(sentence);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
