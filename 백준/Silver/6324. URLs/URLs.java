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

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

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
}
