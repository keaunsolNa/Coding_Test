import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test08();
	}

	public static void test08()  {
		LocalDate now = LocalDate.now();
		String[] temp = (now+"").split("-");
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
	}
}
