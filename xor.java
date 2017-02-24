import java.io.*;
import java.util.*; 

public class xor{

        public static void main(String[] args){
                System.out.println("enter number of elements"); 
                Scanner scan = new Scanner(System.in); 
                int n = scan.nextInt();
                int[] arr = new int[n]; 
                int xor=0;
                for(int i=0; i<n; i++){
                        arr[i] = scan.nextInt();
                        xor = xor^arr[i]; 
                }
                
                //find two odd occurrences of array
                int rightmostbit = xor & ~(xor-1);
                int x=0;
                int y=0;   
                for(int i=0; i<n; i++){
                        if((arr[i] & rightmostbit)>0)
                            x=x^arr[i];
                        else
                            y=y^arr[i];
        
                }
                System.out.println("two odd occurring is " + x + " " + y); 
                scan.close();
        
        }


}
