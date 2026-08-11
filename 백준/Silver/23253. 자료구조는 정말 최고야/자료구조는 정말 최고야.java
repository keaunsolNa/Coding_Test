import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        boolean result = true;

        for (int i = 0; i < M; i++) {
            int c = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().split(" ");
            int preVal = 200001;
            for (int j = 0; j < c; j++) {
                if (Integer.parseInt(strs[j]) > preVal) {
                    result = false;
                }
                preVal = Integer.parseInt(strs[j]);
            }
        }


        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
		
	}
}
