package etc;

import java.util.Scanner;
//데이터 타입을 입력 받기 위한 대표 클래스, 표준 입력 스트림을 나태나는 System.in이라는 정해진 객체를 전달

public class std_inout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            i += num;
        }

        //개행문자가 나오기 전까지 입력 받음
        String input = scanner.nextLine();
    }

}
