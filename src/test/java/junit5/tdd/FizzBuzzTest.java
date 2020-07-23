package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_one_given_one_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 1;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("1"));
    }

    @Test
    public void should_return_fizz_given_one_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("Fizz"));
    }


}
