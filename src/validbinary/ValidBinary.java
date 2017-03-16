/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validbinary;
import java.text.*;
import java.util.*;

/**
 *
 * @author brian
 */
public class ValidBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final String VALID_BINARY_NUMBER = "[01]+";
        final String ACCEPTED_BINARY_NUMBER = "[01]*[1]{3}[01]*";
        System.out.println("Enter a binary number");
        String binaryNumber = scan.next();
        
        if (binaryNumber.matches(ACCEPTED_BINARY_NUMBER))
        {
            System.out.println( "The entered binary number " + binaryNumber + " is accepted");
        }
        else if (binaryNumber.matches(VALID_BINARY_NUMBER))
        {
            System.out.println( "The entered binary number " + binaryNumber + " is rejected");
        }
        else
        {
            System.out.println( "The entered binary number " + binaryNumber + " is invalid");
        }
    }
    
}
