import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test21();
	}

	public static void test21() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int mixed = 0;
		if(temp[0].equals("1")) {
			if(temp[1].equals("2"))if(temp[2].equals("3"))if(temp[3].equals("4"))if(temp[4].endsWith("5"))
				if(temp[5].equals("6"))if(temp[6].equals("7"))if(temp[7].equals("8")) {
					System.out.println("ascending");
					mixed = 1;
				}
		} else if(temp[0].equals("8")) {
			if(temp[1].equals("7"))if(temp[2].equals("6"))if(temp[3].equals("5"))if(temp[4].endsWith("4"))
				if(temp[5].equals("3"))if(temp[6].equals("2"))if(temp[7].equals("1")) {
					System.out.println("descending");
					mixed = 1;
				}
		} 
		
		if(mixed == 0) {
			System.out.println("mixed");
		}
	}
}
