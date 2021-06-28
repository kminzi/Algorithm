package etc;

public class string {

    public static void main(String[] args) {
        String str = "010-0000-0000";

        String[] num = str.split("-");
        System.out.println("num1 = "+ num[0]);
        System.out.println("num2 = "+ num[1]);
        System.out.println("num3 = "+ num[2]);

        //2개로 분할하므로 가장 먼저 나오는 regex로 분리
        String[] num2 = str.split("-",2);
        System.out.println("num1 = "+ num2[0]);
        System.out.println("num2 = "+ num2[1]);
    }
}
