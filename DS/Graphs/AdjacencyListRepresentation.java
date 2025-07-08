package Graphs;

import java.util.ArrayList;

public class AdjacencyListRepresentation {

    static void addVertex(int value,int joiningVertex,ArrayList<ArrayList<Integer>> list) {
        list.get(joiningVertex).add(value);
        list.get(value).add(joiningVertex);
    }
    public static void main(String []args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int numberOfVertices = 5;
        for(int i = 0; i< 5;i++) {
            adj.add(new ArrayList<Integer>());
        }

    }
}
