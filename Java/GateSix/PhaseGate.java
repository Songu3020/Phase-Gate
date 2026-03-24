    import java.util.Random;
    import java.util.Scanner;
    public class PhaseGate {
        public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        Random collect = new Random();
        
        
        int counter = 0;
        int correctAnswer = 0;
        int answer  = 0;   

        int number1 = 0;
        for(int count = 1; count <= 10; count++){
        counter++; 
        int firstNumber = collect.nextInt(50);
        int secondNumber = collect.nextInt(30);

        System.out.print(firstNumber +" - "+ secondNumber +" = " );

        number1 = input.nextInt();
 
        if(firstNumber > secondNumber){
        
        answer = firstNumber - secondNumber;
        }    
        else if(secondNumber > firstNumber){
            
              answer = secondNumber - firstNumber;
            }

            if(number1 != answer){
             System.out.print(firstNumber +" - "+ secondNumber +" = " );
        number1 = input.nextInt();
            System.out.println("You have one more attempt left: "); 
         
         
        }else{
            correctAnswer++;  
        }             

        }
        System.out.println("You  got "+ correctAnswer+"/"+counter);

        }
    }
