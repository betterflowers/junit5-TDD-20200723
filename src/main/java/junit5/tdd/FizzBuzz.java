package junit5.tdd;

public class FizzBuzz {

    public String say(int input) {
        if(input%3==0){
            return "Fizz";
        }else{
            return String.valueOf(input);
        }

    }
}