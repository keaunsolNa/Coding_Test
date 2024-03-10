import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        boolean odd = false;
        
        if ( n % 2 == 1) {
            odd = true;
            n--;
        }
        
        while (n --> 0) {
            
            if (n % 2 == 1) sb.append("1").append(" ");
            else sb.append("2").append(" ");
            
        }
        if (odd) sb.append("3");
        
        System.out.print(sb.toString());
    }
}