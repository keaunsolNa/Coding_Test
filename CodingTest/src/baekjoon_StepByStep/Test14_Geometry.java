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
