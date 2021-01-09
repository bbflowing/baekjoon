package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3190 {
    public static char input [][];
    public static Queue<Movement> moves;
    public static Deque snake;
    public static Coordinate head;
    public static Coordinate tail;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        input = new char [N][N];
        for (char a[]: input) {
            Arrays.fill(a, 'B');
        }
        StringTokenizer st;
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            input [Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 'A';
        }
        int L = Integer.parseInt(br.readLine());
        moves = new LinkedList<>();
        for (int i=0; i<L; ++i) {
            st = new StringTokenizer(br.readLine());
            moves.add(new Movement(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        input[0][0] = 'S';
        char currentDirection = 'E';
        int currentTime = 0;
        Movement next = moves.poll();
        int nextTime = next.time;
        String nextDirection = next.direction;
        snake = new ArrayDeque();
        snake.addFirst(new Coordinate(0,0));
        head = new Coordinate (0, 0);
        tail = new Coordinate (0, 0);
        boolean flag = false;
        int endTime = 0;


        while (!flag) {
            if (currentTime == nextTime) {
                if (currentDirection == 'E') {
                    if (nextDirection.contentEquals("L")) {
                        currentDirection = 'N';
                    } else {
                        currentDirection = 'S';
                    }
                } else if (currentDirection == 'W') {
                    if (nextDirection.contentEquals("L")) {
                        currentDirection = 'S';
                    } else {
                        currentDirection = 'N';
                    }
                } else if (currentDirection == 'N') {
                    if (nextDirection.contentEquals("L")) {
                        currentDirection = 'W';
                    } else {
                        currentDirection = 'E';
                    }
                } else {
                    if (nextDirection.contentEquals("L")) {
                        currentDirection = 'E';
                    } else {
                        currentDirection = 'W';
                    }
                }
                if (!moves.isEmpty()) {
                    next = moves.poll();
                    nextTime = next.time;
                    nextDirection = next.direction;
                }
            }
            if (currentDirection == 'E') {
                if (0 <= head.x && head.x < N && 0 <= head.y + 1 && head.y + 1 < N) {
                    int newX = head.x;
                    int newY = head.y + 1;
                    flag = move(newX, newY);
                } else {
                    flag = true;
                }
            } else if (currentDirection == 'W') {
                if (0 <= head.x && head.x < N && 0 <= head.y - 1 && head.y - 1 < N) {
                    int newX = head.x;
                    int newY = head.y - 1;
                    flag = move(newX, newY);
                } else {
                    flag = true;
                }
            } else if (currentDirection == 'N') {
                if (0 <= head.x - 1 && head.x - 1 < N && 0 <= head.y && head.y < N) {
                    int newX = head.x - 1;
                    int newY = head.y;
                    flag = move(newX, newY);
                } else {
                    flag = true;
                }
            } else {
                if (0 <= head.x + 1 && head.x + 1 < N && 0 <= head.y && head.y < N) {
                    int newX = head.x + 1;
                    int newY = head.y;
                    flag = move(newX, newY);
                } else {
                    flag = true;
                }
            }

            endTime = ++currentTime;

            if (flag) {
                break;
            }
        }

        System.out.println(endTime);
    }
    public static boolean move (int newX, int newY) {
        if (input[newX][newY] == 'S') {
            return true;
        } else if (input[newX][newY] == 'A') {
            head = new Coordinate(newX, newY);
            snake.addFirst(head);
            input[newX][newY] = 'S';
        } else if (input[newX][newY] == 'B') {
            head = new Coordinate(newX, newY);
            snake.addFirst(head);
            input[newX][newY] = 'S';
            tail = (Coordinate) snake.pollLast();
            input[tail.x][tail.y] = 'B';
        }
        return false;
    }
}

class Movement {
    int time;
    String direction;

    Movement(int time, String direction) {
        this.time = time;
        this.direction = direction;
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}



