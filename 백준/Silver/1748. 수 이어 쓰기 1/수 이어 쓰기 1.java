import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int input = Integer.parseInt(br.readLine());
        int length = 0;
        for(int i = 1; i <= input; i++) {
        	if(i < 10) {
        		length++;
        	} else if(i < 100) {
        		length += 2;
        	} else if(i < 1000) {
        		length += 3;
        	} else if(i < 10000) {
        		length += 4;
        	} else if(i < 100000) {
        		length += 5;
        	} else if(i < 1000000) {
        		length += 6;
        	} else if(i < 10000000) {
        		length += 7;
        	} else if(i < 100000000) {
        		length += 8;
        	} else {
        		length += 9;
        	}
        }
        
        System.out.println(length);
	}
}
