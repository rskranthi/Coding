package linkedlist;

public class MinMax2 {

	Pair result=new Pair();
	static class Pair
	{
		public int min,max;
		
		Pair()
		{
			this.min=0;
			this.max=0;
		}
		
		
	}
	
	public Pair findMinMax(int[] array)
	{
		
		int i;
		int n=array.length;
		
		if(n%2==0)
		{
			if(array[0]>array[1]){
			result.min=array[0];
			result.max=array[1];}
			
			else
			{
				result.max=array[0];
				result.min=array[1];
			}
			
			i=2;
		}
		else
		{
			result.min=array[0];
			result.max=array[0];
			i=1;
		}
		
		while(i<n-1)
		{
			if(array[i]>array[i+1]){
				
				if(array[i]>result.max)
					result.max=array[i];
				if(array[i+1]<result.min)
					result.min=array[i+1];
			}
			else
			{
				if(array[i+1]>result.max)
					result.max=array[i+1];
				if(array[i]<result.min)
					result.min=array[i];
			}
			
			i+=2;
		}
		
		
		
		
		
		return result;
	}
	
	
	public static void main(String args[])
	{
		  int arr[] = {1000, 11, 445, 1, 330, 3000};
		 		 MinMax2 result=new MinMax2();	  
		 		 Pair pair=new Pair();
		 		 pair=result.findMinMax(arr);
				 
		  System.out.println("Minimum element is"+pair.min);
		  System.out.println("Maximum element is"+pair.max);
	}
}
