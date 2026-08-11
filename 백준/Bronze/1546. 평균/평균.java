import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test07();
	}

	public static void test07() {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		float[] arr = new float[length];
		float max = -1;
		float avg = 0;
		
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg +=  (arr[i]/max*100)/length;
		}
		
		System.out.println(avg);
	}
}
