package org.graph.dfsbfs;

import java.util.ArrayList;

public class graph {
	ArrayList nodes = new ArrayList();
	Node rootNode;
	int[][] adjMatrix;
	int size;
	public Node getRootNode(){
		return this.rootNode;
	}
	public void setRootNode(Node n){
		this.rootNode = n;
	}
	public void addNode(Node n){
		nodes.add(n);
	}
	
	public void connectNodes(Node a, Node b)
	{
		if(adjMatrix==null)
		{
			size = nodes.size();
			adjMatrix = new int[size][size];
		}
		else{
			int indexA = nodes.indexOf(a);
			int indexB = nodes.indexOf(b);
			adjMatrix[indexA][indexB]=1;
			adjMatrix[indexB][indexA]=1;
		}
	}
	public void getUnvisitedNodes(){
		
	}
}
