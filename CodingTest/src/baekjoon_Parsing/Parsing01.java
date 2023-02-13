package baekjoon_Parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Parsing01 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 1942번 - 디지털시계
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			
			String[] t = br.readLine().split(" ");
			int[] st = stringToIntArray(t[0].split(":"));
			int[] et = stringToIntArray(t[1].split(":"));
			int sti = timeCounter(st, false);
			int eti = timeCounter(et, false);
			int count = 0;
			
			while (sti != eti) {

				if (sti % 3 == 0) count++;
				sti = timeCounter(st, true);
			}
			
			count += (eti % 3 == 0) ? 1 : 0;
			System.out.println(count);
			
		}
		
	}

	private static int[] stringToIntArray(String[] strArr) {
		
	    int[] intArr = new int[strArr.length];
	    for (int i = 0; i < strArr.length; i++) intArr[i] = Integer.parseInt(strArr[i]);
	    return intArr;
	    
	}
		
	private static int timeCounter(int[] tArr, boolean convert) {
		
	    if (convert) {
	    	
	    	tArr[2] += 1;
	        
	    	if (tArr[2] == 60) {
	            tArr[2] = 0;
	            tArr[1] += 1;
	        }
	        
	    	if (tArr[1] == 60) {
	            tArr[1] = 0;
	            tArr[0] += 1;
	    	}

	    	if (tArr[0] == 24) {
	            tArr[0] = 0;
	        }
	    	
	    }

	    StringBuilder sb = new StringBuilder();
	    for (int time : tArr) sb.append(time < 10 ? "0" + time : time);
	    
	    return Integer.parseInt(sb.toString());
	}
	
	// 2870번 - 수학숙제 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i, j, n = Integer.parseInt(br.readLine());
		ArrayList<BigInteger> list = new ArrayList<>();
		String line[];
		
		for(i = 0; i < n; i++) {
			line = br.readLine().split("\\D");
			
			for(j = 0; j < line.length; j++)
				if(!line[j].equals("")) list.add(new BigInteger(line[j]));
			
		}
		
		list.sort(null);
		n = list.size();
		for(i = 0; i < n; i++) sb.append(list.get(i) + "\n");
		
		System.out.println(sb.toString());
		
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	
}
