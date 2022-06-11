package programmers;

import java.util.*;
import java.util.stream.Collectors;

class Solution49189 {
    boolean[] visited;
    node[] nodes;

    public int solution(int n, int[][] edge) {
        visited = new boolean[n + 1];
        nodes = new node[n + 1];

        for (int i = 1; i <= n; i++) nodes[i] = new node();

        //각 노드에 연결된 노드 저장(양방향)
        for (int i = 0; i < edge.length; i++) {
            int node1 = edge[i][0];
            int node2 = edge[i][1];
            nodes[node1].connect_node.add(node2);
            nodes[node2].connect_node.add(node1);
        }

        //1번부터 시작
        visited[1] = true;
        return bfs(nodes[1].connect_node);
    }

    int bfs(Set<Integer> presentNodes){
        int count = presentNodes.size();
        Set<Integer> nextNodes = new HashSet<>();

        //+1의 길이가 되는 노드들 구하기
        for (int presentNode: presentNodes) {
            visited[presentNode] = true;
            for (int idx : nodes[presentNode].connect_node) {
                if (!visited[idx] && !presentNodes.contains(idx)) nextNodes.add(idx);
            }
        }

        //없다면 현재가 가장 먼 노드들이므로, 개수 리턴
        if(nextNodes.size() == 0) return count;
        //있으면 더 먼 노드들 반복
        return bfs(nextNodes);
    }

    class node{
        Set<Integer> connect_node;

        node(){
            this.connect_node = new HashSet<>();
        }
    }
}

public class Solution_farthestNode {
    public static void main(String[] args) {
        Solution49189 sol = new Solution49189();
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(sol.solution(6, vertex) == 3);
    }
}
