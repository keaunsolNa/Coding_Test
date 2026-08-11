import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A' : sb.append('X'); break;
				case 'B' : sb.append('Y'); break;
				case 'C' : sb.append('Z'); break;
				case 'D' : sb.append('A'); break;
				case 'E' : sb.append('B'); break;
				case 'F' : sb.append('C'); break;
				case 'G' : sb.append('D'); break;
				case 'H' : sb.append('E'); break;
				case 'I' : sb.append('F'); break;
				case 'J' : sb.append('G'); break;
				case 'K' : sb.append('H'); break;
				case 'L' : sb.append('I'); break;
				case 'M' : sb.append('J'); break;
				case 'N' : sb.append('K'); break;
				case 'O' : sb.append('L'); break;
				case 'P' : sb.append('M'); break;
				case 'Q' : sb.append('N'); break;
				case 'R' : sb.append('O'); break;
				case 'S' : sb.append('P'); break;
				case 'T' : sb.append('Q'); break;
				case 'U' : sb.append('R'); break;
				case 'V' : sb.append('S'); break;
				case 'W' : sb.append('T'); break;
				case 'X' : sb.append('U'); break;
				case 'Y' : sb.append('V'); break;
				case 'Z' : sb.append('W'); break;
			}
		}
		
		System.out.println(sb);
	}
}
