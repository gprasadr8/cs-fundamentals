package com.pw.graphs;

import java.util.*;

public class AdjacencyListGraph {

    private   int numOfVectors;

    private LinkedList<Integer> edges[] ;

    private Map<Character, List<Character>>  characterEdges;

    public AdjacencyListGraph(int numOfVectors){
        this.numOfVectors = numOfVectors;
        this.edges = new LinkedList[numOfVectors];
        //create a new list for each vertex
        for(int i=0;i<numOfVectors;i++){
            edges[i] = new LinkedList<>();
        }
    }

    public AdjacencyListGraph(char[] vertices){
        this.characterEdges = new HashMap();
        for(char vertex: vertices){
            this.characterEdges.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(char source, char destination){
        if(this.characterEdges.containsKey(source) && this.characterEdges.containsKey(destination)){
            this.characterEdges.get(source).add(destination);
            this.characterEdges.get(destination).add(source);
        }
    }

    public void addEdge(int source, int destination){
        this.edges[source].add(destination);
        this.edges[destination].add(source);
    }

    public void printGraph(){
        for(int i=0;i<numOfVectors;i++){
            System.out.println(this.edges[i]);
        }
    }

    public void printCharGraph(){
        this.characterEdges.entrySet().forEach(System.out::println);
    }
}
