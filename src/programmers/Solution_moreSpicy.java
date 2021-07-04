package programmers;

import java.util.PriorityQueue;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42626
class Solution42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        //우선순위 큐로 변환
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.add(i);
        }

        //가장 작은 수가 K 이상이 될 때 까지, 우선순위가 높은(즉, 덜 매운)두 개로 새로운 음식을 만듬.
        while(pq.peek() < K){
            //size가 1이하이면 새로운 음식을 만들 수 없음.
            if(pq.size() == 1){
                answer = -1;
                break;
            }
            int new_food = pq.poll() + pq.poll()*2;
            pq.add(new_food);
            answer++;
        }
        return answer;
    }
}

public class Solution_moreSpicy {
    public static void main(String[] args) {
        Solution42626 sol = new Solution42626();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println("my ans : "+sol.solution(scoville, K) + " | ans : 2");
    }
}
