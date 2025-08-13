// Dijkstra's algorithm
import java.util.Scanner;
class Graph{
    int vertices;
    int matrix[][];
    
    Graph(int vertices)
    {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }
    public void addEdge(int src, int des, int weight)
    {
        if(src >= 0 && des >=0 && src < vertices && des < vertices)
        {
            matrix[src][des] = weight;
            matrix[des][src] = weight;
        }
    }
    public void dijkstra(int src)
    {
        int[] dis = new int[vertices];
        boolean[] visited = new boolean[vertices];
        for(int i = 0; i<vertices ; i++)
        {
            dis[i] = Integer.MAX_VALUE;
        }
        dis[src] = 0;
        for(int i = 0; i < vertices - 1; i++)
        {
            int u = -1;
            for(int j = 0; j < vertices ; j++)
            {
                if(!visited[j] && (u == -1 || dis[j] < dis[u]))
                {
                    u = j;
                }
            }
            visited[u] = true;
            for(int v = 0; v < vertices; v++)
            {
                if(!visited[v] && matrix[u][v] != 0 && dis[u] != Integer.MAX_VALUE && dis[u] + matrix[u][v] < dis[v])
                {
                    dis[v] = dis[u] + matrix[u][v];
                }
            }
        }
        System.out.println("Distances ");
            for( int i = 0; i < vertices ; i++)
            {
                System.out.println(i + " " + dis[i]);
            }
        
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ver = sc.nextInt();
		Graph g = new Graph(ver);
		for(int i = 0 ; i < ver; i++)
		{
		    for(int j = 0; j < ver; j++)
		    {
		        g.matrix[i][j]=sc.nextInt();
		    }
		}
		int src = sc.nextInt(); 
		g.dijkstra(src);
	}
}

Output
5
0 10 0 5 0
0 0 1 2 0
0 0 0 0 4
0 3 9 0 2
7 0 6 0 0
0
Distances 
0 0
1 8
2 9
3 5
4 7
