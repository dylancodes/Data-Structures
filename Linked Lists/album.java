/*
 * Dylan Terrell
 * Lab 3
 */
package linked.list.lab.pkg3;

/**
 *
 * @author dyltee
 */
public class album {
    public String artist;
    public album next;
    
    public album() {
        artist = "";
        next = null;
    }
    
    public album(String artist) {
        this.artist = artist;
        next = null;
    }
}
