package programs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConverter {

    public static void main(String[] args) {
    	String time = "12:45:54PM";
       // Scanner in = new Scanner(System.in);
       // String time = in.next();
        String tokens[]= time.split(":");
        int time_12 = Integer.parseInt(tokens[0]);
        
        if(tokens[2].contains("PM"))
        {
        	if(time_12<12)
        	System.out.println((time_12+12)+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        	else
        		System.out.println((time_12)+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        	
        }
        else if(tokens[2].contains("AM")){
        	if(time_12 != 12 && time_12 !=0)
        		if(time_12>10)
        			System.out.println((time_12)+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        		else
        			System.out.println("0"+(time_12)+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        	else
        		if(time_12 == 12)
        			System.out.println((time_12-12)+"0"+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        	if(time_12 == 0)
    			System.out.println((time_12)+"0"+":"+tokens[1]+":"+tokens[2].charAt(0)+tokens[2].charAt(1));
        }
    }
}
