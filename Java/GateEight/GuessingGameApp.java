import java.util.Random;

public class GuessingGameApp {

public static int getRandomNumber(int number){

    Random collect = new Random();
    number = collect.nextInt(1,100);
    return number;
    }
}

//public boolean CheckIsNumber(){
//    try{
//    Interger.parseInt(input)
//    return true;
//    else
//    return false;
//    }            
//        
//}  
//
//    
//public boolean checkNumberIsInRange(number){
//    
//    if(number >= 1 && number <= 100){
//        return true;
//        else
//        
//    return false;
//    }        
//}
//
//public boolean checkGuess(guess, correctNumber){
//    if(number == correctNumber){
//        return "correct";
//        }
//    else if( guess < correctNumber){
//        return "too low";
//    else
//        return "too high";
//
//        }
//
//    }
//}
//public boolean getGuessedNumberCorrectly(attempts, guessedCorrectly){
//    if(guessedCorrectly is false){
//        return "Better luck next time";
//        }
//
//    if(attempts ==1){
//    return "Legendary";
//    }
//    else if(attempts ==2){
//    return "Excellent";
//    }
//    else if(if attempts ==3 || attempts ==4){
//        return "Good";        
//    }
//    else
//    
//    return "block head";
//
//    public static int displaySummary(secretNumber, attempts, rating){
//        print "Game Over";
//        print "Correct number was " + secretNumber;
//        print "Attempts used " + attempts;
//        print "Your rating " + rating;
//
//
//
//
//
//        }
//
//
//
//}
//














