import java.util.Arrays;
public class PhaseGate4 {

    public boolean isPrime(int number){
        if(number <= 1) return false;
           
        for(int count = 2; count < number; count++){
            if(number % count == 0) return false;
            }            
            return true;    
        }
        
    public int[]getSortedPrimes(int[]numbers){

        int[] temp = new int[numbers.length];
        int index = 0;        

        for(int num : numbers){
            if(isPrime(num)){
                temp[index++] = num;
                
                }
            }
            
    int[] primes = Arrays.copyOf(temp, index);
    Arrays.sort(primes);
    return primes;
    } 
}
