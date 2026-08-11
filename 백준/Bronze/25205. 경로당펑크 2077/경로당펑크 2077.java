import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input01 = br.readLine();
        String input02 = br.readLine();
        System.out.print(solve(input02));
	}

    private static String solve(String input02) {
        return !chk(input02.charAt(input02.length() - 1)) ? "1" : "0";
    }

    private static boolean chk(char lastChar) {
        boolean chk = false;
        switch (lastChar){
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'b':
            case 'n':
            case 'm':
                chk = true;
                break;
            default:
                break;
        }
        return chk;
    }
}
