import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
      
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

}
