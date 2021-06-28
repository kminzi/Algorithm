package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42888
public class Solution_openchat {

    static String[] solution(String[] record) {
        HashMap<String, String> idmap = new HashMap<>();
        ArrayList<String> tmp = new ArrayList<>();

        //hashmap을 이용하여 아이디-닉네임 저장
        for (int i = 0; i < record.length; i++) {
            String[] message = record[i].split(" ");
            if (message[0].equals("Enter") || message[0].equals("Change")) {
                idmap.put(message[1], message[2]);
            }
        }

        //출력문 생성
        for (int i = 0; i < record.length; i++) {
            String[] message = record[i].split(" ");
            if (message[0].equals("Enter")) {
                tmp.add(idmap.get(message[1]) + "님이 들어왔습니다.");
            } else if (message[0].equals("Leave")) {
                tmp.add(idmap.get(message[1]) + "님이 나갔습니다.");
            }
        }

        //arraylist->array 변환
        String[] answer = new String[tmp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] test1 = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        System.out.println("my ans : " + Arrays.toString(solution(test1)) + " ans : [\"Prodo님이 들어왔습니다.\", \"Ryan님이 들어왔습니다.\", \"Prodo님이 나갔습니다.\", \"Prodo님이 들어왔습니다.\"]");
    }
}
