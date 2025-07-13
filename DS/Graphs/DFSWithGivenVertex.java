package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSWithGivenVertex {

    static void traverseGraph(ArrayList<ArrayList<Integer>> list,
                              int startingVertex,
                              boolean []visited) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(startingVertex);
        if(!visited[startingVertex]) {
            visited[startingVertex] = true;

            System.out.println(startingVertex);
        } else {
            return;
        }

        for(int num: list.get(startingVertex)) {


            traverseGraph(list,num,visited);
        }
    }

    public static void main(String[]args) {
        traverseGraph(AdjacencyListRepresentation.getGraphData(),0,new boolean[6]);
    }
}
