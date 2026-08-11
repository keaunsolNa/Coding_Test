import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] Birth = br.readLine().split(" ");
		String[] Date = br.readLine().split(" ");

		int BirthYear = Integer.parseInt(Birth[0]);
		int BirthMonth = Integer.parseInt(Birth[1]);
		int BirthDay = Integer.parseInt(Birth[2]);

		int DateYear = Integer.parseInt(Date[0]);
		int DateMonth = Integer.parseInt(Date[1]);
		int DateDay = Integer.parseInt(Date[2]);

		int age = DateYear - BirthYear;
		
		if(BirthYear == DateYear) {
			System.out.println(age);
		}else{
			if(BirthMonth > DateMonth) {
				System.out.println(age - 1);
			}else if(BirthMonth == DateMonth){
				if(BirthDay <= DateDay) {
					System.out.println(age);
				}else {
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
		
	}
}
