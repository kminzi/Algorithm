package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    //먼저 들어온 데이터가 먼저 나가는 FIFO형태
    //enqueue : 맨 뒤에 적재?
    //dequeue : 맨 앞에 적재?
    //주로 bfs(넓이 우선 탐색)에 자주 사용하는 자료구조
    public static void main(String[] args) {

        //선언
        Queue<Integer> queue1 = new LinkedList<>();

        //값 추가
        queue1.add(1); //성공하면 true반환, 실패하면 익셉션 발생
        queue1.offer(2);

        //값 삭제
        queue1.poll(); //첫번째 값 제거+반환하고 비어있다면 null
        queue1.remove();

        //전체 삭제
        queue1.clear();

        //값 참조
        queue1.peek();
    }
}
