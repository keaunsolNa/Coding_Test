import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		double[] originArr = new double[T];
		for(int i = 0; i < T; i++) {
			originArr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(originArr);
		
		String sb = originArr[1]+"";
		
		if(sb.split("[.]")[1].length() == 1) {
			System.out.println(sb+"0");
		} else {
			System.out.println(sb);
		}
		
	}
}
