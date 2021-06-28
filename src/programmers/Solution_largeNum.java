package programmers;

import java.util.Arrays;
import java.util.Comparator;

//문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42746
public class Solution_largeNum {

    static String solution(int[] numbers) {
        String answer = "";
        String[] number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            number[i] = Integer.toString(numbers[i]);
        }

        //comparator를 이용한 정렬
        Arrays.sort(number, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1 : "+ (o1+o2) + "  o2 : " + (o2+o1) + "  " + (o1+o2).compareTo(o2+o1));
                return -(o1+o2).compareTo(o2+o1);
            }
        });

        //전부 0인경우 처리
        if(number[0].equals("0")) return "0";

        //하나의 문자열로 합치기
        for(int i=0;i<number.length;i++){
            answer += number[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        System.out.println("my ans : "+ solution(numbers1) +" || ans : 6210" );

        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println("my ans : "+ solution(numbers2) +" || ans : 9534330" );

    }
}
