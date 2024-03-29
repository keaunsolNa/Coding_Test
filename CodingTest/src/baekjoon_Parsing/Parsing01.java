package baekjoon_Parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing01 {

	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 1942번 - 디지털시계
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			
			String[] t = br.readLine().split(" ");
			int[] st = stringToIntArray(t[0].split(":"));
			int[] et = stringToIntArray(t[1].split(":"));
			int sti = timeCounter(st, false);
			int eti = timeCounter(et, false);
			int count = 0;
			
			while (sti != eti) {

				if (sti % 3 == 0) count++;
				sti = timeCounter(st, true);
			}
			
			count += (eti % 3 == 0) ? 1 : 0;
			System.out.println(count);
			
		}
		
	}

	private static int[] stringToIntArray(String[] strArr) {
		
	    int[] intArr = new int[strArr.length];
	    for (int i = 0; i < strArr.length; i++) intArr[i] = Integer.parseInt(strArr[i]);
	    return intArr;
	    
	}
		
	private static int timeCounter(int[] tArr, boolean convert) {
		
	    if (convert) {
	    	
	    	tArr[2] += 1;
	        
	    	if (tArr[2] == 60) {
	            tArr[2] = 0;
	            tArr[1] += 1;
	        }
	        
	    	if (tArr[1] == 60) {
	            tArr[1] = 0;
	            tArr[0] += 1;
	    	}

	    	if (tArr[0] == 24) {
	            tArr[0] = 0;
	        }
	    	
	    }

	    StringBuilder sb = new StringBuilder();
	    for (int time : tArr) sb.append(time < 10 ? "0" + time : time);
	    
	    return Integer.parseInt(sb.toString());
	}
	
	// 2870번 - 수학숙제 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i, j, n = Integer.parseInt(br.readLine());
		ArrayList<BigInteger> list = new ArrayList<>();
		String line[];
		
		for(i = 0; i < n; i++) {
			line = br.readLine().split("\\D");
			
			for(j = 0; j < line.length; j++)
				if(!line[j].equals("")) list.add(new BigInteger(line[j]));
			
		}
		
		list.sort(null);
		n = list.size();
		for(i = 0; i < n; i++) sb.append(list.get(i) + "\n");
		
		System.out.println(sb.toString());
		
	}
	
	// 22233번 - 가희와 키워드
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < N; i++) set.add(br.readLine());
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), ",");

			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				if(set.contains(token)) set.remove(token);
			}
			
			System.out.println(set.size());
		}
	}
	
	// 6324번 - URLs
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
        Pattern pProtocol = Pattern.compile("^\\w+:\\/\\/");
        Pattern pHost = Pattern.compile("\\/\\/[\\w\\.\\-]+");
        Pattern pPort = Pattern.compile("\\:\\d+");
        Pattern pPath = Pattern.compile("\\/(\\/)?[\\w]+");
		
        for (int i = 1; i <= T; i++) {
        	
            String str = br.readLine();
            String protocol = "<default>";
            String host = "<default>";
            String port = "<default>";
            String path = "<default>";

            Matcher mProtocol = pProtocol.matcher(str);
            Matcher mHost = pHost.matcher(str);
            Matcher mPort = pPort.matcher(str);
            Matcher mPath = pPath.matcher(str);

            if (mProtocol.find()) protocol = mProtocol.group().substring(0, mProtocol.group().length() - 3);
            

            if (mHost.find()) host = mHost.group().substring(2);
            

            if (mPort.find()) port = mPort.group().substring(1);
            

            mPath.find();
            if (mPath.find()) path = str.substring(mPath.start() + 1);
            

            sb.append("URL #" + i
                    + "\n" + String.format("%-8s", "Protocol") + " = " + protocol
                    + "\n" + String.format("%-8s", "Host") + " = " + host
                    + "\n" + String.format("%-8s", "Port") + " = " + port
                    + "\n" + String.format("%-8s", "Path") + " = " + path + "\n\n");
        }
        
		System.out.println(sb);
	}
	
	// 9324번 - 진짜 메시지
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			boolean chk = true;
			int cnt[] = new int[26];
			
			for(int i = 0; i < input.length(); i++) {
				
				int idx = input.charAt(i) - 'A';
				cnt[idx] ++;
				
				if(cnt[idx] == 3) {
					
					if(i == input.length() - 1 || input.charAt(i + 1) != input.charAt(i)) {
						chk = false;
						break;
					}
					
					cnt[idx] = 0;
					i++;
				}
			
			}
			
			if(chk) System.out.println("OK");
			else System.out.println("FAKE");
		}
		
	}
	
	// 5637번 - 가장 긴 단어
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		String ans = "";
		
		while(true) {
			
			String[] str = br.readLine().toLowerCase().split("[^a-z-]");
			boolean chk = false;
			for (String string : str) {
				if(string.equals("e-n-d")) {
					chk = true;
					break;
				}
				
				if(max < string.length()) {
					ans = string;
					max = string.length();
				}
			}
			
			if(chk) {
				System.out.println(ans);
				return;
			}
		}
		
	}
	
	// 9536번 - 여우는 어떻게 울지?
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			ArrayList<String> list = new ArrayList<>();
			String[] say = br.readLine().split(" ");
			
			for(int i = 0; i < say.length; i++) list.add(say[i]);
			
			String input = "";
			
			ArrayList<String> remove = new ArrayList<>();
			while(!(input = br.readLine()).equals("what does the fox say?")) {
				
				String saying = input.split(" ")[2];
				remove.add(saying);
				
			}
			
			list.removeAll(remove);
	
			for (String string : list) System.out.print(string + " ");
		}
		
	}
	
	// 26562번 - Presidents
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String[] input = br.readLine().split(" ");
			
			long money = 0;
			for(int i = 0; i < input.length; i++) {
				money += (input[i].equals("Franklin") ? 100 : input[i].equals("Grant") ? 50 : input[i].equals("Jackson") ? 20 : input[i].equals("Hamilton") ? 10 : input[i].equals("Lincoln") ? 5 : 1);
			}
			
			System.out.println("$" + money);
		}
	}
	
	// 26584번 - Playtime
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String[] input = br.readLine().split(",");
			String name = input[0];
			long min = Long.parseLong(input[1]);
			
			int year = (int)min / 525600;
			min = min - (525600 * year);
			int day = (int)min / 1440;
			min = min - (1440 * day);
			int hour = (int)min / 60;
			min = min % 60;
			
			String ans = "";
			if(year > 0) ans += year + " year(s) ";
			if(day > 0) ans += day + " day(s) ";
			if(hour > 0) ans += hour + " hour(s) ";
			if(ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') ans += (min + " minute(s)");
			else ans += (min + " minute(s)");
			
			System.out.println(name + " - " + ans);
			
		}
		
	}
	
	// 1340번 - 연도 진행바
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		
		int[] monthArr= leapYear(tmp[2]);
		String[] month_name = {"0","January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		int month = 0;

		for(int i = 1; i < month_name.length; i++) 
			if(tmp[0].equals(month_name[i])) month = i;
		

		int date = Integer.parseInt(tmp[1].substring(0,2));
		
		String[] split = tmp[3].split(":");
		int hour = Integer.parseInt(split[0]);
		int minute = Integer.parseInt(split[1]);
		
		int sum_date = 0;
		for(int i = 1; i < month; i++) sum_date += monthArr[i];
		
		sum_date += date - 1;
		sum_date = sum_date * 1440;		
		
		int sum_hour = hour * 60;
		
		int sum = sum_date + sum_hour + minute;
		
		
		if(monthArr[2] == 28) System.out.println((double) sum / (double) 525600 * 100);
		else System.out.println((double) sum / (double) 527040 * 100);
	}
	

	public static int[] leapYear(String string_year) {
	
		int year = Integer.parseInt(string_year);
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) month[2] = 29;
		return month;
		
	}
	
}
