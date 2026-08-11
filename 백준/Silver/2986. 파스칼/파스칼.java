import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int count = 1;
       
       for(int i = 2; i * i <= n; i ++) { 

    	   if(n % i == 0) {
    		   count = n/i; 
    		   break;
    	   }

       }
       
       System.out.println(n-count);
   }
}
