import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        List<Integer> male = new ArrayList<>();
        List<Integer> female = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	
        	int gender = Integer.parseInt(st.nextToken());
        	int height = Integer.parseInt(st.nextToken());
        	
        	if (gender == 0) male.add(height);
        	else female.add(height);
        }
        
        Collections.sort(male, Collections.reverseOrder());
        Collections.sort(female, Collections.reverseOrder());

        male.addAll(female);
        
        for (int i = 0; i < n - 1; i++) {
        	max = Math.max(max, Math.abs(male.get(i + 1) - male.get(i)));
        }
        	
        	
        
        System.out.println(max);

        
    }

}