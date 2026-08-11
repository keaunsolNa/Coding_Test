import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		switch(input) {
		
			case "SONGDO" : System.out.println("HIGHSCHOOL"); break;
			case "CODE" : System.out.println("MASTER"); break;
			case "2023" : System.out.println("0611"); break;
			case "ALGORITHM" : System.out.println("CONTEST"); break;
			
		}
		
	}
}
