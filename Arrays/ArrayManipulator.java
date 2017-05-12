package lab.pkg1;

/**
 *
 * @author DylTee
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initializes an integer array with 10 elements
        int[] arrayQ = new int[10];
        
        //For loop to store each index of the array with a random number
        for(int i = 0; i < arrayQ.length; i++) {
            //Creates a variable randomInt that stores a random integer between 0-60
            int randomInt = (int)(Math.random() * 60);
            arrayQ[i] = randomInt; 
        }
        
        //Print every element at an even index
        printEvenIndex(arrayQ);
        
        System.out.println("");
        
        //Print every even element
        printEvenElement(arrayQ);
        
        System.out.println("");
        
        //Print every element in reverse order
        printReverse(arrayQ);
        
        System.out.println("");
        
        //Print first and last element in array
        printFirst_Last(arrayQ);
        
    }
    
    //Method that prints every element at an even index
    public static void printEvenIndex(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                System.out.println("The element at even index " + i + " is " + array[i] + ".");
            }
        }
    }
    
    //Method that prints every even element
    public static void printEvenElement(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println("The element: " + array[i] + " at index " + i + " is even.");
            }
        }
    }
    
    //Method that prints all elements in reverse order
    public static void printReverse(int[] array) {
        
        System.out.print("The original array is: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        
        int arrayLength = array.length-1;
        System.out.println("");
        System.out.print("The array in reverse is: ");
        do {
            System.out.print(array[arrayLength] + ", ");
            arrayLength--;
        }
        while(arrayLength >= 0);
    }
    
    //Method that prints first and last element
    public static void printFirst_Last(int[] array) {
        System.out.println("\nThe first element is: " + array[0] + "\nThe last element is: " + array[array.length-1]);
    }
    
}