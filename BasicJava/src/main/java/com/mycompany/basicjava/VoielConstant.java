
package com.mycompany.basicjava;
import java.util.Scanner;
public class VoielConstant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char text;
        
        System.out.print("Enter Text: ");
        
        text = input.next().charAt(0);
        
        if(text == 'a'){
            System.out.println("Vowel");
        }else if(text == 'e'){
            System.out.println("Vowel");
        }else if(text == 'i'){
            System.out.println("Vowel");
        }else if(text == 'o'){
            System.out.println("Vowel");
        }else if(text == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonent");
        }
    }
}
