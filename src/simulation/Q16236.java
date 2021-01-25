package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16236 {
    public static int input [][];
    public static int sharkX;
    public static int sharkY;
    public static int sharkSize;
    public static ArrayList<Fish> list;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int INF = 987_654_321;
        StringTokenizer st;
        input = new int [N][N];
        list = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 9) {
                    sharkX = i; sharkY = j;
                } else if (input[i][j] != 0) {
                    list.add(new Fish(i, j, input[i][j], INF));
                }
            }
        }
        int answer = 0; int sizeTrack = 0; sharkSize = 2;

        while (list.size() != 0) {
            boolean flag = false;
            int size = list.size();
            for (int i=0; i<size; ++i) {
                Fish next = list.remove(0);
                bfs(N, next);
            }

            Collections.sort(list, new sort());


            for (int i=0; i<list.size(); ++i) {
                if (sharkSize > list.get(i).size) {
                    ++sizeTrack;
                    answer += list.get(i).time;
                    input[sharkX][sharkY] = 0;
                    sharkX = list.get(i).x;
                    sharkY = list.get(i).y;
                    input[sharkX][sharkY] = 9;
                    list.remove(i);
                    flag = true;

                    if (sizeTrack == sharkSize) {
                        ++sharkSize;
                        sizeTrack = 0;
                    }
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }
        System.out.println(answer);
    }

    public static void bfs (int N, Fish dst) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Fish> temp = new LinkedList<>();
        temp.add(new Fish (sharkX, sharkY, sharkSize, 0));
        boolean check [][] = new boolean [N][N];
        while (!temp.isEmpty()) {
            Fish next = temp.poll();
            check[next.x][next.y] = true;
            for (int i=0; i<4; ++i) {
                int newX = next.x + dx[i]; int newY = next.y + dy[i]; int newTime = next.time + 1;
                if (newX == dst.x && newY == dst.y) {
                    list.add(new Fish(dst.x, dst.y, dst.size, newTime));
                    return;
                }

                if (newX < 0 || N <= newX || newY < 0 || N <= newY) {
                    continue;
                }

                if (!check[newX][newY] && input[newX][newY] <= sharkSize) {
                    temp.add(new Fish (newX, newY, sharkSize, newTime));
                }
            }
        }
        list.add(new Fish(dst.x, dst.y, dst.size, dst.time));
    }
}

class Fish {
    int x;
    int y;
    int size;
    int time;

    Fish (int x, int y, int size, int time) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.time = time;
    }
}

class sort implements Comparator<Fish> {
    @Override
    public int compare(Fish f1, Fish f2) {
        if (f1.time > f2.time) {
            return 1;
        } else if (f1.time == f2.time) {
            if (f1.x > f2.x) {
                return 1;
            } else if (f1.x == f2.x) {
                if (f1.y > f2.y) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
