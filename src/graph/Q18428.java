package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q18428 {
    /*
    public static int N;
    public static char map [][];
    public static void main (String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char [N][N];
        ArrayList<Coordinate> blanks = new ArrayList<>();
        ArrayList<Coordinate> students = new ArrayList<>();
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                map[i][j] = st.nextToken().charAt(0);
                if (map[i][j] == 'X') {
                    blanks.add(new Coordinate(i, j));
                } else if (map[i][j] == 'S') {
                    students.add(new Coordinate(i, j));
                }
            }
        }
        int count = blanks.size();
        for (int i=0; i<count-2; ++i) {
            Coordinate first = blanks.get(i);
            map[first.x][first.y] = 'O';
            for (int j=i+1; j<count-1; ++j) {
                Coordinate second = blanks.get(j);
                map[second.x][second.y] = 'O';
                for (int k=j+1; k<count; ++k) {
                    Coordinate third = blanks.get(k);
                    map[third.x][third.y] = 'O';
                    boolean result = false;
                    for (int l=0; l<students.size(); ++l) {
                        Coordinate student = students.get(l);
                        result = bfs(student);
                        if (!result) {
                            break;
                        }
                    }
                    if (result) {
                        System.out.println("YES");
                        System.exit(0);
                    }
                    map[third.x][third.y] = 'X';
                }
                map[second.x][second.y] = 'X';
            }
            map[first.x][first.y] = 'X';
        }
        System.out.println("NO");
    }

    public static boolean bfs (Coordinate student) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int dir=0; dir<4; ++dir) {
            int nx = student.x; int ny = student.y;
            while (true) {
                nx += dx[dir]; ny += dy[dir];
                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    break;
                }
                if (map[nx][ny] == 'T') {
                    return false;
                } else if (map[nx][ny] == 'O') {
                    break;
                }
            }
        }
        return true;
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
