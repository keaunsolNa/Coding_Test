import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    private static boolean[] isPrime;
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        sieve();

        for(int i = 0; i < isPrime.length; i++) if(isPrime[i]) list.add(i);

        while(t --> 0) {
            int k = Integer.parseInt(br.readLine());
            boolean flag = false;
            int[] answer = new int[3];

            for(int i = 0; i < list.size(); i++) {

                for(int j = 0; j < list.size(); j++) {

                    for (Integer integer : list) {

                        if (list.get(i) + list.get(j) + integer == k) {

                            flag = true;
                            answer[0] = list.get(i);
                            answer[1] = list.get(j);
                            answer[2] = integer;
                            break;
                        }
                    }
                    if(flag) break;
                }
                if(flag) break;
            }

            Arrays.sort(answer);
            System.out.println(answer[2] == 0 ? 0 : answer[0] + " " + answer[1] + " " + answer[2]);
        }

     }

    private static void sieve() {

        isPrime = new boolean[1001 + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= 1001; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < 1001 + 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
