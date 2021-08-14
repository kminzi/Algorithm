package programmers;

import java.util.Arrays;

class Solution42577{
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //정렬
        Arrays.sort(phone_book);

        //이미 정렬이 완료되었으므로, 바로 앞 전화번호가 접두어인지만 체크하면 된다.
        for (int i =0;i<phone_book.length - 1;i++){
            if (phone_book[i+1].startsWith(phone_book[i]))return false;
        }
        return answer;
    }
}

public class Solution_phonebook {
    public static void main(String[] args) {
        Solution42577 sol = new Solution42577();
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        System.out.println(sol.solution(phone_book1));
    }
}
