package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42840
public class Solution_mockExam {

    static int[] solution(int[] answers) {
        ArrayList<Integer> tmp_answer = new ArrayList<>();

        int[] count = {0, 0, 0};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //각 학생이 맞힌 문제 count
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == student1[i % 5])
                count[0]++;
            if (answers[i] == student2[i % 8])
                count[1]++;
            if (answers[i] == student3[i % 10])
                count[2]++;
        }

        //가장 문제를 많이 맞힌 학생들 구하기
        int max = Math.max(Math.max(count[0], count[1]), count[2]);
        for (int i=0; i<count.length; i++) {
            if (count[i] == max) tmp_answer.add(i+1);
        }

        //arraylist -> array 형태로 변환
        int[] answer = new int[tmp_answer.size()];
        for (int i=0;i<answer.length; i++){
            answer[i] = tmp_answer.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 3, 2, 4, 2};

        System.out.println("my ans : " + Arrays.toString(solution(test1)) + "  ans : {1}");
    }
}
