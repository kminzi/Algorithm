package programmers;

import java.util.*;
import java.util.stream.Collectors;

class Solution92334 {

    //map, set 자료구조를 활용한 풀이
    public int[] solution(String[] id_list, String[] report, int k) {

        //신고당한id - 신고한id(Set)
        Map<String, Set<String>> reportMap = new HashMap<>();
        //id - 처리 결과 메일을 수신할 횟수
        Map<String, Integer> mailMap = new HashMap<>();
        //결과
        int[] answer = new int[id_list.length];

        //해당 ID를 신고한 유저들 찾기
        for (String s : report) {
            String[] ids = s.split(" ");
            String fromId = ids[0], toId = ids[1];
            Set<String> set = reportMap.getOrDefault(toId, new HashSet<>());
            set.add(fromId);
            reportMap.put(toId, set);
        }

        //이용 정지 대상자를 찾고 처리 결과 메일 횟수 카운트
        for (String s : reportMap.keySet()) {
            if(reportMap.get(s).size() >= k) {
                for(String s1 : reportMap.get(s))
                    mailMap.put(s1, mailMap.getOrDefault(s1, 0) + 1);
            }
        }

        //결과 도출
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailMap.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

    //stream을 활용한 풀이
    public int[] solutionByStream(String[] id_list, String[] report, int k) {

        //신고 중복 제거
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());

        //신고 당한 횟수 확인
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            String toId = s.split(" ")[1];
            map.put(toId, map.getOrDefault(toId, 0) + 1);
        }

        //받을 메일 횟수
        return Arrays.stream(id_list).map(i -> {
            final String user = i;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user)).collect(Collectors.toList());
            return reportList.stream().filter(s -> map.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

}

public class Solution_reportResult {

    public static void main(String[] args) {
        Solution92334 sol = new Solution92334();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = {2, 1, 1, 0};

        System.out.println(Arrays.equals(sol.solutionByStream(id_list, report, k), result));
    }
}
