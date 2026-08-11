import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int temp;
        
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++) {
                
                if(arr[j] > arr[j + 1]) {
                    K--;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    if(K == 0) {
                    	System.out.println(arr[j] + " " + arr[j+1]);
                    	return;
                    }
                }
                
            }
        }

        if(K > 0) {
        	System.out.println(-1);
        }
	}
}
