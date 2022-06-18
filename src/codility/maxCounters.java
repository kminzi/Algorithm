package codility;

import java.util.Arrays;

public class maxCounters {

    // 50% 중간크기 입력부터 타임아웃
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];

        for(int a:A){
            if(a == N+1){
                int max = Arrays.stream(answer).max().getAsInt();
                Arrays.fill(answer, max);
            }
            else answer[a-1]++;
        }
        return answer;
    }

    // 77% 큰 입력값에서 타임아웃
    public int[] solution2(int N, int[] A) {
        int[] answer = new int[N];
        int max = 0;

        for(int a:A){
            if(a == N+1) Arrays.fill(answer, max);
            else {
                answer[a-1]++;
                if(answer[a-1] > max) max = answer[a - 1];
            }
        }
        return answer;
    }

    // 100% - O(N+M)
    public int[] solution3(int N, int[] A) {
        int[] answer = new int[N];
        int max = 0;
        int maxCounter = 0;

        for(int a:A){
            if(a == N+1) maxCounter = max;
            else {
                if(answer[a-1] < maxCounter) answer[a - 1] = maxCounter;
                if(++answer[a-1] > max) max = answer[a - 1];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if(answer[i] < maxCounter) answer[i] = maxCounter;
        }
        return answer;
    }

    public static void main(String[] args) {
        maxCounters sol = new maxCounters();
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(sol.solution3(5, A)));
    }
}
