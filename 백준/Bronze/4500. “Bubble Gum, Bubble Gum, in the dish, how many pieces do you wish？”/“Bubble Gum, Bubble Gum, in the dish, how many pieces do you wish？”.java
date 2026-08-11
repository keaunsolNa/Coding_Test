import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            List<String> inputList = Arrays
                    .stream(br.readLine().split(" "))
                    .collect(Collectors.toList());

            int startIdx = inputList.indexOf(br.readLine());
            int gumCount = Integer.parseInt(br.readLine());
            int inputListSize = inputList.size();
            int winnerIdx = (startIdx + gumCount - 1) % inputListSize;

            sb.append(inputList.get(winnerIdx)).append("\n");

        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
}
