import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {
    
    private static final int BACK = 1;
    private static final int FRONT = 2;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Function<String,Integer> stoi = Integer::parseInt;
        int n = stoi.apply(br.readLine());
        Deque<Character> deque = new ArrayDeque();
        Deque<Integer> command = new ArrayDeque();
        
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = stoi.apply(st.nextToken());
            if(type == 3){
                if(deque.isEmpty()){
                    continue;
                }
                int tempType = command.pollFirst();
                if(tempType == FRONT){
                    deque.pollFirst();
                }else{
                    deque.pollLast();
                }
                continue;
            }
            char ch = st.nextToken().charAt(0);
            if(type == FRONT){
                deque.addFirst(ch);
            }else{
                deque.addLast(ch);
            }
            command.addFirst(type);
        }
        
        StringBuilder sb = new StringBuilder();
        if(deque.isEmpty()){
            System.out.println('0');
            return;
        }
        
        while(!deque.isEmpty()){
            sb.append(deque.pollFirst());
        }
        
        System.out.println(sb.toString());
    }
}