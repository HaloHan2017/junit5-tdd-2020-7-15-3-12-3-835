package junit5.tdd;

public class FizzBuzzWhizz {
    public String playFizzBuzzWhizz(int number) {
        String result = "";
        if(number % 3 == 0){
            result += "fizz";
        }
        if(number % 5 == 0){
            result += "buzz";
        }
        if(number % 7 == 0){
            result += "whizz";
        }
        if ("".equals(result)){
            result = String.valueOf(number);
        }
        return result;
    }
}
