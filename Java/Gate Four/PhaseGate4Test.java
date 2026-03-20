import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PhaseGate4Test {

    @Test
    public void testPrimes(){
   
    PhaseGate4  phaseGate4 = new PhaseGate4();
    int[] numbers = {5,9,3,6,2};
    int[] expected = {2,3,5};
    int[] actual = phaseGate4.getSortedPrimes(numbers);    
    assertArrayEquals(expected,actual);
    }

    @Test
public void testSinglePrime(){
    PhaseGate4 phase = new PhaseGate4();
    int[] numbers = {1,4,7,10};
    int[] expected = {7};
    int[] actual = phase.getSortedPrimes(numbers);
    assertArrayEquals(expected, actual);
    }

    @Test
public void testNegativeNumbers(){
    phaseGate4 phase = new PhaseGate4();
    int[] numbers = {-5,-3,2};
    int[] expected = {};
    int[] actual = phase.getSortedprimes(numbers);
    assertArrayEquals(expected, actual);
    }

    @Test
public void testNoPrimes(){
    PhaseGate4 phase = new PhaseGate4();
    int[] numbers = {4,6,8,10};
    int[] expected = {};
    int actual = phase.getSortedPrimes(numbers);
    assertArrayEquals(expected, actual);
    }


    }




