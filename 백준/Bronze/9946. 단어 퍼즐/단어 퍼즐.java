import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int idx = 1;
		while(!(input = br.readLine()).equals("END")) {
			String compare = br.readLine();
			String result = "";
			StringBuilder sb = new StringBuilder();
			if(input.length() != compare.length()) {
				result = "different";
			} else {
		        input = input.chars()       
		                	 .sorted()
		                	 .collect(StringBuilder::new,
		                	 	 	  StringBuilder::appendCodePoint,
		                	 	 	  StringBuilder::append)
		                	 .toString();
		        
		        compare = compare.chars()
		        			     .sorted()
		        			     .collect(StringBuilder::new,
		        				  	      StringBuilder::appendCodePoint,
		        					      StringBuilder::append)
		        			     .toString();
		        
		        if(input.equals(compare)) {
		        	result = "same";
		        } else {
		        	result = "different";
		        }
			}
			
			sb.append("Case ").append(idx).append(": ").append(result);
			idx++;
			
			System.out.println(sb);
		}
		
	}
}
