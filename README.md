# INFO6205_Fall2021_Section1_Final

Given an undirected acyclic graph having N nodes and M edges, the task is to find the size of the largest tree in the forest formed by the graph. 

Input: N = 5, edges[][] = {{0, 1}, {0, 2}, {3, 4}} 

Output: 3 

Explanation: 

There are 2 trees, each having size 3 and 2 respectively. 

<img width = 400 src = "https://github.com/UrviAryamane19/INFO6205_Fall2021_Section1_Final/blob/master/graph_1.png" />

Hence the size of the largest tree is 3


Input: N = 5, edges[][] = {{0, 1}, {0, 2}, {3, 4}, {0, 4}, {3, 5}} 

Explanation: 

There is only 1 tree, after connecting all the edges

<img width = 400 src = "https://github.com/UrviAryamane19/INFO6205_Fall2021_Section1_Final/blob/master/graph_2.png" />
           
Hence the size of the largest tree is 6

Output: 6


Requirements:

Complete the implementation of addEdge, DFS, largestTree methods

The code must return an int value which is the size of the largest tree(tree with highest number of nodes)

The testcases for the LargestTree.java have been implemented in LargestTreeTest.java

Make sure all the test cases run successfully
 

Guidelines:

Use your own IDE to code the functions

After successful implemntation, push your code to the GitHub repository and submit the GitHub URL through Canvas

Also upload the screenshot of all the testcases running successfully, on Canvas
