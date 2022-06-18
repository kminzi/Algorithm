package codility;

import java.util.Stack;

public class fish {

    //시간복잡도 : O(N)
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>(); //역행하는 물고기
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) stack.add(i);
            else {
                boolean is_alive = true;
                while (!stack.isEmpty()) {
                    if (A[i] > A[stack.peek()]) stack.pop();
                    else { //올라가다가 잡아먹힘
                        is_alive = false;
                        break;
                    }
                }
                if (is_alive) answer++;
            }
        }
        answer += stack.size(); //역행하는 물고기 중 살아남은 것
        return answer;
    }

    public static void main(String[] args) {
        fish sol = new fish();
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};
        System.out.println(sol.solution(a, b));
    }
}
