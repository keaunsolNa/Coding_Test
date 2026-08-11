import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

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
}
