package dataStructure;

import java.util.*;

//index는 0부터 시작하고, 연속된 메모리 공간을 사용하는 자료형
//가변적으로 크기가 변함
public class arrayList {

    public static void main(String[] args) {
        //선언
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> numbers_by_size = new ArrayList<>(20);
        ArrayList<Integer> numbers_init = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        //원소 추가
        numbers.add(10);
        numbers.add(12);

        //접근 - index
        numbers.get(0);

        //원소 변경
        numbers.set(0,11);

        //원소 삭제 - index
        numbers.remove(0);

        //원소 삭제 - value
        //첫번째 나오는 값만 삭제, 삭제하면 true return
        numbers.remove(Integer.valueOf(10));

        //해당 값 전부 삭제, Collection 객체로 전달
        numbers.removeAll(Arrays.asList(10, 11));

        //arraylist 내용 전체 삭제
        numbers.clear();

        //리스트에 특정 값이 몇 개 포함되어 있는지 확인
        int count = Collections.frequency(numbers, "first");
        System.out.println(count);

        //리스트에 존재하는지 확인
        boolean contains = numbers.contains(11);

        //해당 값의 위치 확인, 없으면 -1 리턴
        int index = numbers.indexOf(11);

        //loop
        //방법0 : 일반 for문
        //방법1 : for-each
        for (int num : numbers) {
            System.out.println(num);
        }
        //방법2 : Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //방법3 : listIterator
        //iterator와 차이점은 previous함수를 통해 역방향 조회가 가능
        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


        //string[] to arraylist
        String[] arrstr = {"first", "second", "third", "fourth", "fifth"};

        //방법1 : copy가 아니라 타입만 변환, 고정된 사이즈이므로 읽기만 할 때 사용
        List arrlist = Arrays.asList(arrstr);

        //방법2 : copy하여 새로운 arraylist에 저장함. 독립적이므로 수정/삭제가 가능
        ArrayList arrlist2 = new ArrayList(Arrays.asList(arrstr));

        //방법3 : 방법2와 동일하고 사용 함수만 다름.
        ArrayList arrlist3 = new ArrayList();
        Collections.addAll(arrlist3, arrstr);

        //두 리스트 비교 제거
        //arrlist2 - arrlist
        arrlist2.removeAll(arrlist);


        //arrayList to array
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        Integer[] integerArray = (Integer[]) arrayList.toArray();

    }
}
