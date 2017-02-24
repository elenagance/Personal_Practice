import java.util.*; 


public class addOne{

    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        System.out.println(add(n));
    }

    public static int add(int n){
        
        return (n&1)>0 ? add(n>>1)<<1 : n|1;

    }


}
