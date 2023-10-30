import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] rainbow = new char[14];
		int N = Integer.parseInt(br.readLine());

		String input = br.readLine();
		for(int i = 0 ; i < N; i++) {
			
			switch(input.charAt(i)) {
				case 'r' : rainbow[0]++; break;
				case 'o' : rainbow[1]++; break;
				case 'y' : rainbow[2]++; break;
				case 'g' : rainbow[3]++; break;
				case 'b' : rainbow[4]++; break;
				case 'i' : rainbow[5]++; break;
				case 'v' : rainbow[6]++; break;
				case 'R' : rainbow[7]++; break;
				case 'O' : rainbow[8]++; break;
				case 'Y' : rainbow[9]++; break;
				case 'G' : rainbow[10]++; break;
				case 'B' : rainbow[11]++; break;
				case 'I' : rainbow[12]++; break;
				case 'V' : rainbow[13]++; 
			}
		}
		
		boolean small = true; 
		for(int i = 0; i < 7; i++) 
			if(rainbow[i] < 1) { small = false; break; }
		
		boolean large = true;
		for(int i = 7; i < 14; i++) 
			if(rainbow[i] < 1) { large = false; break; }
		
		
		if(small && large) System.out.print("YeS");
		else if(!small && !large) System.out.print("NO!");
		else if(small) System.out.print("yes");
		else if(large) System.out.print("YES");
   }
}