import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		double c = Integer.parseInt(st.nextToken());
		double d = Integer.parseInt(st.nextToken());

        double[] arr = {
                ((double)a / c) + ((double)b / d),
                ((double)c / d) + ((double)a / b),
                ((double)d / b) + ((double)c / a),
                ((double)b / a) + ((double)d / c)
        };
 
        double max = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index);
	}
}
