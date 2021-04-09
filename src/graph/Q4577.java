package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q4577 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int game = 0;
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            ++game;
            StringTokenizer st = new StringTokenizer(line);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            map = new char [N][M];
            Coordinate start = null;
            ArrayList<Coordinate> goals = new ArrayList<>();
            int count = 0;
            for (int i=0; i<N; ++i) {
                line = br.readLine();
                for (int j=0; j<M; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == 'w') {
                        start = new Coordinate(i, j);
                    } else if (map[i][j] == '+') {
                        ++count;
                        goals.add(new Coordinate (i, j));
                    }
                }
            }
            line = br.readLine();
            char route [] = line.toCharArray();
            solve(route, start, goals, game, count, N, M);
        }
    }

    public static void solve (char [] route, Coordinate start, ArrayList<Coordinate> goals, int game, int count, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<route.length; ++i) {
            char [][] temp = new char [N][M];
            for (int j=0; j<N; ++j) {
                temp[j] = map[j].clone();
            }
            int nx = start.x; int ny = start.y; int dir = 0;
            if (route[i] == 'U') {
                nx += dx[0]; ny += dy[0]; dir = 0;
            } else if (route[i] == 'D') {
                nx += dx[1]; ny += dy[1]; dir = 1;
            } else if (route[i] == 'L') {
                nx += dx[2]; ny += dy[2]; dir = 2;
            } else if (route[i] == 'R') {
                nx += dx[3]; ny += dy[3]; dir = 3;
            }

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (temp[nx][ny] == '#') {
                continue;
            } else if (temp[nx][ny] == 'b' || temp[nx][ny] == 'B') {
                int boxX = nx + dx[dir];
                int boxY = ny + dy[dir];
                if (boxX<0 || N<=boxX || boxY<0 || M<=boxY) {
                    continue;
                }
                if (temp[boxX][boxY] == '.') {
                    map[start.x][start.y] = '.';
                    map[boxX][boxY] = 'b';
                    start = new Coordinate(nx, ny);
                    if (temp[nx][ny] == 'B') {
                        ++count;
                        map[nx][ny] = 'W';
                        continue;
                    }
                    map[nx][ny] = 'w';


                } else if (temp[boxX][boxY] == '+') {
                    map[start.x][start.y] = '.';
                    map[nx][ny] = 'w';
                    --count;
                    start = new Coordinate(nx, ny);
                    map[boxX][boxY] = 'B';
                } else {
                    //start = new Coordinate(nx, ny);
                    continue;
                }
            } else if (temp[nx][ny] == '.') {
                map[start.x][start.y] = '.';
                map[nx][ny] = 'w';
                start = new Coordinate(nx, ny);
            }

            for (int j=0; j<goals.size(); ++j) {
                Coordinate target = goals.get(j);
                if (map[target.x][target.y] == '.') {
                    map[target.x][target.y] = '+';
                }
            }



            System.out.println(route[i]);
            for (int j=0; j<N; ++j) {
                System.out.println(Arrays.toString(map[j]));
            }
            System.out.println();


        }
        if (count == 0) {
            System.out.println("Game "+game+": complete");
            for (int j=0; j<N; ++j) {
                System.out.println(Arrays.toString(map[j]));
            }
        } else {
            System.out.println("Game "+game+": incomplete");
            for (int j=0; j<N; ++j) {
                System.out.println(Arrays.toString(map[j]));
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
