import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("ENDOFINPUT")) {
			StringBuilder sb = new StringBuilder();
			String text = br.readLine();
			
			for(int i = 0; i < text.length(); i++) {
				
				switch(text.charAt(i)) {
					
					case 'A' : sb.append("V"); break;
					case 'B' : sb.append("W"); break;
					case 'C' : sb.append("X"); break;
					case 'D' : sb.append("Y"); break;
					case 'E' : sb.append("Z"); break;
					case 'F' : sb.append("A"); break;
					case 'G' : sb.append("B"); break;
					case 'H' : sb.append("C"); break;
					case 'I' : sb.append("D"); break;
					case 'J' : sb.append("E"); break;
					case 'K' : sb.append("F"); break;
					case 'L' : sb.append("G"); break;
					case 'M' : sb.append("H"); break;
					case 'N' : sb.append("I"); break;
					case 'O' : sb.append("J"); break;
					case 'P' : sb.append("K"); break;
					case 'Q' : sb.append("L"); break;
					case 'R' : sb.append("M"); break;
					case 'S' : sb.append("N"); break;
					case 'T' : sb.append("O"); break;
					case 'U' : sb.append("P"); break;
					case 'V' : sb.append("Q"); break;
					case 'W' : sb.append("R"); break;
					case 'X' : sb.append("S"); break;
					case 'Y' : sb.append("T"); break;
					case 'Z' : sb.append("U"); break;
					default : sb.append(text.charAt(i)); 
				}
			}
			br.readLine();
			
			System.out.println(sb);
		}
	}
}
