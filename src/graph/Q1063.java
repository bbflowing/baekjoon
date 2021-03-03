package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1063 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String king = st.nextToken();
        int y = king.charAt(0)-'A';
        int x = 8 - (king.charAt(1)-'0');
        Coordinate k = new Coordinate(x, y);
        String stone = st.nextToken();
        y = stone.charAt(0)-'A';
        x = 8 - (stone.charAt(1)-'0');
        Coordinate s = new Coordinate(x, y);
        //System.out.println(x+","+y);
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> moves = new ArrayList<>();

        for (int i=0; i<N; ++i) {
            String move = br.readLine();
            if (move.equals("R")) {
                moves.add(0);
            } else if (move.equals("L")) {
                moves.add(1);
            } else if (move.equals("B")) {
                moves.add(2);
            } else if (move.equals("T")) {
                moves.add(3);
            } else if (move.equals("RT")) {
                moves.add(4);
            } else if (move.equals("LT")) {
                moves.add(5);
            } else if (move.equals("RB")) {
                moves.add(6);
            } else if (move.equals("LB")) {
                moves.add(7);
            }
        }
        bfs(k, s, moves);
    }

    public static void bfs (Coordinate king, Coordinate stone, ArrayList<Integer> moves) {
        int dx [] = {0, 0, 1, -1, -1, -1, 1, 1};
        int dy [] = {1, -1, 0, 0, 1, -1, 1, -1};
        for (int i=0; i<moves.size(); ++i) {
            int move = moves.get(i);
            int nx = king.x + dx[move];
            int ny = king.y + dy[move];

            if (nx<0 || 8<=nx || ny<0 || 8<=ny) {
                continue;
            }
            if (nx == stone.x && ny == stone.y) {
                int tempx = stone.x + dx[move];
                int tempy = stone.y + dy[move];

                if (tempx<0 || 8<=tempx || tempy<0 || 8<=tempy) {
                    continue;
                }
                stone = new Coordinate(tempx, tempy);
            }
            king = new Coordinate(nx, ny);

        }
        String characters [] = {"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println(characters[king.y]+(8-king.x));
        System.out.println(characters[stone.y]+(8-stone.x));
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x ;
        this.y = y;
    }
}
