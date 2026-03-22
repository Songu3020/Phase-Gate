import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LinearSearchTest {
    
    @Test
    public void testSingleEvenNumber(){
        int[] numbers = {2};
        int actual = LinearSearch.countEvens(numbers);
        int expected = 1;
        assertEquals(expected,actual);    
    }

    @Test
        public void testAllEvenNumbers(){
        int[] numbers = {2,4,6};
        int actual = LinearSearch.countEvens(numbers); 
        int expected = 3;
    
        assertEquals(expected, actual);
    }
    
    @Test
        public void testForLastElement() {
        int[] numbers = {10,20,30};
        int target = 20;
        int actual = LinearSearch.linearSearch(numbers, target);
        int expected = 1;
        assertEquals(expected, actual);    
    }
    @Test
        public void testWhenTheTargetIsSomeWhereNotAtTheEnds() {
        int[] numbers = {10,20,30};
        int target = 20;
        int actual = LinearSearch.linearSearch(numbers, target);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
        public void testSquaredOfFive() {
        int[] expected = {1,4,9,16,25};
        int[] actual = LinearSearch.Square(5);
        assertArrayEquals(expected, actual);
    }
    @Test
        public void testSquareWithOne() {
        int[] actual = LinearSearch.Square(1);
        int[] expected = {1};
        
        assertArrayEquals(expected, actual);
    }

    @Test
        public void testSquareWithZero(){
        int[] actual = LinearSearch.Square(0);
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    @Test
        public void testArraysDifferentLength(){
        int[] a = {1,2,3,};
        int[] b = {1,2};
        boolean actual = LinearSearch.arrayEquals(a,b);
        assertFalse(actual);    
   }
    
        

        







}
