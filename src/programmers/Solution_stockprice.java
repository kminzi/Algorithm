package programmers;

import java.util.Arrays;
import java.util.Stack;

class Solution42584{
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        //i: 현재 가격, j: 현재 이후 떨어지는 일자 체크
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if(prices[i]> prices[j]) break;
            }
            answer[i] = count;
        }
        return answer;
    }

    public int[] solutionByStack(int[] prices) {
        Stack<Integer> idx = new Stack<>();
        int[] answer = new int[prices.length];

        idx.add(0);

        //각 인덱스 값이 곧 걸린 초
        for (int i = 1; i < prices.length; i++) {
            //주식 가격이 떨어진 경우
            while (!idx.empty() && prices[idx.peek()] > prices[i]) {
                int stopIdx = idx.pop();
                answer[stopIdx] = i - stopIdx;
            }
            idx.add(i);
        }

        //끝까지 떨어지지 않은 주식
        while(!idx.empty()){
            int stopIdx = idx.pop();
            answer[stopIdx] = prices.length - stopIdx - 1;
        }
        return answer;
    }
}

public class Solution_stockprice {
    public static void main(String[] args) {
        Solution42584 sol = new Solution42584();

        int[] prices1 = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(sol.solutionByStack(prices1)));
    }
}
