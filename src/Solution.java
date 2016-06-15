import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner in = new Scanner(System.in);
    	    int numChapters = in.nextInt();
    	    int maxProblems = in.nextInt();
    	    int numProblems = 0;
    	    int page = 0;
    	    int special = 0;
    	    for (int chapter = 1; chapter <= numChapters; chapter++) {
    	        page++;
    	        numProblems = in.nextInt();
    	        for (int problem = 1; problem <= numProblems; problem++) {
    	            if (problem == page)
    	                special++;
    	            if (problem % maxProblems == 0 && problem < numProblems)
    	                page++;

    	        }
    	    }
    	    System.out.println(special);
}
}