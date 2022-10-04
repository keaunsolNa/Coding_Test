package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Implement01 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// N 찍기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N  = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		
	}

	// 등록
	public static void test02() {
		System.out.println(188);
		System.out.println("knsol1992");
	}
	
	// 오늘 날짜
	public static void test03() {
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}
	
	// 마이크로소프트 로고
	public static void test04() {
        System.out.println("       _.-;;-._");
        System.out.println("'-..-'|   ||   |");
        System.out.println("'-..-'|_.-;;-._|");
        System.out.println("'-..-'|   ||   |");
        System.out.print("'-..-'|_.-''-._|");
	}
	
	// 고려대는 사랑입니다.
	public static void test05() {
		System.out.println("고려대학교");
	}
	
	// 웰컴
	public static void test06() {
		System.out.println(".  .   .");
		System.out.println("|  | _ | _. _ ._ _  _");
		System.out.println("|/\\|(/.|(_.(_)[ | )(/.");
	}
	
	// 스타워즈 로고
	public static void test07() {
		System.out.println("    8888888888  888    88888");
		System.out.println("   88     88   88 88   88  88");
		System.out.println("    8888  88  88   88  88888");
		System.out.println("       88 88 888888888 88   88");
		System.out.println("88888888  88 88     88 88    888888");
		System.out.println("");
		System.out.println("88  88  88   888    88888    888888");
		System.out.println("88  88  88  88 88   88  88  88");
		System.out.println("88 8888 88 88   88  88888    8888");
		System.out.println(" 888  888 888888888 88  88      88");
		System.out.println("  88  88  88     88 88   88888888");
	}
	
	// 크냐?
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")) {
			
			int input1 = Integer.parseInt(input.split(" ")[0]);
			int input2 = Integer.parseInt(input.split(" ")[1]);
			
			if(input1 > input2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	// 콜센터
	public static void test09() {
        System.out.println("     /~\\\n" +
                "    ( oo|\n" +
                "    _\\=/_\n" +
                "   /  _  \\\n" +
                "  //|/.\\|\\\\\n" +
                " ||  \\ /  ||\n" +
                "============\n" +
                "|          |\n" +
                "|          |\n" +
                "|          |");
	}

	// 과제 안 내신 분..?
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= 30; i++) {
			arr.add(i);
		}
		
		int cnt = 0;
		
		while(!(cnt == 28)) {
			arr.remove(arr.indexOf(Integer.parseInt(br.readLine())));
			cnt++;
		}
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
	}
}
