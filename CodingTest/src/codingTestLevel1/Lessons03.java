package codingTestLevel1;

import java.util.HashMap;
import java.util.HashSet;

class Lessons03 {
	
	public static void main(String[] args) {
		
		Lessons03 lessons03 = new Lessons03();
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		lessons03.solution(id_list, report, k);
		
	}
	
	public int[] solution(String[] id_list, String[] report, int k) {
	        
		    int[] answer = {};
		    answer = new int[id_list.length];
		        
		    HashMap<String, HashSet<String>> reportedMap = new HashMap<>();
			HashMap<String, Integer> answerMap = new HashMap<>(); 

			for (int i = 0; i < id_list.length; i++) {
	            
				HashSet<String> reportingId = new HashSet<>(); 
				reportedMap.put(id_list[i], reportingId); 
				answerMap.put(id_list[i], 0); 
				System.out.println("TEST 1 : " + reportedMap);
			}
	        
			for (String s : report) {
				String[] reportSub = s.split(" ");
				String reportingID = reportSub[0]; 
				String reportedID = reportSub[1];
				reportedMap.get(reportedID).add(reportingID); 
				System.out.println("TEST 2 : " + reportedMap);
			}
	        
			for (String reportedUser : reportedMap.keySet()) { 
				HashSet<String> userForSend = reportedMap.get(reportedUser); 
				if (userForSend.size() >= k) { 
					for (String userId : userForSend) {
						answerMap.put(userId, answerMap.get(userId) + 1);
						System.out.println("TEST 3 : " + answerMap);
					}
				}
			}

			for (int i = 0; i < id_list.length; i++) {
				answer[i] = answerMap.get(id_list[i]);
				System.out.println("TEST 4 : " + answerMap);
			}

			return answer;
		}

	}
