import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static Cow[] cows;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
        cows = new Cow[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            cows[i] = new Cow(Integer.parseInt(st.nextToken()), 
                    Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(cows);
        
        int time = cows[0].arrive;
        
        for (int i = 0; i < N; i++) {
            // 바로 검문을 받을 수 있는데, 소가 늦게 도착할 경우
            if(time < cows[i].arrive) time = cows[i].arrive;
            
            time += cows[i].check;
        }
        
        System.out.println(time);
        
	}

	public static class Cow implements Comparable<Cow>{
        int arrive, check;
        
        public Cow(int arrive, int check) {
            super();
            this.arrive = arrive;
            this.check = check;
        }
 
        @Override
        public int compareTo(Cow o) {
            return Integer.compare(this.arrive, o.arrive);
        }
	}
}
