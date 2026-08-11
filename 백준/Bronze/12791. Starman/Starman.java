import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("DavidBowie", 1967);
		map.put("SpaceOddity", 1969);
		map.put("TheManWhoSoldTheWorld", 1970);
		map.put("HunkyDory", 1971);
		map.put("TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", 1972);
		map.put("AladdinSane", 1973);
		map.put("PinUps", 1973);
		map.put("DiamondDogs", 1974);
		map.put("YoungAmericans", 1975);
		map.put("StationToStation", 1976);
		map.put("Low", 1977);
		map.put("Heroes", 1977);
		map.put("Lodger", 1979);
		map.put("ScaryMonstersAndSuperCreeps", 1980);
		map.put("LetsDance", 1983);
		map.put("Tonight", 1984);
		map.put("NeverLetMeDown", 1987);
		map.put("BlackTieWhiteNoise", 1993);
		map.put("1.Outside", 1995);
		map.put("Earthling", 1997);
		map.put("Hours", 1999);
		map.put("Heathen", 2002);
		map.put("Reality", 2003);
		map.put("TheNextDay", 2013);
		map.put("BlackStar", 2016);
		
		int Q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < Q; i++) {
			StringBuilder sb2 = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
	
			int cnt = 0;
			for(int j = S; j <= E; j++) {

				for (String key : map.keySet()) {
					if(map.get(key) == j) {
						sb2.append(j + " " + key);
						sb2.append("\n");
						cnt++;
					}
				}
				
			}
			sb.append(cnt + "\n" + sb2);
		
		}
		System.out.println(sb);
	}
}
