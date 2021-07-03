package programmers;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/43105
class Solution43105 {

    //dp로 풀이
    public int solution(int[][] triangle) {
        int[][] calTriangle = new int[triangle.length][triangle.length];

        //양 사이드의 최댓값 계산(기본값 초기화)
        calTriangle[0][0] = triangle[0][0];
        for (int i = 1; i < calTriangle.length; i++) {
            calTriangle[i][0] = calTriangle[i - 1][0] + triangle[i][0];
            calTriangle[i][i] = calTriangle[i - 1][i - 1] + triangle[i][i];
        }

        //이전 높이 중 가장 큰 값으로 계산(dp 이용)
        for (int i = 2; i < calTriangle.length; i++) {
            for (int j = 1; j < i; j++) {
                calTriangle[i][j] = Math.max(calTriangle[i - 1][j - 1], calTriangle[i - 1][j]) + triangle[i][j];
            }
        }

        //마지막 레벨에서 가장 큰 값이 최종 답안
        int answer = 0;
        for (int i = 0; i < calTriangle.length; i++) {
            answer = Math.max(calTriangle[triangle.length - 1][i], answer);
        }
        return answer;
    }


    //완전탐색 - 시간 초과
    public int solution_fail(int[][] triangle) {
        return cal(triangle, 0, 0, 0);
    }

    int cal(int[][] triangle, int height, int idx, int sum) {
        if (height == triangle.length)
            return sum;

        return Math.max(cal(triangle, height + 1, idx, sum + triangle[height][idx]),
                cal(triangle, height + 1, idx + 1, sum + triangle[height][idx]));
    }
}

public class Solution_IntegerTriangle {
    public static void main(String[] args) {
        Solution43105 sol = new Solution43105();

        int[][] triangle1 = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println("my ans : " + sol.solution(triangle1) + " | ans : 30");
    }
}
