import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    while(n>0){
    String word1 = sc.nextLine();
    String word2 = sc.nextLine();
    
    HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
    for(int i=0;i<word1.length();i++){
    	if(!(hs.containsKey(word1.charAt(i))))
    		hs.put(word1.charAt(i),1);
    	else 
    		{
    			int value = hs.get(word1.charAt(i));
    			hs.put(word1.charAt(i), value+1);
    		}
		
    		
    	
    }
    boolean flag = false;
    for(int i=0;i<word2.length();i++){
    	
    
    	if((hs.containsKey(word2.charAt(i))) && flag == false)
    	{
    		flag = true;
    		System.out.println("YES");
            break;
    	}
    	
    }
    
    if(flag==false)System.out.println("NO");
		
    n--;		
    }
   
}
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    while(n>0){
    String word1 = sc.nextLine();
    String word2 = sc.nextLine();
    
    HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
    for(int i=0;i<word1.length();i++){
    	if(!(hs.containsKey(word1.charAt(i))))
    		hs.put(word1.charAt(i),1);
    	else 
    		{
    			int value = hs.get(word1.charAt(i));
    			hs.put(word1.charAt(i), value+1);
    		}
		
    		
    	
    }
    boolean flag = false;
    for(int i=0;i<word2.length();i++){
    	
    
    	if((hs.containsKey(word2.charAt(i))) && flag == false)
    	{
    		flag = true;
    		System.out.println("YES");
            break;
    	}
    	
    }
    
    if(flag==false)System.out.println("NO");
		
    n--;		
    }
   
}
    }