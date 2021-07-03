package programmers;

import java.util.HashMap;
import java.util.Map;

// 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42578
class Solution42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> category = new HashMap<>();

        //의상의 종류별로 몇 개가 있는지 계산
        for(int i=0;i<clothes.length;i++) {
            category.put(clothes[i][1], category.getOrDefault(clothes[i][1], 0) + 1);
        }

        //각 종류를 선택해서 그 중 하나를 입기 + 해당 종류를 선택하지 않음
        for(String s:category.keySet()){
            answer *= (category.get(s)+1);
        }
        //최소 하나의 의상은 입어야 함
        return answer-1;
    }
}

public class Solution_disguise {
    public static void main(String[] args) {
        Solution42578 sol = new Solution42578();
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println("my ans : " + sol.solution(clothes1) + " | ans : 5");

    }
}
