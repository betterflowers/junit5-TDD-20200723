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
    public void should_return_fizz_given_three_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("Fizz"));
    }

    @Test
    public void should_return_buzz_given_five_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("Buzz"));
    }

    @Test
    public void should_return_FizzBuzz_given_fifteen_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 15;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("FizzBuzz"));
    }

    @Test
    public void should_return_Whizz_given_seven_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 7;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("Whizz"));
    }

    @Test
    public void should_return_FizzWhizz_given_threeSeven_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 21;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_given_fiveSeven_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 35;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_threeFiveSeven_then_countOff(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 105;
        String infoString = fizzBuzz.say(input);
        assertThat(infoString, is("FizzBuzzWhizz"));
    }

}
