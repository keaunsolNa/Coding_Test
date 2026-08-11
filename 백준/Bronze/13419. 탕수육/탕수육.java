import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T --> 0) {
        	String input = br.readLine();
        	
        	if(input.length() % 2 == 0) {
        		String A = "";
        		String B = "";
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) A += input.charAt(i)+"";
        			else B += input.charAt(i)+"";
        		}
        		System.out.println(A);
        		System.out.println(B);
        	} else {
        		String A = "";
        		String B = "";
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) A += input.charAt(i)+"";
        			else B += input.charAt(i)+"";
        		}
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) B += input.charAt(i)+"";
        			else A += input.charAt(i)+"";
        		}
        		System.out.println(A);
        		System.out.println(B);
        	}
        	
        }
	}
}
