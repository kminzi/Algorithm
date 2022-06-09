package goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_88520 {

    public static int solution(int N, int K, int[][] land){
        int answer = K * K;

        for (int i = 0; i < N - K + 1; i++) {
            for (int j = 0; j < N - K + 1; j++) {
                //(i,j) : k*k의 땅이 시작하는 지점
                int count = 0;
                for (int k = i; k < i + K; k++) {
                    for (int l = j; l < j + K; l++) {
                        if(land[k][l] == 1) count++;
                    }
                }
                if(answer > count) answer = count;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            String[] nk = br.readLine().split(" ");
            int N = Integer.parseInt(nk[0]);
            int K = Integer.parseInt(nk[1]);
            int[][] land = new int[N][N];
            for (int j = 0; j < N; j++) {
                String[] land_j = br.readLine().split(" ");
                for (int k = 0; k < N; k++) {
                    land[j][k] = Integer.parseInt(land_j[k]);
                }
            }

            System.out.println(solution(N, K, land));
        }
    }
}
