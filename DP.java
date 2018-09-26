public class DP
{
	public static int ShortestPath(int s,int t,int d[],int matrix[][])
	{    
		if(d[t]!=Integer.MAX_VALUE)
			return d[t];
		for(int i=0;i<matrix[0].length;i++)
		{
			if(matrix[i][t]!=0)
			{
				int temp=ShortestPath(s,i,d,matrix)+matrix[i][t];
				if(temp<d[t])
					d[t]=temp;
			}
		}
		return d[t];
	}
	
	public static void main(String[] args)
	{
		   int [][]graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                   {4, 0, 8, 0, 0, 0, 0, 11, 0},
                   {0, 8, 0, 7, 0, 4, 0, 0, 2},
                   {0, 0, 7, 0, 9, 14, 0, 0, 0},
                   {0, 0, 0, 9, 0, 10, 0, 0, 0},
                   {0, 0, 4, 14, 10, 0, 2, 0, 0},
                   {0, 0, 0, 0, 0, 2, 0, 1, 6},
                   {8, 11, 0, 0, 0, 0, 1, 0, 7},
                   {0, 0, 2, 0, 0, 0, 6, 7, 0}
                  };
		   int []d=new int[9];
		   for(int i=0;i<9;i++)
			   d[i]=Integer.MAX_VALUE;
		   d[0]=0;
		   for(int i=1;i<9;i++)
		   {
			   ShortestPath(0,i,d,graph);
		   }
		   
		   for(int i=0;i<9;i++)
			   System.out.println(d[i]);
		   
	}
}