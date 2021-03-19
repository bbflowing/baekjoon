package backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q9944 {
    /*
    public static char map [][];
    public static ArrayList<Coordinate> blanks;
    public static boolean visited [][];
    public static int N, M, answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 0;
        String line = "";
        while ((line = br.readLine()) != null) {
            ++T;
            StringTokenizer st = new StringTokenizer(line);
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new char [N][M];
            blanks = new ArrayList<>();
            int spaces = 0;
            for (int i=0; i<N; ++i) {
                st = new StringTokenizer(br.readLine());
                String temp = st.nextToken();
                for (int j=0; j<M; ++j) {
                    map[i][j] = temp.charAt(j);
                    if (map[i][j] == '.') {
                        blanks.add(new Coordinate(i, j));
                        ++spaces;
                    }
                }
            }
            answer = 987_654_321;
            spaces -= 1;
            for (int i=0; i<blanks.size(); ++i) {
                Coordinate start = blanks.get(i);
                visited = new boolean [N][M];
                visited[start.x][start.y] = true;
                //System.out.println(start.x+","+start.y);
                solve(start.x, start.y, spaces, 0);
            }
            if (answer == 987_654_321) {
                bw.append("Case "+T+": "+-1);
                //System.out.println(-1);
                bw.newLine();
            } else {
                bw.append("Case "+T+": "+answer);
                //System.out.println(answer);
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static void solve (int x, int y, int spaces, int times) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        //System.out.println(x+","+y+","+spaces+","+times);
        if (spaces == 0) {
            if (answer > times) {
                answer = times;
            }
            return;
        }

        for (int i=0; i<4; ++i) {
            int nx = x; int ny = y;
            ArrayList<Coordinate> list = new ArrayList<>();
            while (true) {
                nx += dx[i]; ny += dy[i];
                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    nx -= dx[i]; ny -= dy[i];
                    break;
                }
                if (visited[nx][ny]) {
                    nx -= dx[i]; ny -= dy[i];
                    break;
                }
                if (map[nx][ny] == '*') {
                    nx -= dx[i]; ny -= dy[i];
                    break;
                }
                visited[nx][ny] = true;
                list.add(new Coordinate(nx, ny));
                --spaces;
            }
            if (list.size() == 0) {
                continue;
            }
            solve(nx, ny, spaces, times+1);
            for (int j=0; j<list.size(); ++j) {
                Coordinate target = list.get(j);
                visited[target.x][target.y] = false;
                ++spaces;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */