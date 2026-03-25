import java.util.Random;
    
    public class GuessingApp {

//        public static int generateRandomNumber(){ 
//
//             Random collect = new Random();
//                
//                number = collectRandom.nextInt(1,101);
//
//    return number;    
//    }

    public static boolean checkInteger(String input) {
    try {
        Integer.parseInt(input); 
        return true;
    } catch (NumberFormatException e) {
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



    }
