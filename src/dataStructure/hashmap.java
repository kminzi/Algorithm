package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {
        //선언
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>() {{
            put("a", 1);
        }};

        //출력
        System.out.println(map2);
        System.out.println(map2.get("a")); //key 값으로 검색
        for (Map.Entry<String, Integer> entry : map2.entrySet()) { //entry 활용
            System.out.println("[key] " + entry.getKey() + " [value] " + entry.getValue());
        }

        for (String s : map2.keySet()) {//keyset 활용
            System.out.println("[key] " + s + "[value]" + map2.get(s));
        }

        //값 추가
        //같은 key가 존재하면 value가 대치됨.
        map1.put("1", "2");
        map2.put("a", 2);
        map2.put("b", 2);
        System.out.println(map2.get("a")); //1->2 로 변경

        //값 삭제
        //key 값으로 삭제하거나, 전체 삭제
        map1.remove("a");
        map2.clear();
        System.out.println(map1);
        System.out.println(map2);

        //값 입력 시 기본 값(해당 키가 있으면 가져오고 없으면 기본 값으로 0을 설정)
        map2.put("a", map2.getOrDefault("a",0)+1);

        //key, value 존재 여부 확인
        System.out.println(map1.containsKey("a"));
        System.out.println(map2.containsValue(1));
    }
}
