package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringPlus26 {
	
	public static void main(String[] args) throws IOException {
		test04();
	}

	
	// Voting 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			
			int yes = 0;
			int no = 0;
			int enter = 0;
			int total = input.length();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					case 'Y' : yes++; enter++; break;
					case 'N' : no++; enter++; break;
					case 'P' :enter++; break;
				}
			}
			
			if(total/2 >= enter) System.out.println("need quorum");
			else if(yes > no) System.out.println("yes");
			else if(no > yes) System.out.println("no");
			else System.out.println("tie");
		}
		
	}
	
	
}
