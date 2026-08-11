import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String>[] arr = new ArrayList[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
            String cur = br.readLine();
            for (int j = 0; j < cur.length(); j++)
                arr[i].add(cur.substring(j) + cur.substring(0, j));

            boolean chk = true;
            for (int j = 0; chk && j <= i-1; j++) {
                for (int k = 0; chk && k < arr[j].size(); k++) {
                    if (cur.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk)
                cnt++;
        }
        System.out.println(cnt);
	}
}
