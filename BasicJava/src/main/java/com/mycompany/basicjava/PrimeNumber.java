
package com.mycompany.basicjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, count = 0;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        
        if(num == 1 && num == 2){
            System.out.println("Prime number is not possible");
        }else{
            for(int x=2; x<num; x++){
                if(num%x==0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("This is prime number");
            }else{
                System.out.println("This is not prime number.");
            }
        }
    }
}
