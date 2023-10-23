import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
	   
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) list.add(Integer.parseInt(st.nextToken()));
	   
        int K = Integer.parseInt(br.readLine());
	   
        for(int i = 0; i < N; i+= N / K) list.subList(i, i + N / K).sort(Comparator.naturalOrder());

        for (Integer integer : list) System.out.print(integer + " ");

    }
}