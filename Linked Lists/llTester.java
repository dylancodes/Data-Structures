/*
 * Dylan Terrell
 * Lab 3
 */
package linked.list.lab.pkg3;

/**
 *
 * @author dyltee
 */
public class llTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList list1 = new LinkedList(); //creates new linked list called list1
        
        list1.addBack("J. Cole"); //adds node to the back of the list
        list1.addBack("K. Dot"); //adds node to the back of the list
        list1.addFront("Drake"); //adds node to the front of the list
        
        list1.displayInfo(); //displays the artists in nodes of the linked list
        
        System.out.println(); //inserts space in console
        
        list1.deleteFirst(); //deletes first node in the linked list
        list1.displayInfo(); //displays the artists in nodes of the linked list
        
        System.out.println(); //inserts space in console
        
        list1.findObject("Drake"); //searches the linked list for Drake
        
        
        
    }
    
}
