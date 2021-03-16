package graph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11123 {
    /*
    public static char map [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String answer = "";
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            map = new char [H][W];
            visited = new boolean [H][W];
            for (int i=0; i<H; ++i) {
                String line = br.readLine();
                for (int j=0; j<W; ++j) {
                    map[i][j] = line.charAt(j);
                }
            }
            int counter = 0;
            for (int i=0; i<H; ++i) {
                for (int j=0; j<W; ++j) {
                    if (!visited[i][j] && map[i][j] == '#') {
                        ++counter;
                        visited[i][j] = true;
                        dfs(H, W, i, j);
                    }
                }
            }
            answer += counter;
            if (t != T-1) {
                answer += "\n";
            }
        }
        System.out.println(answer);
    }

    public static void dfs (int H, int W, int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || H<=nx || ny<0 || W<=ny) {
                continue;
            }
            if (map[nx][ny] == '.') {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }

            visited[nx][ny] = true;
            dfs(H, W, nx, ny);
        }
    }

     */
}
