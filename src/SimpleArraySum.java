import java.io.*;
import java.util.*;
public class SimpleArraySum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens())
			sum += Integer.parseInt(st.nextToken());
		System.out.println(sum);

	}

}
