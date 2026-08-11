import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		
		for(int top = 100; top <= 999; top++){
		  
			for(int bottom = 100; bottom <= 999; bottom++){
	    	
				if(top % 111 == 0 && bottom % 111 == 0) continue;
				if(bottom*(top / 10) == top*(bottom % 100) && (top % 10) == (bottom /100))
	       
					System.out.printf("%d / %d = %d / %d\n", top, bottom, top/10, bottom%100);
			}
	  
		}

	}
}
