import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cold = Integer.MAX_VALUE;
		String city = "";
		while((input = br.readLine()) != null) {
			String name = input.split(" ")[0];
			int temp = Integer.parseInt(input.split(" ")[1]);
			
			if(cold > temp) {
				cold = temp;
				city = name;
			}
			
		}
		
		System.out.println(city);
		
		
	}
}
