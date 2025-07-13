package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSWithGivenVertex {

    static void traverseGraph(ArrayList<ArrayList<Integer>> list,int startingVertex , int totalNumberOfVertices) {
        boolean []visited = new boolean[totalNumberOfVertices+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startingVertex);
        visited[startingVertex] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex);
            for(int e:list.get(vertex)) {
                if(!visited[e]) {
                    queue.add(e);
                    visited[e] = true;
                }
            }
        }

    }
    public static void main(String [] args) {
        traverseGraph(AdjacencyListRepresentation.getGraphData(),0,5);
    }
}
