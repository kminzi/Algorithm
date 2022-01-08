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

        //string to int
        String s = "123";
        int n = Integer.parseInt(s);

        String s1 = "abcde";
        int i =2;
        System.out.println(s1.substring(1,i));

        //특정 문자열로 시작, 끝 확인
        String str1 = "abcdefgwdse";
        System.out.println(str1.startsWith("ab"));
        System.out.println(str1.endsWith("se"));

        //대소문자 변환
        String upper = "ABC";
        System.out.println(upper.toLowerCase());

        String lower = "abc";
        System.out.println(lower.toUpperCase());
    }
}
