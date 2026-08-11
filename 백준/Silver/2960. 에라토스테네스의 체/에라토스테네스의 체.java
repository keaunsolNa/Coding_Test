import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        List<Integer> arrList = new ArrayList<>();
        for(int i = N; i >= 2; i--) {
        	arrList.add(i);
        }
        
        int answer = 0;
        while(!arrList.isEmpty()) {
        	int target = arrList.get(arrList.size()-1);
        	int length = arrList.size();
        	if(length == 0) break;
        	
        	for(int i = arrList.size()-1; i >= 0; i--) {
        		if(arrList.get(i) % target == 0) {
        			K--;
        			if(K==0)answer = arrList.get(i);
        			arrList.remove(i);
        		}
        	}
        	
        }
        System.out.println(answer);
	}
}
