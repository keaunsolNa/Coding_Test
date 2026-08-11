import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int vic = solove(N - 300);
		int edm = solove(N - 200);
		int win = solove(N - 100);
		int tro = N;
		int hal = solove(N + 100);
		int stj = solove(N + 130);
		
		sb.append(N + " in Ottawa" + "\n");
		sb.append(vic + " in Victoria" + "\n");
		sb.append(edm + " in Edmonton" + "\n");
		sb.append(win + " in Winnipeg" + "\n");
		sb.append(tro + " in Toronto" + "\n");
		sb.append(hal + " in Halifax" + "\n");
		sb.append(stj + " in St. John's");
		
		System.out.println(sb);
		
	}

    private static int solove(int time) {
        int curTime = time;

        if (curTime % 100 > 59) curTime += 40;

        if (curTime % 100 < -59) curTime -= 40;

        if (time < 0) curTime = 2400 + time;

        if (curTime > 2399) curTime %= 2400;

        return curTime;
    }
}
