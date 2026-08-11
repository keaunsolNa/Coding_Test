import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] people = new int[testCase];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < testCase; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int chiefSupervisor = Integer.parseInt(st.nextToken());
		int subSupervisor = Integer.parseInt(st.nextToken());
		
		long sum = testCase;
		for(int i = 0; i < people.length; i++) {
			people[i] -= chiefSupervisor;
			if(people[i] > 0) {
				if(people[i]%subSupervisor > 0) {
					sum += people[i]/subSupervisor + 1;
				} else {
					sum += people[i]/subSupervisor;
				}
			}
		}
		System.out.println(sum);
	}
}
