package lab.pkg1;
import java.util.ArrayList;

/**
 *
 * @author DylTee
 */
public class SJUEmployeeArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating user-defined class objects
        SJUEmployee emp1 = new SJUEmployee("X02332221", 29, "Joe", "Smith", 340999);
        SJUEmployee emp2 = new SJUEmployee("X05544221", 24, "Jessica", "Thompson", 1200200);
        SJUEmployee emp3 = new SJUEmployee("X08736282", 33, "James", "Dawson", 213133);
        SJUEmployee emp4 = new SJUEmployee("X43736282", 53, "Darien", "Taylor", 6007423);
        SJUEmployee emp5 = new SJUEmployee("X71214432", 63, "Eric", "Salafia", 829332);
        SJUEmployee emp6 = new SJUEmployee("X0000116", 30, "Dyl", "Tee", 200000);
        
        //Create array list
        ArrayList <SJUEmployee> list = new ArrayList <SJUEmployee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        
        //Print Variables ** toString override added in SJUEmployee class**
        System.out.println(list);
        
        System.out.println("");
        
        //method call
        averageSalary(list);
        
        //method call
        displayLowest(list);
        
        //method call
        displayHighest(list);
    }
    
    public static void averageSalary(ArrayList <SJUEmployee> list) {
        
       double salaryTotal = 0;
       for(int i = 0; i < list.size(); i++) {
           salaryTotal += list.get(i).salary;
       }
       
       double avg = salaryTotal / list.size();
       System.out.println("The salary average is: " + avg); 
        
    }
    
    //Method that stores the lowest salary to a variable and stores the number of the employee with the smallest salary to a variable
    public static void displayLowest(ArrayList <SJUEmployee> list) {
       int employeeNumber = 0;
       double smallestSalary = list.get(0).salary;
       
       for(int i = 0; i < list.size(); i++) {
           if(list.get(i).salary < smallestSalary) {
               smallestSalary = list.get(i).salary;
               employeeNumber = i;
           }
       }
       System.out.println("\n\nThe Employee with the lowest Salary is: " + list.get(employeeNumber));
    }
    
    public static void displayHighest(ArrayList <SJUEmployee> list) {
       int employeeNumber = 0;
       double highestSalary = list.get(0).salary;
       
       for(int i = 0; i < list.size(); i++) {
           if(list.get(i).salary > highestSalary) {
               highestSalary = list.get(i).salary;
               employeeNumber = i;
           }
       }    
       System.out.println("\n\nThe Employee with the highest Salary is: " + list.get(employeeNumber));
    }   
    
}

