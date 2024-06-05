import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int temp1 = a + b;
    	int temp2 = a - b;
    	int temp3 = a * b;
    	
    	String str1 = a < 0 ? "(" + a + ")" : a + "";
    	String str2 = b < 0 ? "(" + b + ")" : b + "";
    	String str4 = temp1 < 0 ? "(" + temp1 + ")" : temp1 + "";
    	String str5 = temp2 < 0 ? "(" + temp2 + ")" : temp2 + "";
    	String str6 = temp3 < 0 ? "(" + temp3 + ")" : temp3 + "";

    	
    	if (temp1 > temp2 && temp1 > temp3) 
    		System.out.println(str1 + "+" + str2+ "=" + str4);
    	else if (temp2 > temp1 && temp2 > temp3)
    		System.out.println(str1 + "-" + str2 + "=" + str5);
    	else if (temp3 > temp1 && temp3 > temp2)
    		System.out.println(str1 + "*" + str2 + "=" + str6);
    	else System.out.println("NIE");
   
    	
    }
    
    
}
