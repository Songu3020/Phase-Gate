public class LinearSearch {
public static int countEvens(int[]numbers){
    int count = 0;
    for(int num:numbers){
        if(num % 2 == 0){
        count++;
    }
  }
    return count;
    }


public static int linearSearch(int[] numbers, int target){
    for(int count = 0; count < numbers.length; count++){
        if (numbers[count] == target){
            return count;
        }
}

    return -1;


    }

public static int[] Square(int number){
    if(number <= 0){
        return new int[0];
    }
        
    int[] squares = new int[number];

    for(int count = 1; count <= number; count++){ 
        squares[count -1] = count * count;       
        }
    return squares;
            }


public static boolean arrayEquals(int[] a, int[] b){
    int length = a.length;
    
    if(length != b.length){
        return false;
    }

    for(int count = 0; count < length; count++){
        if(a[count] != b[count]){
                return false;
       }
   }

    return true;


    }







}

