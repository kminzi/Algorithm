package programmers;

class Solution42860{
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move_LR = len - 1; //최소 좌우 이동 계산을 위한 변수

        for (int i = 0; i < len; i++) {
            //알파벳을 맞추기 위한 조이스틱 상하이동
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            //다음 위치에 연속된 A가 얼마나 있는지
            int idx = i + 1;
            while (idx < len && name.charAt(idx) == 'A') {
                idx++;
            }

            //현재 위치에서 다시 돌아가서 뒤로 가기
            move_LR = Math.min(move_LR, i * 2 + (len - idx));
            //처음부터 뒤로갔다가 순차 진행
            move_LR = Math.min(move_LR, (len - idx) * 2 + i);
        }
        return answer + move_LR;
    }
}

public class Solution_joyStick {
    public static void main(String[] args) {
        Solution42860 sol = new Solution42860();

        System.out.println(sol.solution("JEROEN") == 56);
        System.out.println(sol.solution("JAN") == 23);
    }
}
