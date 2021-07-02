package programmers;

import java.util.*;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42576
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        String answer = "";

        //hashmap에 해당 값이 있으면 +1(동명이인 처리를 위함), 없으면 1로 입력
        for(String s:participant){
            hashmap.put(s, hashmap.getOrDefault(s,0)+1);
        }
        //완주한 선수는 -1
        for(String s:completion){
            hashmap.put(s, hashmap.get(s)-1);
        }
        //완주하지 못했으면 1의 값을 가지게 됨
        for(String key:hashmap.keySet()){
            if(hashmap.get(key) != 0)
                answer = key;
        }
        return answer;
    }
}

public class Solution_marathonRunner {

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        Solution sol = new Solution();

        System.out.println("my ans : "+sol.solution(participant1, completion1) + " | ans : \"leo\"");

        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 = {"stanko", "ana", "mislav"};

        System.out.println("my ans : "+sol.solution(participant2, completion2) + " | ans : \"stanko\", \"ana\", \"mislav\"");
    }
}
