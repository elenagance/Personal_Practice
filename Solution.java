import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(balanced(s));
        }
        
    }
    
    public static String balanced(String s){
        if(s.length()%2!=0){
            return "NO";
        }
   
        Stack first = new Stack();
        Stack second = new Stack();
        for(int i=0; i<s.length(); i++){//add all to stack
            first.push(s.charAt(i)); 
        }
        for(int j=0; j<s.length(); j++){
            if(second.isEmpty())
                second.push(first.pop());
            else{
                char temp=(char)first.pop();
                char other=(char)second.peek();
                if(temp =='('&& other==')'
                  ||temp=='['&& other==']'
                  ||temp=='{'&& other=='}'){
                  second.pop();
               }
                else{
                    second.push(temp);
                }
            }
        }
        
        if(first.isEmpty()&&second.isEmpty()){
            return "YES";
        }
        
        return "NO";

    }
}
