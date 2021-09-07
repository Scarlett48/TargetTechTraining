package com.aique.collections.list;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListOfArrayList {

    public static void main(String args[]) {

//        ArrayList a = new ArrayList();
//        a.size();
//        a.add(10);
//        a.add("adad");
//        a.add(10);
//
//         for (int i=0; i<a.size();i++){
//             Object val = a.get(i);
//             Integer myInt  = (Integer) val;
//             System.out.println(myInt);
//         }

//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        for (int i=0; i<al.size();i++){
//            Integer myInt = al.get(i);
//            System.out.println(myInt);
//        }

        LinkedList<Integer> link = new LinkedList<>();
        link.add(10);
        link.addFirst(5);
        link.add(7);
        link.add(20);
        System.out.println("list size  "+link.size());
        for (Integer i:link){
            System.out.println(i);
        }
        Integer first = link.removeFirst();
        System.out.println("First Position Element : "+first);

        System.out.println("list size after removing object"+link.size());
//        int vertexCount = 3;
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertexCount);
//
//        //Initializing each element of ArrayList with ArrayList
//        for(int i = 0; i< vertexCount; i++) {
//            graph.add(new ArrayList<Integer>());
//        }
//
//        //We can add any number of columns to each row
//        graph.get(0).add(1);
//        graph.get(1).add(2);
//        graph.get(2).add(0);
//        graph.get(1).add(0);
//        graph.get(2).add(1);
//        graph.get(0).add(2);
//
//        vertexCount = graph.size();
//        for(int i = 0; i < vertexCount; i++) {
//            int edgeCount = graph.get(i).size();
//            for(int j = 0; j < edgeCount; j++) {
//                Integer startVertex = i;
//                Integer endVertex = graph.get(i).get(j);
//                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
//            }
//        }
    }

}