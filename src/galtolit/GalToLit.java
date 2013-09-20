/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit;

/**
 *
 * @author DPDayton
 */
public class GalToLit {

    public static void main(String args[]) {
        double gallons; //holds the number of gallons
        double liters; //hold conversion to liters
        gallons = 10; //start with 10 gallons 
        liters = gallons * 3.7854; //convert to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}