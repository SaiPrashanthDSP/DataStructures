package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfGraphs {

    static int countNumberOfGraphs(ArrayList<ArrayList<Integer>> graphData ) {
        boolean[] visited = new boolean[graphData.size()];
        int count = 0;
        for(int i = 0;i< graphData.size();i++) {
            if(!visited[i]) {
                count++;
                traverseGraph(graphData,i,visited);
            }
        }
        return count;
    }

    static void traverseGraph(ArrayList<ArrayList<Integer>> graphData,
                              int startingVertex, boolean []visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startingVertex);
        visited[startingVertex] = true;
        while(!queue.isEmpty()) {
            int num = queue.poll();
            System.out.println(num);
            for(int ele: graphData.get(num)) {
               if(!visited[ele]) {
                   queue.add(ele);
                   visited[ele] = true;
               }

            }
        }


    }

    public static void main(String []args) {
        ArrayList<ArrayList<Integer>> graphData = AdjacencyListRepresentation.getGraphData();
        System.out.println(countNumberOfGraphs(graphData));

    }
}
