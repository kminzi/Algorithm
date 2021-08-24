package dataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        //int 형 우선순위 큐, 작은 숫자가 더 우선순위가 높음
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //큰 숫자가 더 우선순위가 높음
        PriorityQueue<Integer> pq_reverse = new PriorityQueue<>(Collections.reverseOrder());

        //값 추가
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);
        System.out.println(pq.toString());

        //값 제거
        int a = pq.poll();
        pq.remove();

        //전체 제거
        pq.clear();

        //우선 순위가 가장 높은 값 출력
        System.out.println(pq.peek());
    }
}
