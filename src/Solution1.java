import java.util.HashSet;
import java.util.Set;


public class Solution1 {
	
	
	public String solution(int A, int B, int C, int D) {
        // write your code in Java SE 8
		if(A<0 || B<0 || C<0 ||D<0)return "NOT POSSIBLE";
		StringBuilder sb=new StringBuilder();
		sb.append("");
		sb.append(A);
		sb.append(B);
		sb.append(C);
		sb.append(D);
		String str = sb.toString();
		
		
		Set<String> numbers = Solution1.permutations(str);
		Set<Integer> final_numbers = new HashSet<Integer>();
		for(String string:numbers)
		{
			int num=Integer.parseInt(string);
			if(num<2400)
			{
				int hours=Integer.parseInt(string.substring(0, 2));
				int min = Integer.parseInt(string.substring(2, 4));
				
				if(hours<24 && min<60 && hours>=0)
				{
					final_numbers.add(hours*100 + min*1);
				}
				
			}
		}
		int max=0;
		for(Integer number:final_numbers)
		{
			
			if(max<number)max=number;
			
		}
		
		StringBuffer result = new StringBuffer();
		result.append("");
		result.append(max/100);
		result.append(":");
		result.append(max%100);
		String highest=new String(result);
		if(!(highest.equalsIgnoreCase("0:0")))
		return new String(result);
		else
			return "NOT POSSIBLE";
    }
	
	public static Set<String> permutations(String str) {
		Set<String> result = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			result.add("");
			return result;
		}
 
		char first = str.charAt(0);
		String substring = str.substring(1);
		Set<String> numbers = permutations(substring);
		for (String newString : numbers) {
			for (int i = 0; i <= newString.length(); i++) {
				result.add(addNumber(newString, first, i));
			}
		}
		return result;
	}
 
	public static String addNumber(String str, char c, int j) {
		String initial_String = str.substring(0, j);
		String remaining_String = str.substring(j);
		return initial_String + c + remaining_String;
	}

	public static void main(String args[])
	{
		Solution1 object = new Solution1();
		
		String str = object.solution(23,1,1,3);
		System.out.println(str);
	}

}
