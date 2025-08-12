//Graph
import java.util.*;
class graph
{
    int vertices;
    int matrix[][];
    graph(int vertices)
    {
        this.vertices = vertices;
        matrix = new int [vertices][vertices];
    }
    public void addEdge(int sor, int des)
    {
        if(sor>=0 && des>=0 && sor<vertices && des< vertices)
        {
            matrix[sor][des] = 1;
            matrix[des][sor] = 1;
        }
    }
    public void removeEdge(int sor, int des)
    {
        if(sor>=0 && des>=0 && sor<vertices && des< vertices)
        {
            matrix[sor][des] = 0;
            matrix[des][sor] = 0;
        }
    }
    public void dfs(int start)
    {
        boolean visit[] = new boolean[vertices];
        dfsHelp(visit,start);
    }
    public void dfsHelp(boolean visit[], int start)
    {
        visit[start] = true;
        System.out.print(start);
        for(int i=0;i<vertices;i++)
        {
            if(matrix[start][i] == 1 && !visit[i])
            {
                dfsHelp(visit, i);
            }
        }
    }
    public void bfs(int start)
    {
        boolean visit[] = new boolean[vertices];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visit[start] = true;
        while(!q.isEmpty())
        {
            int t = q.poll();
            System.out.print(t+" ");
            for(int i=0;i<vertices;i++)
            {
                if(matrix[t][i]==1 && !visit[i])
                {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }
     public void displayMatrix() 
    {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) 
        {
            for (int j = 0; j < vertices; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int ver = sc.nextInt();
		graph g = new graph(ver);
		int edges = sc.nextInt();
		for (int i = 0; i < edges; i++) 
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            g.addEdge(source, destination); 
        }
        g.displayMatrix() ;
        System.out.println();
		g.dfs(0);
		System.out.println();
		g.bfs(0);
	}
}

//Output
5
6
0 1
0 2
1 2
1 3
2 4
3 4
Adjacency Matrix:
0 1 1 0 0 
1 0 1 1 0 
1 1 0 0 1 
0 1 0 0 1 
0 0 1 1 0 

01243
0 1 2 3 4 
