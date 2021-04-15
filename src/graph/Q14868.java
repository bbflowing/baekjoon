package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14868 {
    /*
    public static int N;
    public static int input[][];
    public static int groups[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int parents[];
    public static Queue<Coordinate> queue;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new int[N][N];
        groups = new int[N][N];
        for (int k = 0; k < K; ++k) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = N - Integer.parseInt(st.nextToken());
            input[x][y] = 1;
        }
        int counter = 0;
        queue = new LinkedList<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (input[i][j] == 1 && groups[i][j] == 0) {
                    ++counter;
                    groups[i][j] = counter;
                    queue.add(new Coordinate(i, j, counter));
                    grouping(i, j, counter);
                }
            }
        }
        parents = new int[counter + 1];
        for (int i = 1; i < counter + 1; ++i) {
            parents[i] = i;
        }
       bfs(counter + 1);
    }

    public static void bfs(int total) {
        int days = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++days;
            for (int i = 0; i < size; ++i) {
                Coordinate c = queue.poll();
                for (int dir = 0; dir < 4; ++dir) {
                    int nx = c.x + dx[dir];
                    int ny = c.y + dy[dir];

                    if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                        continue;
                    }

                    int group = groups[nx][ny];
                    int parent = parents[groups[c.x][c.y]];

                    if (group == parent) {
                        continue;
                    }

                    int nnx = nx + dx[dir];
                    int nny = ny + dy[dir];
                    if (group == 0) {
                        groups[nx][ny] = parent;
                        if (nnx < 0 || N <= nnx || nny < 0 || N <= nny) {
                            continue;
                        }
                        group = groups[nnx][nny];
                        if (group == 0) {
                            queue.add(new Coordinate(nx, ny, parent));
                        } else {
                            int nparent = parents[group];
                            if (nparent < parent) {
                                groups[nnx][nny] = nparent;
                                parents[groups[c.x][c.y]] = nparent;
                                queue.add(new Coordinate(nnx, nny, nparent));
                                setParent(parent, nparent, total);
                            } else if (parent < nparent) {
                                groups[nnx][nny] = parent;
                                parents[group] = parent;
                                setParent(nparent, parent, total);
                                queue.add(new Coordinate(nnx, nny, parent));
                            }
                        }
                    } else {
                        int change = group;
                        int result = parent;
                        if (parent < group) {
                            groups[nx][ny] = parent;
                            parents[group] = parent;
                        } else if (group < parent) {
                            parents[parent] = group;
                            result = group;
                            change = parent;
                        }
                        setParent(change, result, total);

                        if (nnx < 0 || N <= nnx || nny < 0 || N <= nny) {
                            continue;
                        }
                        group = groups [nnx][nny];
                        if (group == 0) {
                            queue.add(new Coordinate(nx, ny, result));
                        } else {
                            int nparent = parents[group];
                            if (nparent < parent) {
                                groups[nnx][nny] = nparent;
                                parents[parent] = nparent;
                                setParent(nparent, parent, total);
                                queue.add(new Coordinate(nnx, nny, nparent));
                            } else if (parent < nparent) {
                                groups[nnx][nny] = parent;
                                parents[parent] = parent;
                                setParent(nparent, parent, total);
                                queue.add(new Coordinate(nnx, nny, parent));
                            }
                        }
                    }
                }
            }

            int counter = 0;
            for (int j=1; j<=total-2; ++j) {
                if (parents[j] == parents[j+1]) {
                    ++counter;
                }
            }


            if (counter == total-2) {
                System.out.println(days);
                System.exit(0);
            }
        }
    }

    public static void setParent (int original, int change, int total) {
        for (int j=1; j<total; ++j) {
            if (parents[j] == original) {
                parents[j] = change;
            }
        }
    }

    public static void grouping(int x, int y, int counter) {
        for (int dir = 0; dir < 4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                continue;
            }
            if (input[nx][ny] == 0) {
                continue;
            }
            if (groups[nx][ny] == 0) {
                groups[nx][ny] = counter;
                queue.add(new Coordinate(nx, ny, counter));
                grouping(nx, ny, counter);
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int group;

    Coordinate(int x, int y, int group) {
        this.x = x;
        this.y = y;
        this.group = group;
    }
}
 */