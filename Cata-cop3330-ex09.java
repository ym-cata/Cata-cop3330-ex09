/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */


import java.util.Scanner;   
import java.lang.*;        

public class Main{

     public static void main(String []args){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length and width of the ceiling in feet");
        //asks user to input length and width of ceiling 

        float length = st.nextFloat();
        float breadth = st.nextFloat();
        float area = length * breadth; //calculating area
        
        //calculating number of gallons required assuming each gallon covers 350 square feet 
        int result = (int) Math.ceil(area / 350); 
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+area+" square feet");
     }
}