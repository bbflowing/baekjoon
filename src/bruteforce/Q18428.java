package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q18428 {
    /*
    public static int N;
    public static char hallway [][];
    public static ArrayList<Coordinate> students;
    public static ArrayList<Coordinate> blanks;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        hallway = new char [N][N];
        students = new ArrayList<>();
        blanks = new ArrayList<>();
        int possible = 0;
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                hallway [i][j] = st.nextToken().charAt(0);
                if (hallway[i][j] == 'S') {
                    students.add(new Coordinate(i, j));
                } else if (hallway[i][j] == 'X') {
                    blanks.add(new Coordinate(i, j));
                    ++possible;
                }
            }
        }
        for (int i=0; i<blanks.size()-2; ++i) {
            Coordinate first = blanks.get(i);
            hallway[first.x][first.y] = 'O';
            for (int j=i+1; j<blanks.size()-1; ++j) {
                Coordinate second = blanks.get(j);
                hallway[second.x][second.y] = 'O';
                for (int k=j+1; k<blanks.size(); ++k) {
                    Coordinate third = blanks.get(k);
                    hallway[third.x][third.y] = 'O';
                    //System.out.println("("+first.x+","+first.y+"), ("+second.x+","+second.y+"), ("+third.x+","+third.y+")");
                    boolean fail = false;
                    for (int l=0; l<students.size(); ++l) {
                        Coordinate student = students.get(l);
                        if (!solve(student.x, student.y)) {
                            fail = true;
                            break;
                        }
                    }
                    if (!fail) {
                        System.out.println("YES");
                        System.exit(0);
                    }
                    hallway[third.x][third.y] = 'X';
                }
                hallway[second.x][second.y] = 'X';
            }
            hallway[first.x][first.y] = 'X';
        }
        System.out.println("NO");
    }

    public static boolean solve(int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x; int ny = y;
            while (true) {
                nx += dx[i];
                ny += dy[i];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    break;
                }

                if (hallway[nx][ny] == 'T') {
                    return false;
                } else if (hallway[nx][ny] == 'O') {
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