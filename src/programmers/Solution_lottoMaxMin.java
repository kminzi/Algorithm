package programmers;

import java.util.Arrays;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt_correct = 0;
        int cnt_zero = 0;

        //0의 개수와 답을 맞춘 개수 계산
        for(int i:lottos){
            if(i==0) cnt_zero++;
            else if (Arrays.stream(win_nums).anyMatch(n -> n == i)) cnt_correct++;
        }

        //정답 도출 - switch문으로 해도 될 듯
        answer[1] = cnt_correct == 0 ? 6 : 7 - cnt_correct;
        answer[0] = cnt_zero == 6 ? 1 : answer[1] - cnt_zero;

        return answer;
    }
}

public class Solution_lottoMaxMin {
    public static void main(String[] args) {
        Solution77484 sol = new Solution77484();
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.equals(sol.solution(lottos1, win_nums1), new int[]{3, 5}));
    }
}
