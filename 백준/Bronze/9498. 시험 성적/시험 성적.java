import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test24();
	}

	public static void test24() {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a >= 90){
            System.out.println('A');
        } else if(a >= 80) {
        	System.out.println('B');
        } else if(a >= 70) {
        	System.out.println('C');
        } else if(a >= 60) {
        	System.out.println('D');
        } else {
        	System.out.println('F');
        }
	}
}
