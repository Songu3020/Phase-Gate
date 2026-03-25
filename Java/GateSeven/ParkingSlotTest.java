import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParkingSlotTest{

    @Test
    public void testAllSlotsEmptyOnCreation(){      
            
        int[] actual = ParkingSlot.createParkingLot(20);

        int expected = 20;
 
        assertEquals(expected, actual);
        }

    @Test
    public void testCarParkAutomatically(){

        int[]parkingSlots = new int[20];

        String actual = ParkingSlot.parkCarAutomatically(parkingSlots);

        String expected = "Car parked at slot 1";

        assertEquals(expected, actual);
        }

    
}
 
