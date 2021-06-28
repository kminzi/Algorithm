package programmers;

public class Solution_openchat {

    static String[] solution(String[] record) {
        String[] answer = {};

        for (int i=0; i<record.length; i++){
            String[] message = record[i].split(" ");
            String command = message[0];
            String id = message[1];
            String name = message[2];

            if(command.equals("Change")){

            }


        }

        return answer;
    }

    public static void main(String[] args) {
        String[] test1 = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

    }
}
