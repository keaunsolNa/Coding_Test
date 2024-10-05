import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
    static int N;
    static int[][] players;
    static boolean[] select; 
    static int[] lineUp; 
    static int ans;
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
 
        players = new int[N + 1][10];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                players[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 
        select = new boolean[10];
        lineUp = new int[10];
 
        select[4] = true; 
        lineUp[4] = 1;
 
        ans = 0;
        perm(2);
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static void perm(int num) {
        if (num == 10) {
            playBaseBall();
            return;
        }
 
        for (int i = 1; i <= 9; i++) {
            if (select[i]) {
                continue;
            }
            select[i] = true;
            lineUp[i] = num;
            perm(num + 1);
            select[i] = false;
        }
    }
 
    public static void playBaseBall() {
        int score = 0;
        int startPlayer = 1; 
        boolean[] base; 
 
        for (int i = 1; i <= N; i++) { 
            int outCnt = 0;
            base = new boolean[4]; 
 
            outer: while (true) {
                for (int j = startPlayer; j <= 9; j++) {
                    int hitter = players[i][lineUp[j]];
 
                    switch (hitter) {
                    case 0: 
                        outCnt++;
                        break;
                    case 1: 
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) {
                                if (k == 3) { 
                                    score++; 
                                    base[k] = false;
                                    continue;
                                }
 
                                base[k] = false;
                                base[k + 1] = true;
                            }
                        }
                        base[1] = true;
                        break;
                    case 2: 
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) {
                                if (k == 3 || k == 2) { 
                                    score++; 
                                    base[k] = false; 
                                    continue;
                                }
 
                                base[k] = false;
                                base[k + 2] = true;
                            }
                        }
                        base[2] = true; 
                        break;
                    case 3: 
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) { 
                                score++; 
                                base[k] = false;
                            }
                        }
 
                        base[3] = true; 
                        break;
                    case 4: 
                        for (int k = 1; k <= 3; k++) {
                            if (base[k]) { 
                                score++; 
                                base[k] = false;
                            }
                        }
                        score++;
                        break;
                    }
 
                    if (outCnt == 3) { 
                        startPlayer = j + 1;
                        if (startPlayer == 10) {
                            startPlayer = 1;
                        }
                        break outer;
                    }
                }
                startPlayer = 1;
            }
        }
 
        ans = Math.max(ans, score);
    }
 
}
