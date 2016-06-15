package programs;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;


import java.util.*;

public final class Main {

	private Main()
    {
    } 

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc;
		
		while(true)
		{
					
		System.out.println("SELECT YOUR CHOICE 1.CONSOLE 2.TEXTFILE 3.EXIT ");
    	sc=new Scanner(System.in);
    	int players=0;
    	try{
    	switch(sc.nextInt())
    	{
    	
    	case 1 :players=sc.nextInt(); 
    			
    		    break;
    	           	
    	case 2 :File file = new File(args[0]);
    	        
    			sc = new Scanner(file);
    			while(sc.hasNextInt()){
    				
    			players=sc.nextInt();
    			System.out.println(players);
    			}
    	    	
    			break;
    	case 3: System.exit(0);
    	default: System.out.println("Please select valid input");
    	   			
	}
    	}catch (Exception e)
    	{
    		System.out.println("Exception message: " + e);
    	}
    	
    	
    	
    	
    	
}
	}
}



	

