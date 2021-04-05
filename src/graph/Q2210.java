package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q2210 {
    /*
    public static String board [][];
    public static HashMap<String, Boolean> values;
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        board = new String [5][5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        values = new HashMap<>();
        for (int i=0; i<5; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; ++j) {
                board[i][j] = st.nextToken();
            }
        }
        for (int i=0; i<5; ++i) {
            for (int j=0; j<5; ++j) {
                solve(i, j, board[i][j], 1);
            }
        }
        System.out.println(values.size());

    }

    public static void solve (int x, int y, String value, int depth) {
        if (depth == 6) {
            if (!values.containsKey(value)) {
                values.put(value, true);
            }
            return;
        }
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || 5<=nx || ny<0 || 5<=ny) {
                continue;
            }
            String nvalue = value + board[nx][ny];
            solve(nx, ny, nvalue, depth+1);
        }
    }
     */
}
