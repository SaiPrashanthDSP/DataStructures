package Graphs;

import Strings.PrintData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckUnweightedCyclic {

    static boolean isGraphCyclic(ArrayList<ArrayList<Integer>> list, int totalVertices,
                                 boolean[]visited, int currentVertex) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);
        visited[currentVertex] = true;
        while (!queue.isEmpty()) {
            int number = queue.poll();
            for(int num: list.get(number)) {
                if(!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                }
                else {
                    if(num != number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String []args) {
       ArrayList<ArrayList<Integer>> data = AdjacencyListRepresentation.getGraphData();
       int numberOfVertices = data.size();
       boolean[] visited = new boolean[numberOfVertices+1];
       for(int i = 0;i< numberOfVertices;i++) {
           if(!visited[i])
              if(isGraphCyclic(data,numberOfVertices,visited, i)){
                  PrintData.printData(true);
                  break;
              }
       }
    }
}
