/***************************************************************
* Given an Array of even occurrences of all numbers except two, 
* this will return the two numbers that have odd occurrences
*****************************************************************/

import java.io.*;
import java.util.*; 

public class xor{

        public static void main(String[] args){
                System.out.println("enter number of elements of your array." 
                                   + " Please note only two numbers can have odd frequency," 
                                   + " the others have an even frequency"); 
                
                Scanner scan = new Scanner(System.in); 
                int n = scan.nextInt(); //number of elements in the array
                int[] arr = new int[n]; 
                int xor=0;
                for(int i=0; i<n; i++){
                        System.out.println("Enter the next number: "); 
                        arr[i] = scan.nextInt();
                        xor = xor^arr[i]; 
                }
                //The XOR now contains the xor of the two odd occuring elements in the array. 
                //Because all even canceled each other out - by logic.
                
                /*
                * to get the rightmost bit -> subtract one, so that when you NOT it, 
                * And then apply the & operator to the original XOR, by logic
                * Only the rightmost bit will be turned on:
                */
                
                int rightmostbit = xor & ~(xor-1); // where the first diff occurs. 
                                                   // way to split the set in two
                
                int x=0;
                int y=0;   
                for(int i=0; i<n; i++){ //iterate through the original array
                        if((arr[i] & rightmostbit)>0) //determines first odd occurrence.
                            x=x^arr[i]; 
                        else
                            y=y^arr[i];               //determines the second off occurrence.
        
                }
                System.out.println("two odd occurring elemtns in the array is " + x + " " + y); 
                
                scan.close();
        
        }


}
