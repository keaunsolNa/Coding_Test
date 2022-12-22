package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test14_Geometry {

	public static void main(String[] args) throws IOException {
		test07();
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
	
	// 터렛
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			System.out.println(targetPoint(x1, y1, r1, x2, y2, r2));
		}
	}
	
	// 터렛 접점 찾기 메서드
	public static int targetPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		else if(distance > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		
		else if(distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		else if(distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		
		else if(distance == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
	}

	// 어린 왕자
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int length = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < length; i++) {
        	
            String base = br.readLine();
            
            int x_start = Integer.parseInt(base.split(" ")[0]);
            int y_start = Integer.parseInt(base.split(" ")[1]);
            
            int x_end = Integer.parseInt(base.split(" ")[2]);
            int y_end = Integer.parseInt(base.split(" ")[3]);
            
            int through = 0;
            
            int count = Integer.parseInt(br.readLine());
            
            for (int j = 0; j < count; j++) {
            	
                String circle = br.readLine();
                
                int x = Integer.parseInt(circle.split(" ")[0]);
                int y = Integer.parseInt(circle.split(" ")[1]);
                int r = Integer.parseInt(circle.split(" ")[2]);
                
                boolean hasStartContain = hasContain(x_start, y_start, x, y, r);
                boolean hasEndContain = hasContain(x_end, y_end, x, y, r);
                
                if (!(hasStartContain && hasEndContain) && (hasStartContain || hasEndContain)) {
                    through++;
                }
            }
            
            System.out.println(through);
        }
        
	}
    private static boolean hasContain(int xo, int yo, int x, int y, int r){
        return Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2)) < r;
    }
	

}
