import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven",
        		"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
        		"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six",
        		"twenty seven","twenty eight","twenty nine"};
        
        if(m==0)System.out.println(words[h-1]+" "+"o"+"'"+" "+"clock");
        else if(m>0 && m<2)System.out.println(words[m-1]+" "+"minute past"+" "+words[h-1]);
        else if(m>=2 && m<15)System.out.println(words[m-1]+" "+"minutes past"+" "+words[h-1]);
        else if(m==15)System.out.println("quarter past"+" "+words[h-1]);
        else if(m>15 && m<30)System.out.println(words[m-1]+" "+"minutes past"+" "+words[h-1]);
        else if(m==30)System.out.println("half past"+" "+words[h-1]);
        else if(m>30 && m<45)System.out.println(words[60-m-1]+" "+"minutes to"+" "+words[h]);
        else if(m==45)System.out.println("quarter to"+" "+words[h]);
        else if(m>45 && m<59)System.out.println(words[60-m-1]+" "+"minutes to"+" "+words[h]);
        else if(m==59)System.out.println(words[60-m-1]+" "+"minute to"+" "+words[h]);
        else System.out.println("Invalid input");
        
        }
    }
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven",
        		"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
        		"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six",
        		"twenty seven","twenty eight","twenty nine"};
        
        if(m==0)System.out.println(words[h-1]+" "+"o"+"'"+" "+"clock");
        else if(m>0 && m<2)System.out.println(words[m-1]+" "+"minute past"+" "+words[h-1]);
        else if(m>=2 && m<15)System.out.println(words[m-1]+" "+"minutes past"+" "+words[h-1]);
        else if(m==15)System.out.println("quarter past"+" "+words[h-1]);
        else if(m>15 && m<30)System.out.println(words[m-1]+" "+"minutes past"+" "+words[h-1]);
        else if(m==30)System.out.println("half past"+" "+words[h-1]);
        else if(m>30 && m<45)System.out.println(words[60-m-1]+" "+"minutes to"+" "+words[h]);
        else if(m==45)System.out.println("quarter to"+" "+words[h]);
        else if(m>45 && m<59)System.out.println(words[60-m-1]+" "+"minutes to"+" "+words[h]);
        else if(m==59)System.out.println(words[60-m-1]+" "+"minute to"+" "+words[h]);
        else System.out.println("Invalid input");
        
        }
    }
