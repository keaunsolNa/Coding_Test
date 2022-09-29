package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test13_Geometry {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	// 직사각형에서 탈출
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xOut = Math.min(w-x, Math.abs(0-x));
		int yOut = Math.min(h-y, Math.abs(0-y));
		System.out.println(Math.min(xOut, yOut));
	}
	
	// 네 번째 점
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[2][3];
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[0][i] = Integer.parseInt(st.nextToken());
			arr[1][i] = Integer.parseInt(st.nextToken());
		}
		
		int temp = arr[0][0];
		if(arr[0][1] == temp) {
			System.out.print(arr[0][2]);
		} else if(arr[0][2] == temp) {
			System.out.print(arr[0][1]);
		} else {
			System.out.print(arr[0][0]);
		}
		
		System.out.print(" ");
		temp = arr[1][0];
		if(arr[1][1] == temp) {
			System.out.print(arr[1][2]);
		} else if(arr[1][2] == temp) {
			System.out.print(arr[1][1]);
		} else {
			System.out.print(arr[1][0]);
		}
	}

	// 직각삼각형
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else System.out.println("wrong");
			
		}
	}

	// 참외밭
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());

		int maxH = 0, maxW = 0;
		int maxHIdx = -1, maxWIdx = -1;
		
		int[] wayPoint = new int[6];
		int[] distance = new int[6];
		
		for(int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			wayPoint[i] = Integer.parseInt(st.nextToken());
			distance[i] = Integer.parseInt(st.nextToken());
			if(wayPoint[i] == 1 || wayPoint[i] == 2) {
				if(maxH < distance[i]) {
					maxH = distance[i];
					maxHIdx = i;
				}
			} else {
				if(maxW < distance[i]) {
					maxW = distance[i];
					maxWIdx = i;
				}
			}
		}
		
		int totalSpace = maxH*maxW;
		int cuttingSpace = distance[(maxWIdx + 3) % 6] * distance[(maxHIdx + 3) % 6]; 

		System.out.println((totalSpace - cuttingSpace)*K);
		
	}
	
	// 택시 기하학
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
		
		System.out.println(R*R*Math.PI);
		System.out.println(2*R*R);
		
	}
}
