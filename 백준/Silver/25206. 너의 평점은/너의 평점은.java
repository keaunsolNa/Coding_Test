import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double totalPoint = 0;
		double sum = 0;
		for(int i = 0; i < 20; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			double point = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			double gradePoint = ("A+".equals(grade)) ? 4.5 : ("A0".equals(grade)) ? 4.0 : ("B+".equals(grade)) ? 3.5 :
								("B0".equals(grade)) ? 3.0 : ("C+".equals(grade)) ? 2.5 : ("C0".equals(grade)) ? 2.0 :
								("D+".equals(grade)) ? 1.5 : ("D0".equals(grade)) ? 1.0 : 0.0;
			
			if(!grade.equals("P")) 
				totalPoint += point;
			
			sum += (point * gradePoint);
		}
		
		System.out.printf("%.6f", sum / totalPoint);
	}
}
