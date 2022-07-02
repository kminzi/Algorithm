package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_toothBrushSeller {

    static final String center = "-";

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        Map<String, String> referralMap = new HashMap<>();
        Map<String, Integer> salesMap = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            referralMap.put(enroll[i], referral[i]);
            salesMap.put(enroll[i], 0);
        }

        for (int i = 0; i < seller.length; i++) {
            int sales = amount[i] * 100;
            int sharedSales = sales / 10;
            salesMap.put(seller[i], (int) (salesMap.get(seller[i]) + sales - sharedSales));
            String referralNext = referralMap.get(seller[i]);

            while (!referralNext.equals(center)) {
                sales = sharedSales;
                sharedSales /= 10;
                salesMap.put(referralNext, (int) (salesMap.get(referralNext) + sales - sharedSales));
                if (sharedSales == 0) break;
                referralNext = referralMap.get(referralNext);
            }
        }

        for (int i = 0; i < enroll.length; i++) {
            answer[i] = salesMap.get(enroll[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution_toothBrushSeller sol = new Solution_toothBrushSeller();

        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        System.out.println(Arrays.toString(sol.solution(enroll, referral, seller, amount)));

        seller = new String[]{"sam", "emily", "jaimie", "edward"};
        amount = new int[]{2, 3, 5, 4};
        System.out.println(Arrays.toString(sol.solution(enroll, referral, seller, amount)));

    }
}
