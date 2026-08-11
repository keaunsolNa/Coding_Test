import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr1 = new int[10];
		for(int i = 0; i < 10; i++)arr1[i] = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr2 = new int[10];
		for(int i = 0; i < 10; i++)arr2[i] = Integer.parseInt(st.nextToken());
		
		int AW = 0;
		int BW = 0;
		for(int i = 0; i < 10; i++) {
			
			if(arr1[i] > arr2[i]) AW++;
			else if(arr1[i] < arr2[i]) BW++;
		}
		
		if(AW > BW) System.out.println("A");
		else if(AW < BW) System.out.println("B");
		else System.out.println("D");
	}
}
