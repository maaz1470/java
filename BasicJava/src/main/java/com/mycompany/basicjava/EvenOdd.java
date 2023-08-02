/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicjava;
import java.util.Scanner;
/**
 *
 * @author Partho
 */
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter number for checking odd or event: ");
        x = input.nextInt();
        if(x%2 == 0){
             System.out.print("Odd");
        }else{
            System.out.print("Event");
        }
    }
}
