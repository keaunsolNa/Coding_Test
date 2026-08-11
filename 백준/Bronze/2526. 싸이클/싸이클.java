import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int idx = 0;
        int temp = N;
        int arr[] = new int[P + 1];
        
        while (true) {
        	
        	temp = N * temp % P;
        	for (int i = 0; i < idx; i++) {
        		if (arr[i] == temp) {
        			System.out.println(String.valueOf(idx - i));
        			return;
        		}
        	}

        	arr[idx] = temp;
        	idx++;
        }
	}
}
