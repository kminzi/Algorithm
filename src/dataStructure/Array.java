package dataStructure;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Array {

    public static void main(String[] args) {
        //배열은 정의와 동시에 길이를 지정하여 동적으로 변경이 불가하다. 필요하면 linkedlist or arraylist 사용
        //하지만, 처리속도나 메모리 면에서는 유리함.

        //선언
        int[] arr = {12, 23, 45, 56, 22};
        int[] num = new int[3];

        //출력
        System.out.println(arr); //id가 출력
        System.out.println(Arrays.toString(arr)); //배열의 내용 출력
        System.out.println(Arrays.toString(num));

        //정렬(오름차순)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //정렬(내림차순)
        String[] arr2 = {"12", "23", "13"};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        //정렬(custom)
        String[] numbers2 = {"3", "30", "34", "5", "9", "9"};
        Arrays.sort(numbers2, new Comparator<String>() {
            //return 양수이면 자리 변경
            @Override
            public int compare(String o1, String o2) {
                if (Integer.parseInt(o1+o2) > Integer.parseInt(o2+o1))
                    return -1;
                else return 1;
            }
        });
        System.out.println(Arrays.toString(numbers2));

        //compareTo
        //비교대상과 문자열이 겹치는 경우 길이비교
        //다른 문자열인 경우 ascii 기반 비교
        System.out.println("1234".compareTo("1245"));

        //배열에 특정 값이 있는지 확인
        Arrays.asList(numbers2).contains(22);
        Arrays.stream(numbers2).anyMatch(s -> s == "22");

        //두 배열이 같은지 확인
        Arrays.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

}
