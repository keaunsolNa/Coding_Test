import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i]=Integer.parseInt(st.nextToken());
		
		int min = arr[0] + arr[1];
		for(int i = 1; i < N - 1; i++) min = Math.min(min, arr[i] + arr[i + 1]);
		
		min *= X;
		System.out.println(min);

    }

}
