
package com.mycompany.basicjava;
import java.util.Scanner;
/**
 *
 * @author Partho
 */
public class InputData {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String name;
        
        System.out.println("Inter your name: ");
        name = input.nextLine();
        
        System.out.print("Welcome, "+name);
    }
}
