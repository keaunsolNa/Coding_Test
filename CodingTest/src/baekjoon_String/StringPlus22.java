package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StringPlus22 {
	
	public static void main(String[] args) throws IOException {
		test03();
	}

	
	// 끝말잇기
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean can = true;
        char target = st.nextToken().charAt(0);
        		
        for(int i = 0; i < N - 1; i++) {
        	
        	if(st.nextToken().charAt(0) != target) {
        		can = false;
        		break;
        	}
        }

        if(can) System.out.println(1);
        else System.out.println(0);
	}
	
	
}
