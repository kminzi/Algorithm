package programmers;

class Solution72410 {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); //step1

        answer = answer.replaceAll("[^a-z0-9-_.]", ""); //step2

        answer = answer.replaceAll("(\\.){2,}", "."); //step3

        answer = answer.replaceAll("^(\\.)|(\\.)$", ""); //step4

        if (answer.isEmpty()) answer = "a"; //step5

        if (answer.length() >= 16) { //step6
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("(\\.)$", "");
        }

        StringBuilder sb = new StringBuilder(answer); //step7
        while (sb.length() < 3){
            sb.append(sb.charAt(sb.length()-1));
        }
        answer = sb.toString();

        return answer;
    }
}

public class Solution_recommendID {
    public static void main(String[] args) {
        Solution72410 sol = new Solution72410();
        String ex1 = "...!@BaT#*..y.abcdefghijklm";
        System.out.println("my ans : \"" + sol.solution(ex1) + "\" ans : \"bat.y.abcdefghi\"");
    }
}
