import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String[] K = br.readLine().split(" ");
			int score = Integer.parseInt(K[1]);
			String grade = "";
			if(score < 60) {
				grade = "F";
			} else if(score < 67) {
				grade = "D";
			} else if(score < 70) {
				grade = "D+";
			} else if(score < 77) {
				grade = "C";
			} else if(score < 80) {
				grade = "C+";
			} else if(score < 87) {
				grade = "B";
			} else if(score < 90) {
				grade = "B+";
			} else if(score < 97) {
				grade = "A";
			} else {
				grade = "A+";
			}
			System.out.println(K[0] + " " + grade);
		}
	}
}
