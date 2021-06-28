package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42586
public class Solution_devfunc {

    static int[] solution(int[] progresses, int[] speeds) {
        int[] deploys = new int[progresses.length];

        //개발이 끝나는 기간 계산
        for (int i = 0; i < deploys.length; i++) {
            int remain = 100 - progresses[i];
            int deploy = remain / speeds[i];
            if (remain % speeds[i] != 0) deploy++;
            deploys[i] = deploy;
        }

        //하루에 같이 배포할 수 있는 기능 수 확인
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0;i< deploys.length; i++){
            int count = 1;
            for (int j = i+1; j<deploys.length; j++){
                if(deploys[j] <= deploys[i]) {
                    count++;
                    if(j == deploys.length-1) i = j;
                }
                else {
                    i = j-1;
                    break;
                }
            }
            tmp.add(count);
        }

        //arraylist -> array 변환
        int[] answer = new int[tmp.size()];
        for (int i=0;i<answer.length;i++){
            answer[i] = tmp.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};

        System.out.println("my ans : "+ Arrays.toString(solution(progresses1, speeds1)) + " ans : [2, 1]");

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println("my ans : "+ Arrays.toString(solution(progresses2, speeds2)) + " ans : [1, 3, 2]");
    }
}
