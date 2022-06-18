package codility;

import java.util.HashSet;
import java.util.Set;

//시간 복잡도 : O(N) or O(N*logN)
public class oddOccurrencesInArray {

    public int solution(int[] A) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        //set에 있으면 삭제, 없으면 추가
        for(int a : A){
            if(!set.remove(a)) set.add(a);
        }

        //마지막 남은 값
        for(int i : set) answer = i;
        return answer;
    }

    public static void main(String[] args) {
        oddOccurrencesInArray Sol = new oddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(Sol.solution(A));
    }
}
