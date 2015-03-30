package Graphs;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by ggorantla on 3/29/2015.
 */
public class Graph {
    private int V;
    private ArrayList<ArrayList<Integer>> neighbors ;
    
    Graph(int x){
        this.V = x;
        this.neighbors = new ArrayList<ArrayList<Integer>>();
        System.out.println(this.V);
        System.out.println(this.neighbors.size());
        for (int i = 0; i < x; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            this.neighbors.add(temp);
        }
        System.out.println(this.neighbors.size());
    }
    public void addEdge(int v, int w){
        this.neighbors.get(v).add(w);
    }
    
    public void printGraph(){
        for (int i = 0; i < this.V; i++) {
            ArrayList<Integer> temp = this.neighbors.get(i);
            System.out.print("For vertex " + String.valueOf(i) +" : ");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(String.valueOf(temp.get(j)) + " ,");

            }
            System.out.println();
        }
    }
    @Override
    public String toString(){
        

        return this.V +" " + this.neighbors;
    }

}