import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test18();
	}

    public static void test18() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();		
		int count = Integer.parseInt(br.readLine());
			
		int[][] apartment = new int [15][15];
			
		for(int i = 1; i < 15; i++) {
			apartment[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				if(j == 1)
					apartment[i][j] = 1;
				else
					apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
			}
		}
		
		for(int i = 0; i < count; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			sb.append(apartment[K][N]).append("\n");
		}
		
		System.out.print(sb); 
    }
}
