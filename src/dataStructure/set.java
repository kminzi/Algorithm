package dataStructure;

import java.util.*;

//중복 저장을 허용하지 않고, 저장 순서를 보장하지 않는다
public class set {

    public static void main(String[] args) {
        //Set 컬렉션 클래스는 HashSet, TreeSet, LinkedHashSet(순서보장)

        //HashSet
        //내부적으로 Hash 알고리즘을 사용하여 검색 속도가 빠르다
        Set<Integer> s1 = new HashSet<>();

        //값 입력
        System.out.println(s1.add(1)); //true
        System.out.println(s1.add(1)); //false

        //값 출력
        //foreach를 통한 출력
        for (Integer i : s1) {
            System.out.println(i);
        }

        //Iterator를 통한 출력
        Iterator<Integer> iterator = s1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //값 삭제
        System.out.println(s1.remove(1)); //true
        System.out.println(s1.remove(1)); //false

        //값 여러개 삭제
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        s1.removeAll(l1); //삭제된 것이 있으면 true

        //조건으로 삭제 by lambda
        s1.removeIf(s -> s.equals(1));

        //포함여부
        s1.contains(1);

    }

}
