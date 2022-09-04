package codingTestLevel2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Lessons38 {

	public static void main(String[] args) {

		Lessons38 lessons36 = new Lessons38();
		int[] fees = {1, 461, 1, 10};
		String[] records = {"00:00 1234 IN"};
		int[] answer = lessons36.solution(fees, records);

		for (int i : answer) {
			System.out.println("ANSER : " + i);
		}
		
	}
	 
	public int[] solution(int[] fees, String[] records) {
		
//		주차장의 요금표와 차량이 들어오고(입차) 나간(출차) 기록이 주어졌을 때, 차량별로 주차 요금을 계산하려고 합니다. 
//		주차 요금을 나타내는 정수 배열 fees, 자동차의 입/출차 내역을 나타내는 문자열 배열 records가 매개변수로 주어집니다. 
//		차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
		
		Map<String, String> recordsMap = new LinkedHashMap<>();
		for (int i = 0; i < records.length; i++) {
			String[] strarr = records[i].split(" ");
			String temp ="";
			if(recordsMap.containsKey(strarr[1])) {
				temp += " " + strarr[0] + strarr[2];
				recordsMap.put(strarr[1], recordsMap.get(strarr[1]) + temp);
			} else {
				temp += strarr[0] + strarr[2];
				recordsMap.put(strarr[1], temp);
			}
		}
		
		Collection k = recordsMap .keySet();
		Iterator itr = k.iterator();

		Map<String, Integer> returnMap = new LinkedHashMap<>();
		
		while(itr.hasNext()){
			String temp = (String) itr.next();
			int totalPay = time(recordsMap.get(temp), fees);
			returnMap.put(temp, totalPay);
		}
		
		Map<String, Integer> sortedMap = new TreeMap<>(returnMap);
		int[] answer = new int[sortedMap.size()];
		Collection p = sortedMap .values();
		Iterator itr2 = p.iterator();
		int cnt = 0;
		
		while(itr2.hasNext()) {
			int pay = (int)(itr2.next());
			answer[cnt] = pay;
			cnt++;
		}
		
		System.out.println(sortedMap);
		
		return answer;
	 
	}    
	
	private int time(String value, int[] fees) {
		String[] arr = value.split(" ");
		List<String> timeValue = new ArrayList<>();
		int totalPay = 0;
		double spandTime = 0;
		
		for (String string : arr) {
			timeValue.add(string);
		}
		
		for(int i = 0; i < timeValue.size(); i++) {
			if(i == timeValue.size()-1) {
				int outTime = 1439;
				int inTime = Integer.parseInt(timeValue.get(i).substring(0, 2))*60 + Integer.parseInt(timeValue.get(i).substring(3, 5));
				spandTime += outTime - inTime;
			} else {
				int outTime = Integer.parseInt(timeValue.get(i+1).substring(0, 2))*60 + Integer.parseInt(timeValue.get(i+1).substring(3, 5));
				int inTime = Integer.parseInt(timeValue.get(i).substring(0, 2))*60 + Integer.parseInt(timeValue.get(i).substring(3, 5));
				spandTime += outTime - inTime;
				i++;
			}
		}
		
		totalPay = pay(spandTime, fees);
		
		return totalPay;
	}

	private int pay(double spandTime, int[] fees) {
		
		double basicTime = fees[0];
		int basicRate = fees[1];
		double unitTime = fees[2];
		int unitRate = fees[3];
		
		System.out.println("TIME : " + spandTime);
		System.out.println("basicTime : " + basicTime);
		
		if(spandTime < basicTime) {
			return basicRate;
		} else {
			return basicRate + (int)Math.ceil((spandTime-basicTime)/unitTime)* unitRate;
		}
		
	}


}
	