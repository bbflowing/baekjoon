package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11451 {
    public static char map [][];
    public static String answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        answer = "";
        for (int t=0; t<T; ++t) {
            if (t != 0) {
                answer += "\n";
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            map = new char [N][M];
            Coordinate first = null; Coordinate second = null;
            boolean flag = false;
            for (int i=0; i<N; ++i) {
                String line = br.readLine();
                for (int j=0; j<M; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == 'P') {
                        if (!flag) {
                            first = new Coordinate(i, j);
                            flag = true;
                        } else {
                            second = new Coordinate(i, j);
                        }
                    }
                }
            }
            bfs(first, second, N, M);
        }
        System.out.println(answer);
    }

    public static void bfs (Coordinate first, Coordinate second, int N, int M) {
        int dx [] = {-1, 0, 1, 0};
        int dy [] = {0, 1, 0, -1};
        char dir [] = {'N', 'E', 'S', 'W'};
        boolean visited [][][][] = new boolean [N][M][N][M];
        Queue<Coordinate> queue = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();
        queue.add(new Coordinate(first.x1, first.y1, second.x1, second.y1, 0, list));
        visited[first.x1][first.y1][second.x1][second.y1] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx1 = c.x1 + dx[i];
                int ny1 = c.y1 + dy[i];
                int nx2 = c.x2 + dx[i];
                int ny2 = c.y2 + dy[i];

                if (nx1<0) {
                    nx1 = N-1;
                } else if (N<=nx1) {
                    nx1 = 0;
                }

                if (ny1<0) {
                    ny1 = M-1;
                } else if (M<=ny1) {
                    ny1 = 0;
                }

                if (nx2<0) {
                    nx2 = N-1;
                } else if (N<=nx2) {
                    nx2 = 0;
                }

                if (ny2<0) {
                    ny2 = M-1;
                } else if (M<=ny2) {
                    ny2 = 0;
                }

                if (nx1 == nx2 && ny1 == ny2) {
                    answer += c.list.size()+" ";
                    for (int j=0; j<c.list.size(); ++j) {
                        answer += c.list.get(j);
                    }
                    return;
                }

                if (map[nx1][ny1] == 'G' || map[nx2][ny2] == 'G') {
                    continue;
                }
                if (map[nx1][ny1] == 'X') {
                    nx1 = c.x1;
                    ny1 = c.y1;
                }
                if (map[nx2][ny2] == 'X') {
                    nx2 = c.x2;
                    ny2 = c.y2;
                }
                if (visited[nx1][ny1][nx2][ny2]) {
                    continue;
                }
                visited[nx1][ny1][nx2][ny2] = true;
                ArrayList<Character> nlist = (ArrayList<Character>) c.list.clone();
                nlist.add(dir[i]);
                queue.add(new Coordinate(nx1, ny1, nx2, ny2, c.distance+1, nlist));

            }
        }
        answer += "IMPOSSIBLE";
    }
}

class Coordinate {
    int x1;
    int y1;
    int x2;
    int y2;
    int distance;
    ArrayList<Character> list;

    Coordinate (int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    Coordinate (int x1, int y1, int x2, int y2, int distance, ArrayList<Character> list) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.distance = distance;
        this.list = list;
    }
}
