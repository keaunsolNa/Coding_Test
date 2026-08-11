import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] A = new int[5];
        for(int i = 0; i < 5; i++) A[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] B = new int[5];
        for(int i = 0; i < 5; i++) B[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int cnt = 0;
        for(int i = 0; i < 5; i++) if(A[i] > B[i]) cnt++;
        System.out.println(cnt);
	}
}
