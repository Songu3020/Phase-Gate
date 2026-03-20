import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;

public class PhaseGate4Test {

    @Test
    public void testLenth(){
   
    phaseGate4 = new PhaseGate4();
    int [] numbers = new [] {5,9,3,2};

    int actual = phase4.LengthNumber(numbers);
    int expected = 21;
    
    assertEquals(expected,actual);

    }


}
