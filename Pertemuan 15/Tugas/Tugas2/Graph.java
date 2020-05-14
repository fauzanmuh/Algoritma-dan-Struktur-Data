package Tugas2;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for(int i=0; i <vertex ; i++){
            list[i]= new LinkedList();
        }
    }
    
    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back edge (for undirected)
        list[destination].addFirst(source);
    } 
    
    public void degree (int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        //degree directed graph
            //inDegree
        int k,totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++) {
        for(int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j)==source) 
                    ++totalIn;
                
            }
        for(k = 0; k < list[source].size(); k++) {
            list[source].get(k);
        }
        totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("degree vertex "+source +" : "+(totalIn+totalOut));
    }
    
    public void removeEdge (int source,int destination) throws Exception {
        for(int i = 0; i < vertex; i++) {
            if(1==destination) {
                list[source].remove(destination);                
            }
        }
    }
    
    public void removeAllEdge() {
        for(int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception {
        for(int i = 0; i < vertex; i++) {
            if(list[i].size()>0) {
                System.out.print("vertex "+ i + " terhubung dengan: ");
            for(int j = 0; j < list[i].size(); j++) { 
                System.out.print(list[i].get(j) + " ");  
            }
            System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public boolean graphType(int num) { 
        if(num == 0) { 
            return false; 
        } 
        else if (num == 1) { 
            return true; 
        }
        else { 
            return true; 
        } 
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        
        System.out.print("Input Graph type (0 = directed, 1 = undirected) : ");
        int pill = sc.nextInt();
        System.out.println(graph.graphType(pill));
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
        
        String pil;
        do {
            System.out.println("Input : <source> <destination>");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            do {
               System.out.print("Another one (y/n) : ");
               pil = sc.next();
               if(!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) {
                  System.out.println("Input False"); 
               }
            } 
            while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
        }
        while (pil.equalsIgnoreCase("y"));
        graph.printGraph();
    }
}