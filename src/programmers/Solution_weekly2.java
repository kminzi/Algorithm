package programmers;

import java.util.ArrayList;
import java.util.Collections;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/83201
class Solution83201 {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < scores.length; i++) {
            ArrayList score = new ArrayList();
            int sum = 0;
            int max = 0, min = 100;

            //한 학생의 점수 총합, 최대, 최소 구하기
            for (int j = 0; j < scores.length; j++) {
                score.add(scores[j][i]);
                sum += scores[j][i];
                max = Math.max(scores[j][i], max);
                min = Math.min(scores[j][i], min);
            }
            //유일한 최저점이면 제외
            if (min == scores[i][i]){
                int mincount = Collections.frequency(score, min);
                if (mincount == 1) {
                    sum -= min;
                    score.remove(Integer.valueOf(min));
                }
            }
            //유일한 최고점이면 제외
            if (max == scores[i][i]){
                int maxcount = Collections.frequency(score, max);
                if (maxcount == 1) {
                    sum -= max;
                    score.remove(Integer.valueOf(max));
                }
            }

            //평균 및 학점 구하기
            int avg = sum/score.size();
            if (avg >= 90) answer.append('A');
            else if (avg >= 80) answer.append('B');
            else if (avg >= 70) answer.append('C');
            else if (avg >= 50) answer.append('D');
            else answer.append('F');
        }
        return answer.toString();
    }
}


public class Solution_weekly2 {
    public static void main(String[] args) {
        Solution83201 solution83201 = new Solution83201();

        int[][] scores1 = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        System.out.println(solution83201.solution(scores1));
    }
}
