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
		test18();
	}

	public static void test18() {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%4 == 0 && a%100 != 0){
            System.out.println(1);
        } else if(a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
	}
}
