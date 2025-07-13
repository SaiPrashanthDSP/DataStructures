package Graphs;

import Strings.PrintData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {

    static int[] getTheShortestPath(ArrayList<ArrayList<Integer>> list,
                                    int startingVertex, int[] distances) {
        boolean[] visited = new boolean[6];
        distances[startingVertex] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startingVertex);
        visited[startingVertex] = true;
        while (!queue.isEmpty()) {
            int number = queue.poll();
            for(int num: list.get(number)) {
                if(!visited[num]) {
                    distances[num] = 1+distances[number];
                    queue.add(num);
                    visited[num] = true;
                }
            }
        }

     return distances;
    }
    public static void main(String []args) {
        int[] dis = getTheShortestPath(AdjacencyListRepresentation.getGraphData(),0,new int[6]);
        for(int num : dis) {
            PrintData.printData(num);
        }
    }
}
