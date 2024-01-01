import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        int max = -1;
        int sum = 0;

        for (char temp : input) {

            switch (temp) {

                case '[':
                    sum += 3;
                    break;
                case '{':
                    sum += 2;
                    break;
                case '(':
                    sum += 1;
                    break;
                case ')':
                    sum -= 1;
                    break;
                case '}':
                    sum -= 2;
                    break;
                case ']':
                    sum -= 3;
                    break;

                default:
                    if (sum > max) max = sum;
            }
        }

        System.out.println(max);
    }
}