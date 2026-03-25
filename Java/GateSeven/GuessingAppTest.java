import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

    public class GuessingAppTest{
    
    @Test
        public void TestThatGeneratedNumberIsRandom(){
        
        int actual = GuessingApp.RandomNumber();
        
        int expected = 36,40,66,
        assertEquals(expected,actual);    
        }
        
    
    



    

    











}
