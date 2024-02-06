import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<String> baekjoon = new ArrayList<>();
        List<String> question = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            String input = br.readLine();

            if(input.contains("boj.kr/")) baekjoon.add(input);
            else question.add(input);
        }

        baekjoon.sort((o1, o2) -> {

            int value = Integer.parseInt(o1.replaceAll("boj.kr/", ""));
            int value2 = Integer.parseInt(o2.replaceAll("boj.kr/", ""));

            return value - value2;
        });

        question.sort((o1, o2) -> {

            if(o1.length() == o2.length()) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        });

        for(String str : question) sb.append(str).append("\n");
        for(String str : baekjoon) sb.append(str).append("\n");

        System.out.print(sb.deleteCharAt(sb.length() - 1));
    }

}