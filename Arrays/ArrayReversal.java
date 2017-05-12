package lab.pkg1;
import java.util.Arrays;
/**
 *
 * @author DylTee
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("The original array is: ");
        int[] arrayO = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        
        for(int i = 0; i < arrayO.length; i++) {
            System.out.print(arrayO[i] + " ");
        }
        
        System.out.println("");
        storeReverse(arrayO);
        
    }
    
    public static void storeReverse(int[] array) {
        int arrayLength = array.length-1;
        int[] b = Arrays.copyOf(array, array.length);
        
        do {
            
            System.out.print("The reversed array is: ");
        for(int i = 0; i < array.length; i++){
            array[i] = b[arrayLength];
            System.out.print(array[i] + " ");
            arrayLength--;
        }
       }
        while(arrayLength >=0);
        
    }
    
}