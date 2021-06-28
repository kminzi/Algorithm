package etc;

public class mathClass {

    public static void main(String[] args) {
        int[] number = {12,342,22,1,0};

        //2개의 값에서 큰 값 반환
        int max = Math.max(number[1],number[2]);
        System.out.println(max);

        //올림, 내림, 반올림
        double num = 2.5;
        System.out.println("반올림 : " + Math.round(num));
        System.out.println("내림 : " + (int)Math.floor(num));
        System.out.println("올림 : " + Math.ceil(num));

        //제곱 연산
        System.out.println("제곱 : " + Math.pow(num, 2));

        //제곱근
        System.out.println("제곱근 : " + Math.sqrt(num));
    }
}
