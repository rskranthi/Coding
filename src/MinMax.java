package linkedlist;

public class MinMax {

	public static void main(String args[])
	{
		int[] array = {1000, 11, 445, 1, 330, 3000};
		
		int min=array[0],max=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			max = (max+array[i]+Math.abs(max-array[i]))/2;
			min = (min+array[i]-Math.abs(min-array[i]))/2;
		}
		
		System.out.println("minimum="+min);
		System.out.println("maximum="+max);
		
	}
}
