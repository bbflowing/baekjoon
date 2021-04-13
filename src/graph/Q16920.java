package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Q16920 {
    /*
    public static int N, M;
    public static char board[][];
    public static int answers[];
    public static ArrayList<Queue<Coordinate>> queues;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        int moves [] = new int[P + 1];
        queues = new ArrayList<>();
        answers = new int [P + 1];
        for (int i=0; i<=P; ++i) {
            queues.add(new LinkedList<>());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= P; ++i) {
            moves[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(moves));
        int blanks = 0;
        for (int i = 0; i < N; ++i) {
            String line = br.readLine();
            for (int j = 0; j < M; ++j) {
                board[i][j] = line.charAt(j);
                int index = board[i][j] - '0';
                if (1 <= index && index <= 9) {
                    queues.get(index).add(new Coordinate(i, j));
                    ++answers[index];
                } else if (board[i][j] == '.'){
                    ++blanks;
                }
            }
        }
        bfs(P, blanks, moves);
        String answer = "";
        for (int i=1; i<=P; ++i) {
            answer += answers[i]+" ";
        }
        bw.append(answer);
        bw.flush();
    }

    public static void bfs (int P, int blanks, int [] moves) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean [] end = new boolean [P+1];
        int counter = 0;

        while (blanks > 0 || counter != P) {
            for (int player=1; player<=P; ++player) {
                if (end[player]) {
                    continue;
                }
                for (int move=0; move<moves[player]; ++move) {
                    Queue<Coordinate> queue = queues.get(player);
                    int size = queue.size();
                    for (int i=0; i<size; ++i) {
                        Coordinate c = queue.poll();
                        for (int dir=0; dir<4; ++dir) {
                            int nx = c.x + dx[dir];
                            int ny = c.y + dy[dir];

                            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                                continue;
                            }
                            if (board[nx][ny] == '#') {
                                continue;
                            }
                            if (board[nx][ny] == '.' || board[nx][ny] == (char) (player+'0')) {
                                queue.add(new Coordinate(nx, ny));
                                if (board[nx][ny] == '.') {
                                    board[nx][ny] = (char)(player+'0');
                                    --blanks;
                                    ++answers[player];
                                    if (blanks == 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (queues.get(player).size() == 0 && !end[player]) {
                    end[player] = true;
                    ++counter;
                    if (counter == P) {
                        return;
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
