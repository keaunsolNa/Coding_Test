import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
    boolean base1 = false;
    boolean base2 = false;
    boolean base3 = false;
    int score = 0;
    int ballCount = 0;

    void oneCount(int number) {
    	
        if (number == 1) { 
            if (ballCount == 3) {
                if (!base1) {
                    base1 = true;
                    ballCount = 0;
                } else if (!base2) {
                    base2 = true;
                    ballCount = 0;
                } else if (!base3) {
                    base3 = true;
                    ballCount = 0;
                } else {
                    ballCount = 0;
                    score += 1;
                }
            } else {
                ballCount += 1;
            }
        } else if (number == 2) { 
            if (!base1) {
                base1 = true;
                ballCount = 0;
            } else if (!base2) {
                base2 = true;
                ballCount = 0;
            } else if (!base3) {
                base3 = true;
                ballCount = 0;
            } else {
                ballCount = 0;
                score += 1;
            }
        } else if (number == 3) { 
            if (ballCount == 3) { 
                if (base3) {
                    base3 = false;
                    score += 1;
                }
                if (base2) {
                    base2 = false;
                    base3 = true;
                }
                if (base1) {
                    base1 = false;
                    base2 = true;
                }
                ballCount = 0;
                base1 = true;
            } else {
                if (base3) {
                    base3 = false;
                    score += 1;
                }
                if (base2) {
                    base2 = false;
                    base3 = true;
                }
                if (base1) {
                    base1 = false;
                    base2 = true;
                }
                ballCount += 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Main baseball = new Main();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            int num = Integer.parseInt(st.nextToken());
            baseball.oneCount(num);
        }

        System.out.println(baseball.score);
    }
}
