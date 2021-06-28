package dataStructure;
import java.util.Arrays;

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

        //정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
