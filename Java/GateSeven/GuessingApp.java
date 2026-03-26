import java.util.Scanner;
import java.util.Random;
    
    public class GuessingApp {

        public static int generateRandomNumber(int number){ 

             Random collect = new Random();
                
                number = collectRandom.nextInt(1,101);

    return number;    
    }
    
}

    
public static boolean CheckIsNumber(){
    try{
    Integer.parseInt(input)
    return true;
    }catch(NumberFormatException){
    return false;
    }            
        
}  
    public static boolean NumberIsInRange(int number) {

        if (number >= 1 && number <= 100) {

            return true;

        } else {

            return false;
        }
    }

    
    public static String checkGuess(int guess, int correctNumber) {

        if (guess == correctNumber) {

            return "CORRECT";

        } else if (guess < correctNumber) {

            return "LOW";

        } else {

            return "HIGH";
        }


}
