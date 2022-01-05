package programmers;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/62048
class Solution62048 {
    public long solution(int w, int h) {
        //기울기 사용한 풀이 - 오류
        //기울기 사용한 것의 반례는 w:3 h:5
        int inclination = (int) Math.ceil((double)Math.max(w, h) / Math.min(w, h));
        long answer = (long)w * h - inclination * Math.min(w,h);

        //최대공약수를 사용한 풀이

        return answer;
    }
}

public class Solution_fineRectangle {
    public static void main(String[] args) {
        Solution62048 sol = new Solution62048();
        int w1 = 8;
        int h1 = 12;
        System.out.println("my ans : " + sol.solution(w1, h1) + " ans : 80");
    }
}
