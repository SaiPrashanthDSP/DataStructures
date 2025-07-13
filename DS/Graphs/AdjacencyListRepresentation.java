package Graphs;

import java.util.ArrayList;

public class AdjacencyListRepresentation {

    static void addVertex(int joiningVertex,int value,ArrayList<ArrayList<Integer>> list) {
        list.get(joiningVertex).add(value);
        list.get(value).add(joiningVertex);
    }
    static ArrayList<ArrayList<Integer>> getGraphData() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int numberOfVertices = 5;
        for(int i = 0; i<= 5;i++) {
            adj.add(new ArrayList<Integer>());
        }

        addVertex(0,1,adj);
        addVertex(0,2,adj);
        addVertex(1,3,adj);
        addVertex(1,4,adj);
        addVertex(2,5,adj);

       addVertex(4,5,adj);
        return  adj;
    }
    public static void main(String []args) {

      System.out.println(getGraphData().toString());
    }
}
