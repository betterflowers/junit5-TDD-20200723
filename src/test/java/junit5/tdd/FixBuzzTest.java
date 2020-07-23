package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FixBuzzTest {
    @Test
    public void should_return_one_given_one_then_countOff(){
        FixBuzz fixBuzz = new FixBuzz();
        int input = 1;
        String infoString = fixBuzz.say(input);
        assertThat(infoString, is("1"));
    }
}
