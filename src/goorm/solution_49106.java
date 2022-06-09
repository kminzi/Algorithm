package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solution_49106 {

    private static int solution(int n){
        int quot = n;
        int idx = 1;
        int answer = 1;

        while (quot != 1) {
            if(n/idx != quot) answer++;
            quot = n / idx++;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(Integer.parseInt(input)));
    }
}
