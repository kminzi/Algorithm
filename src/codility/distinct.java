package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class distinct {

    // 91% large case time out
    public int solution(int[] A) {
        return (int) Arrays.stream(A).distinct().count();
    }

    // 100% 시간복잡도는 O(N)
    public int solution2(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int a : A) set.add(a);
        return set.size();
    }

    public static void main(String[] args) {
        distinct sol = new distinct();

        int[] a = {2, 1, 1, 2, 3, 1};
        System.out.println(sol.solution(a));
        System.out.println(sol.solution2(a));
    }
}
