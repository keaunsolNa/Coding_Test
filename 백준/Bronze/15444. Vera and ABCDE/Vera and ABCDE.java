import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
				case 'A' : sb.append("***"); break;
				case 'B' : sb.append("***"); break;
				case 'C' : sb.append("***"); break;
				case 'D' : sb.append("***"); break;
				case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("*.*"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("*.."); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("***"); break;
			case 'B' : sb.append("***"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("*.*"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("*.."); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("***"); break;
			case 'C' : sb.append("***"); break;
			case 'D' : sb.append("***"); break;
			case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		System.out.println(sb);
	}
}
