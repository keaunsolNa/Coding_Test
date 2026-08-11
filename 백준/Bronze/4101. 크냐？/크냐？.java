import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")) {
			
			int input1 = Integer.parseInt(input.split(" ")[0]);
			int input2 = Integer.parseInt(input.split(" ")[1]);
			
			if(input1 > input2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
