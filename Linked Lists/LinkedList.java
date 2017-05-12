/*
 * Dylan Terrell
 * Lab 3
 */
package linked.list.lab.pkg3;

/**
 *
 * @author dyltee
 */
public class LinkedList {
    album head;
    album last;
    
    public LinkedList() {
        //creates linked list without values inputted
        head = null;
        last = null;
    }
    
    public LinkedList(String artist) {
        //creates linked list with artist inputted
        head = new album(artist);
        last = head;
    }
    
    public void addBack(String artist) {
        album newNode, current; 
        current = head;
        newNode = new album(artist);
        if(current == null) {
            //checks if there is anything in the linked list, if not sets the new node to the head and last value
            head = newNode;
            last = newNode;
        }
        else {
            //processes when there is already a node in the linked list and adds the new node to the end
            last.next = newNode;
            last = newNode; 
            }
        }
    
    public void addFront(String artist) {
        album newNode, current;
        current = head;
        newNode = new album(artist);
        if(current == null) {
            //checks if there is anything in the linked list, if not sets the new node to the head and last value
            head = newNode;
            last = newNode;
        }
        else {
            //processes when there is a node in the linked list and adds the new node to the front of the list
            newNode.next = current;
            head = newNode;
        }
    }
    
    public void deleteFirst() {
        //sets head to the second item in the linked list and calls garbage collector on the system
        album current = head;
        head = current.next;
        System.gc();
    }
    
    public album findObject(String target) {
        //traverses through the linked list and checks if the target is equal to the info of the current node
        album current = head;
        while(current != null) {
            if(current.artist == target) {
                System.out.println("We've found your artist!");
                return current;
            }
            current = current.next;
        }
        System.out.println("Artist not found.");
        return null;
    }
    
    public void displayInfo() {
        album current = head;
        while(current != null) {
            System.out.println("The name of the Artist is: " + current.artist);
            current = current.next;
        }
    }
        
        
}
