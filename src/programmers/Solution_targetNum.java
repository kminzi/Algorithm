package programmers;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/43165
public class Solution_targetNum {

    static int solution(int[] numbers, int target) {
        int answer;
        answer = cal(numbers, target, -1, 0);

        return answer;
    }

    //dfs를 이용한 계산
    private static int cal(int[] numbers, int target, int idx, int num){

        if(idx == numbers.length-1){
            if(num == target)return 1;
            else return 0;
        }
        else{
            idx += 1;
            return cal(numbers, target, idx, num+numbers[idx])+cal(numbers, target, idx, num-numbers[idx]);
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 1, 1, 1, 1};
        int target1 = 3;

        System.out.println("my ans : " + solution(numbers1, target1) + " | ans : 5");
    }
}
