import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    
    private static class Sing implements Comparable<Sing>{
		
		int seq;
		int play;
		int totalPlay;
		String genres;
		
		public Sing(int seq, int play, int totalPlay, String genres) {
			this.seq = seq;
			this.play = play;
			this.totalPlay = totalPlay;
			this.genres = genres;
		}
		
        @Override
        public int compareTo(Sing o) {
        	
        	if(this.totalPlay != o.totalPlay) return o.totalPlay - this.totalPlay;
        	else if(this.play != o.play) return o.play - this.play;
        	else return Integer.compare(this.seq, o.seq);
        }
	}
    
    public int[] solution(String[] genres, int[] plays) {
		
        Map<String, Integer> map = new HashMap<>();
		PriorityQueue<Sing> pq = new PriorityQueue<>();
		for(int i = 0; i < genres.length; i++) map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
		
		for(int i = 0; i < genres.length; i++) {
			
			int seq = i;
			int play = plays[i];
			int totalPlay = map.get(genres[i]);
			
			pq.add(new Sing(seq, play, totalPlay, genres[i]));
		}

		List<Integer> list = new ArrayList<>();
		Sing sing = pq.poll();
		list.add(sing.seq);
		String prev = sing.genres;
		int cnt = 0;
		while(!pq.isEmpty()) {
			sing = pq.poll();
			if(prev.equals(sing.genres)) cnt++;
			else cnt = 0;
			prev = sing.genres;
			if(cnt < 2) list.add(sing.seq);
			
		}

		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}