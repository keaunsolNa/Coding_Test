import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            String target = st.nextToken();

            switch (target) {

                case ".-" : sb.append("A"); break;
                case "-..." : sb.append("B"); break;
                case "-.-." : sb.append("C"); break;
                case "-.." : sb.append("D"); break;
                case "." : sb.append("E"); break;
                case "..-." : sb.append("F"); break;
                case "--." : sb.append("G"); break;
                case "...." : sb.append("H"); break;
                case ".." : sb.append("I"); break;
                case ".---" : sb.append("J"); break;
                case "-.-" : sb.append("K"); break;
                case ".-.." : sb.append("L"); break;
                case "--" : sb.append("M"); break;
                case "-." : sb.append("N"); break;
                case "---" : sb.append("O"); break;
                case ".--." : sb.append("P"); break;
                case "--.-" : sb.append("Q"); break;
                case ".-." : sb.append("R"); break;
                case "..." : sb.append("S"); break;
                case "-" : sb.append("T"); break;
                case "..-" : sb.append("U"); break;
                case "...-" : sb.append("V"); break;
                case ".--" : sb.append("W"); break;
                case "-..-" : sb.append("X"); break;
                case "-.--" : sb.append("Y"); break;
                case "--.." : sb.append("Z"); break;
                case ".----" : sb.append("1"); break;
                case "..---" : sb.append("2"); break;
                case "...--" : sb.append("3"); break;
                case "....-" : sb.append("4"); break;
                case "....." : sb.append("5"); break;
                case "-...." : sb.append("6"); break;
                case "--..." : sb.append("7"); break;
                case "---.." : sb.append("8"); break;
                case "----." : sb.append("9"); break;
                case "-----" : sb.append("0"); break;
                case "--..--" : sb.append(","); break;
                case ".-.-.-" : sb.append("."); break;
                case "..--.." : sb.append("?"); break;
                case "---..." : sb.append(":"); break;
                case "-....-" : sb.append("-"); break;
                case ".--.-." : sb.append("@"); break;

            }
        }

        System.out.println(sb);



    }
}

