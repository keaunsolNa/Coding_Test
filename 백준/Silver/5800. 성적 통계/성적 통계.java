import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < K; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	int N = Integer.parseInt(st.nextToken());
        	StringBuilder sb = new StringBuilder();
        	
        	int min = 101;
        	int max = 0;
        	Integer[] pointArr = new Integer[N];
        	for(int j = 0; j < N; j++) {
        		int point = Integer.parseInt(st.nextToken());
        		pointArr[j] = point;
        		
        		if(point > max) {
        			max = point;
        		}
        		if(point < min) {
        			min = point;
        		}
        	}
        	
        	Arrays.sort(pointArr, Comparator.reverseOrder());
        	
        	int gap = 0;
        	
        	
        	for(int j = 0; j < N-1; j++) {
        		int temp = pointArr[j] - pointArr[j+1];
        		if(gap < temp) gap = temp;
        		
        	}
        	sb.append("Class ").append(i+1).append("\n").append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap);
        	
        	System.out.println(sb);
        }
	}
}
