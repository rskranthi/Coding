package programs;

public class AngryProfessor {
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int t = in.nextInt();
		int t=4;
        for(int a0 = 0; a0 < t; a0++){
        	int n = 100;
        	int no_of_fives=0,no_of_threes = 0;
        	if(n==1)
        		System.out.println("-1");
        	if(n==3)
        		System.out.println("555");
        	else if(n==5)
        		System.out.println("33333");
        	else
        	{
          for (int i=n;i>1;i=i-1){
        	  for(int j=1;j<n;j=j+1)
        	  {
        		  if(i%5 == 0 && j%3 == 0 && (i+j) == n )
        		  {
        			  no_of_threes = j;
        			  no_of_fives = i;
        			  break;
        			  
        		  }
        		  if(no_of_threes>0 && no_of_fives>0)break;
        	  }
        	  if(no_of_threes>0 && no_of_fives>0)break;
          }
        	}
         // System.out.println(no_of_threes);
          if(!(no_of_threes == 0 && no_of_fives == 0)){
        	  
          
          StringBuilder sb = new StringBuilder("");
          for(int k=0;k<no_of_fives;k++)
          {
        	  sb.append(5);
          }
          for(int k=0;k<no_of_threes;k++)
          {
        	  sb.append(3);
          }
          
          System.out.println(sb);
          }
          
        	  
        }
    }
}

