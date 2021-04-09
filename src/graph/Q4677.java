package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4677 {
    public static char input [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            input = new char [N][M];

            for (int i=0; i<N; ++i) {
                line = br.readLine();
                for (int j=0; j<M; ++j) {
                    input[i][j] = line.charAt(j);
                }
            }
            visited = new boolean [N][M];
            int counter = 0;

            for (int i=0; i<N; ++i) {
                for (int j=0; j<M; ++j) {
                    if (input[i][j] == '@' && !visited[i][j]) {
                        visited[i][j] = true;
                        ++counter;
                        dfs(i, j, N, M);

                    }
                }
            }
            answer += counter+"\n";
        }
        System.out.println(answer);
    }

    public static void dfs (int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0, -1, -1, 1, 1};
        int dy [] = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (input[nx][ny] == '*') {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny, N, M);
        }
    }
}
