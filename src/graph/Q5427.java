package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5427 {
    /*
    public static char map[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            map = new char[H][W];
            Coordinate start = null;
            Queue<Coordinate> fireQ = new LinkedList<>();
            Queue<Coordinate> sangQ = new LinkedList<>();
            boolean[][] fireV = new boolean[H][W];
            boolean[][] sangV = new boolean[H][W];
            for (int i = 0; i < H; ++i) {
                String line = br.readLine();
                for (int j = 0; j < W; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == '@') {
                        sangQ.add(new Coordinate(i, j, 0));
                        sangV[i][j] = true;
                    } else if (map[i][j] == '*') {
                        fireQ.add(new Coordinate(i, j));
                        fireV[i][j] = true;
                    }
                }
            }
            answer += bfs(fireQ, sangQ, fireV, sangV, W, H)+"\n";
        }
        System.out.println(answer);
    }

    public static String bfs(Queue<Coordinate> fireQ, Queue<Coordinate> sangQ, boolean[][] fireV,
                           boolean[][] sangV, int W, int H) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        String answer = "";
        boolean success = false;

        while (true) {
            int fireSize = fireQ.size();
            for (int i = 0; i < fireSize; ++i) {
                Coordinate fire = fireQ.poll();
                for (int j = 0; j < 4; ++j) {
                    int nx = fire.x + dx[j];
                    int ny = fire.y + dy[j];

                    if (nx < 0 || H <= nx || ny < 0 || W <= ny) {
                        continue;
                    }
                    if (fireV[nx][ny]) {
                        continue;
                    }
                    if (map[nx][ny] == '#') {
                        continue;
                    }
                    fireQ.add(new Coordinate(nx, ny));
                    fireV[nx][ny] = true;
                }
            }

            int sangSize = sangQ.size();
            for (int i = 0; i < sangSize; ++i) {
                Coordinate sang = sangQ.poll();
                for (int j=0; j<4; ++j) {
                    int nx = sang.x + dx[j];
                    int ny = sang.y + dy[j];
                    //System.out.println(nx+","+ny);

                    if (nx<0 || H<=nx || ny<0 || W<=ny) {
                        success = true;
                        answer = String.valueOf(sang.times+1);
                        break;

                    }
                    if (sangV[nx][ny] || fireV[nx][ny]) {
                        continue;
                    }
                    if (map[nx][ny] == '#') {
                        continue;
                    }
                    sangV[nx][ny] = true;
                    sangQ.add(new Coordinate(nx, ny, sang.times+1));
                }
                if (success) {
                    break;
                }
            }
            if (success) {
                break;
            }
            if (sangQ.size() == 0) {
                break;
            }
        }

        if (success) {
            return answer;
        } else {
            return "IMPOSSIBLE";
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int times;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate(int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
 */