import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test06();
	}

	public static void test06()  {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] arr;
		
		for(int i = 0; i < testCase; i++) {
			
			int studentCount = sc.nextInt();
			arr = new int[studentCount];
			
			int total = 0;
			
			for(int j = 0; j < studentCount; j++) {
				int temp = sc.nextInt();
				arr[j] = temp;
				total += temp;
			}
			
			double avg = total/studentCount;
			double cnt = 0;
			
			for(int k = 0; k < studentCount; k++) {
				if(arr[k] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/studentCount)*100);
		}
		
		
	}
}
