import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = 0;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			input++;
			int pyramids = 0;
			while(input --> 0) {
				pyramids += input;
			}
			
			System.out.println(pyramids);
		}
	}
}
