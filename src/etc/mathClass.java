package etc;

public class mathClass {

    public static void main(String[] args) {
        int[] number = {12,342,22,1,0};

        //2개의 값에서 큰 값 반환
        int max = Math.max(number[1],number[2]);
        System.out.println(max);
    }
}
