package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayList {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        numbers.add(10); //원소 추가
        numbers.get(0); //접근 - index

        numbers.remove(0); //원소 삭제 - index
        //첫번째 나오는 값만 삭제, 삭제하면 true return
        numbers.remove(Integer.valueOf(10)); //원소 삭제 - value
        //해당 값 전부 삭제, Collection 객체로 전달
        numbers.removeAll(Arrays.asList(Integer.valueOf(10)));

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

        //리스트에 특정 값이 몇 개 포함되어 있는지 확인
        int count = Collections.frequency(arrlist, "first");
        System.out.println(count);
    }
}
