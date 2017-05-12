
package lab.pkg1;

/**
 *
 * @author DylTee
 */
public class ArraySumWithoutSmallest {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayZ = {505, 1000, 1500, 278, 12, 203, 476, 500};
        sumWithoutSmallest(arrayZ);
        
    }
    
    public static void sumWithoutSmallest(int[] array) {
        int sum = 0;
        int smallestNum = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallestNum) {
                sum += smallestNum;
                smallestNum = array[i];
            }
            else if (array[i] == smallestNum) {
                //do nothing
            }
            else {
                sum += array[i];
            }
            
        }
        
        System.out.println("The smallest number is: " + smallestNum);
        System.out.println("The sum of the array without the smallest number is: " + sum);
        System.out.println("The difference of the sum and the smallest number is: " + (sum - smallestNum));
        System.out.println("The sum of all the values of the array including the smallest number is: " + (sum + smallestNum));
    }
    
}
