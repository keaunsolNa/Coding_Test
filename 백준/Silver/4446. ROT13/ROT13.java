import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		Integer[] lowerVowels = new Integer[] {97, 105, 121, 101, 111, 117};
		Integer[] lowerConsonant = new Integer[] {98, 107, 120, 122, 110, 104, 100, 99, 119, 103, 112, 118, 106, 113, 116, 115, 114, 108, 109, 102};
		Integer[] upperVowels = new Integer[] {65, 73, 89, 69, 79, 85};
		Integer[] upperConsonant = new Integer[] {66, 75, 88, 90, 78, 72, 68, 67, 87, 71, 80, 86, 74, 81, 84, 83, 82, 76, 77, 70};
		
		List<Integer> LV = new ArrayList<Integer>(Arrays.asList(lowerVowels)); 
		List<Integer> LC = new ArrayList<Integer>(Arrays.asList(lowerConsonant)); 
		List<Integer> UV = new ArrayList<Integer>(Arrays.asList(upperVowels)); 
		List<Integer> UC = new ArrayList<Integer>(Arrays.asList(upperConsonant)); 
		
		while((input = br.readLine()) != null) {
			
			for(int i = 0; i < input.length(); i++) {
				
				int temp = (int)input.charAt(i);
				if(temp > 96 && temp < 123) {
					
					if(temp == 97 || temp == 101 || temp == 105 || temp == 111 || temp == 117 || temp == 121) {
						int index = LV.indexOf(temp);
						
						if(index - 3 < 0) sb.append((char)(int)LV.get(index + 3));
						else sb.append((char)(int)LV.get(index - 3));
					}
					
					else {
						
						int index = LC.indexOf(temp);
						
						if(index - 10 < 0) sb.append((char)(int)LC.get(index + LC.size() - 10));
						else sb.append((char)(int)LC.get(index - 10));
					}
				}
				
				else if(temp > 64 && temp < 91){
					
					if(temp == 65 || temp == 73 || temp == 89 || temp == 69 || temp == 79 || temp == 85) {
						int index = UV.indexOf(temp);
						
						if(index - 3 < 0) sb.append((char)(int)UV.get(index + 3));
						else sb.append((char)(int)UV.get(index - 3));
					}
					
					else {
						
						int index = UC.indexOf(temp);
						
						if(index - 10 < 0) sb.append((char)(int)UC.get(index + UC.size() - 10));
						else sb.append((char)(int)UC.get(index - 10));
					}
				}
				
				else sb.append(input.charAt(i));
				
			}
		
			sb.append("\n");
		}		
		
		System.out.println(sb);
	}
}
