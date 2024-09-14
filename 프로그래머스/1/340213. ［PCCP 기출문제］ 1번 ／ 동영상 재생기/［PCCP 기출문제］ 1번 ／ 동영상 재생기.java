class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int videoSecond = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        int posSecond = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int opSSecond = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int opESecond = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
        
        if (posSecond >= opSSecond && posSecond <= opESecond)
        {
            posSecond = opESecond;
        }
        for (String com : commands)
        {
            switch(com)
            {
                    
                case "prev" : 
                    
                    posSecond = Math.max(0, posSecond - 10);
                    
                    if (posSecond >= opSSecond && posSecond <= opESecond)
                    {
                        posSecond = opESecond;
                    }
                    
                    break;
                    
                case "next" :
                    
                    posSecond = Math.min(videoSecond, posSecond + 10);
                    
                    if (posSecond >= opSSecond && posSecond <= opESecond)
                    {
                        posSecond = opESecond;
                    }
                    
                    break;
            }
            
        }
        
        String answer = (posSecond / 60 < 10 ? "0" + (posSecond / 60) : posSecond / 60) + ":" + 
                        (posSecond % 60 < 10 ? "0" + (posSecond % 60) : posSecond % 60);
        
        return answer;
    }
}