import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch(br.readLine()) {
		
			case "NLCS" : System.out.println("North London Collegiate School"); break;
			case "BHA" : System.out.println("Branksome Hall Asia"); break;
			case "KIS" : System.out.println("Korea International School"); break;
			case "SJA" : System.out.println("St. Johnsbury Academy"); break;
		
		}
        
	}
}
