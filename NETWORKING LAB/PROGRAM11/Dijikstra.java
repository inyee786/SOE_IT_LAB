//To implement the following routing algorith a dijikstra


import java.io.*;

public class Dijikstra
{
	public void main(String args[])throws IOException
	{
	InputStreamReader ab =   InputStreamReader(System.in);
	   BufferedReader in = new BufferedReader(ab);
	   int i,j;
	   System.out.println("eneter the number of node");
	   int n = Integer.parseInt(in.readLine());
	   int arr[][] = new int[n][n];
	   System.out.println("eneter the adjancy matrix");
	   for(i=0;i<n;i++)
	   {
	      System.out.println("enter the row" + i+1);
	      for(j=0;j<n;j++)
	      {
	            arr[i][j] = Integer.parseInt(in.readLine());
	      }
	   }
	   System.out.println("enter the final matrix");
	   int fin = Integer.parseInt(in.readLine());

	   eval(arr,0,n,fin);
	}


	public static void eval(int graph[][],int src,int n,int fin)
	{
	   int v=n;
	   int dist[] = new int[v];
	   boolean spt[]=new boolean[v];
	   int i,j,k;
	   for(i=0;i<v;i++)
	   {
     dist[i]=Integer.MAX_VALUE;
     spt[i]=false;
     	   }
     	   dist[0]=0;
     	   for(int count =0;count<v-1;count++)
     	   {
     	   int u=minDist(dist,spt);
     	   spt[u]=true;
     	   for(k=0;k<v;k++)
     	   
     	      if(!spt[k] && graph[u][k]!=0&&dist[u]!=Integer.MAX_VALUE
     	      	  && dist[u]+graph[u][k] < dist[k])
     	      	dist[k]=dist[u]+graph[u][k];
     	   }
     	   }
     	   printsol(dist,fin);

	}
	public static int minDist(int dist[],boolean spt[]){
		int min=Integer.MAX_VALUE;
		int mindex=0;
		for(int i=0; i<dist.length;i++){
			if(spt[i]==false && dist[i]<=min){
				min = dist[i];
				mindex=i;
			}
		}return mindex;
	}
	public static void printsol(int dist[] ,int fin){
		System.out.println("distance of destination from source");
		int temp;
		System.out.println(dist[fin]);
	}
	
}