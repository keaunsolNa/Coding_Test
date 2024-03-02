import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int check = a;
        int Byron = 0;
        int Nikky = 0;

        Byron = checkCnt(a, b, s, check, Byron);

        check = c;
        Nikky = checkCnt(c, d, s, check, Nikky);

        System.out.println(Byron > Nikky ? "Nikky" : Byron < Nikky ? "Byron" : "Tied");
    }

    private static int checkCnt(int a, int b, int s, int check, int player) {

        int cnt = 0;
        int loopCnt = 0;
        while(cnt != s) {

            if(loopCnt == check) {

                check = check == a ? b : a;
                loopCnt = 0;
            }

            player += check == a ? 1 : -1;
            loopCnt++;
            cnt++;
        }
        return player;
    }

}