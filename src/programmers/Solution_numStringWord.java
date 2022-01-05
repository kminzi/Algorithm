package programmers;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/81301?language=java
class Solution81301 {
    public int solution(String s) {
        String[] response = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < response.length; i++) {
            s=s.replace(response[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}


public class Solution_numStringWord {
    public static void main(String[] args) {
        Solution81301 sol = new Solution81301();
        String s1 = "one4seveneight";

        System.out.println("my ans : " + sol.solution(s1) + " ans : 1478");
    }

}
