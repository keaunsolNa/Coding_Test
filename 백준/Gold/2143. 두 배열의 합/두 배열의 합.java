import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] b = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) b[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < n; i++) a[i] += a[i - 1];
		for(int i = 1; i < m; i++) b[i] += b[i - 1];
		
		int sizeA = n * (n + 1) / 2;
		long[] aSum = new long[sizeA];
		int idx = 0;
		
		for(int i = 0; i < n; i++) 
			for(int j = i; j < n; j++) {
				
				int av = a[j];
				if(i > 0) av -= a[i - 1];
				aSum[idx++] = av;
				
			}
		
		int sizeB = m * (m + 1) / 2;
		long[] bSum = new long[sizeB];
		idx = 0;
		
		for(int i = 0; i < m; i++) 
			for(int j = i; j < m; j++) {
				
				int bv = b[j];
				if(i > 0) bv -= b[i - 1];
				bSum[idx++] = bv;
				
			}
		
		Arrays.sort(aSum);
		Arrays.sort(bSum);
		int left = 0;
		int right = sizeB - 1;
		long cnt = 0;
		
		while(left < sizeA && right > -1) {
			
			long asv = aSum[left], bsv = bSum[right];
			long sum = asv + bsv;
			if(sum == t) {
				
				long ac = 0;
				long bc = 0;
				
				while(left< sizeA && asv == aSum[left]) { left++; ac++; }
				
				while(right > -1 && bsv == bSum[right]) { right--; bc++; }
					
				cnt += ac * bc;
				
			}
			
			if(sum > t) right--;
			else if(sum < t) left++;
		}
		
		System.out.println(cnt);
	}
}
