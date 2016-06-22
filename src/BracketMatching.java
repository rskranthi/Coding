import java.util.Scanner;

public class BracketMatching {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i=0;
		int j=str.length();
		boolean flag=false;
		boolean flag2=false;
		int c1=0;
		int c2=0;
		while(i<str.length() && j>=i){
			if(!flag2){
				if(!flag){
					if(str.charAt(i)=='('){
						c1++;
						i++;
					}
					else{
						flag=true;
						j--;
					}
					
				}
				if(flag){
					if(str.charAt(j)==')'){
						c2++;
						j--;
					}
					else{
						flag=false;
						i++;
					}
					
				}
				if(c1==c2){
					flag2=true;
				}
			}
			else{
				if(str.charAt(i)==')'){
					i++;
				}
				else if(str.charAt(j)=='('){
					j--;
				}
				else{
					flag2=false;
				}
			}
			
			
		}
		
			System.out.println(i);
		
	}

}