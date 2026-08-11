import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String C = br.readLine();
		
		switch(C){
			case "A+" : System.out.println(4.3);break; 
			case "A0" : System.out.println(4.0);break; 
			case "A-" : System.out.println(3.7);break; 
			case "B+" : System.out.println(3.3);break; 
			case "B0" : System.out.println(3.0);break; 
			case "B-" : System.out.println(2.7);break; 
			case "C+" : System.out.println(2.3);break; 
			case "C0" : System.out.println(2.0);break; 
			case "C-" : System.out.println(1.7);break; 
			case "D+" : System.out.println(1.3);break; 
			case "D0" : System.out.println(1.0);break; 
			case "D-" : System.out.println(0.7);break; 
			case "F" : System.out.println(0.0);break; 
		}
	}
}
